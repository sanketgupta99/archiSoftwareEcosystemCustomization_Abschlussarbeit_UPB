/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.p2;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

import com.archimatetool.editor.ArchiPlugin;
import com.archimatetool.editor.Logger;
import com.archimatetool.editor.utils.FileUtils;
import com.archimatetool.editor.utils.PlatformUtils;
import com.archimatetool.editor.utils.ZipUtils;


/**
 * @author Phillip Beauvoir
 */
public class DropinsPluginHandler {
    
    private Shell shell;
    
    private File userDropinsFolder, systemDropinsFolder, instanceDropinsFolder;

    private boolean success;
    
    static final int CONTINUE = 0;
    static final int RESTART = 1;
    
    static final String MAGIC_ENTRY = "archi-plugin"; //$NON-NLS-1$
    
    static final String DROPINS_DIRECTORY = "org.eclipse.equinox.p2.reconciler.dropins.directory"; //$NON-NLS-1$
    
    public DropinsPluginHandler() { 
    }

    public List<Bundle> getInstalledPlugins() throws IOException {
        List<Bundle> list = new ArrayList<Bundle>();
        
        for(Bundle bundle : ArchiPlugin.INSTANCE.getBundle().getBundleContext().getBundles()) {
            File file = getDropinsBundleFile(bundle);
            if(file != null) {
                list.add(bundle);
            }
        }
        
        return list;
    }
    
    public int install(Shell shell) throws IOException {
        this.shell = shell;
        
        if(!checkCanWriteToFolder(getDefaultDropinsFolder())) {
            return status();
        }
        
        List<File> files = askOpenFiles();
        if(files.isEmpty()) {
            return status();
        }
        
        List<IStatus> stats = new ArrayList<IStatus>();
        
        Exception[] exception = new Exception[1];
        
        BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
            @Override
            public void run() {
                for(File file : files) {
                    try {
                        IStatus status = installFile(file);
                        stats.add(status);
                    }
                    catch(IOException ex) {
                        exception[0] = ex;
                    }
                }
            }
        });
        
        if(exception[0] != null) {
            displayErrorDialog(exception[0].getMessage());
            return status();
        }
            
        String resultMessage = ""; //$NON-NLS-1$
        boolean hasError = false;
        
        for(int i = 0; i < stats.size(); i++) {
            IStatus status = stats.get(i);
            
            if(status.isOK()) {
                success = true;
                resultMessage += NLS.bind(Messages.DropinsPluginHandler_2 + "\n", files.get(i).getName()); //$NON-NLS-1$
            }
            else {
                hasError = true;
                
                if(status.getCode() == 666) {
                    resultMessage += NLS.bind(Messages.DropinsPluginHandler_3 + "\n", files.get(i).getName()); //$NON-NLS-1$
                }
                else {
                    resultMessage += NLS.bind(Messages.DropinsPluginHandler_4 + "\n", files.get(i).getName()); //$NON-NLS-1$
                }
            }
        }
        
        if(hasError) {
            MessageDialog.openInformation(shell, Messages.DropinsPluginHandler_5, resultMessage);
        }
        
        return status();
    }
    
    private IStatus installFile(File zipFile) throws IOException {
        if(!isPluginZipFile(zipFile)) {
            return new Status(IStatus.ERROR, "com.archimatetool.editor", 666, //$NON-NLS-1$
                    NLS.bind(Messages.DropinsPluginHandler_6, zipFile.getAbsolutePath()), null);
        }
            
        Path tmp = Files.createTempDirectory("archi"); //$NON-NLS-1$
        File tmpFolder = tmp.toFile();
        
        try {
            ZipUtils.unpackZip(zipFile, tmpFolder);
            
            File pluginsFolder = getDefaultDropinsFolder();
            pluginsFolder.mkdirs();

            for(File file : tmpFolder.listFiles()) {
                // Ignore the magic entry file
                if(MAGIC_ENTRY.equalsIgnoreCase(file.getName())) {
                    continue;
                }
                
                // Delete old plugin on exit in target plugins folder
                deleteOlderPluginOnExit(file, pluginsFolder);

                // Copy new ones
                if(file.isDirectory()) {
                    FileUtils.copyFolder(file, new File(pluginsFolder, file.getName()));
                }
                else {
                    FileUtils.copyFile(file, new File(pluginsFolder, file.getName()), false);
                }
            }
        }
        finally {
            FileUtils.deleteFolder(tmpFolder);
        }

        return new Status(IStatus.OK, "com.archimatetool.editor", 777, NLS.bind(Messages.DropinsPluginHandler_0, zipFile.getPath()), null); //$NON-NLS-1$
    }

    public int uninstall(Shell shell, List<Bundle> selected) throws IOException {
        if(selected.isEmpty()) {
            return status();
        }
        
        boolean ok = MessageDialog.openQuestion(shell,
                Messages.DropinsPluginHandler_7,
                Messages.DropinsPluginHandler_8);
        
        if(!ok) {
            return status();
        }
        
        for(Bundle bundle : selected) {
            File file = getDropinsBundleFile(bundle);
            if(file != null) {
                addFileToDeleteOnExit(file);
            }
            else {
                Logger.logError(NLS.bind(Messages.DropinsPluginHandler_1, bundle.getLocation()));
            }
        }
        
        success = true;
        
        return status();
    }
    
    private int status() {
        if(success) {
            return RESTART;
        }
        
        return CONTINUE;
    }
    
    // Delete matching older plugin
    private void deleteOlderPluginOnExit(File newPlugin, File pluginsFolder) {
        for(File file : findMatchingPlugins(pluginsFolder, newPlugin)) {
            addFileToDeleteOnExit(file);
        }
    }
    
    private File[] findMatchingPlugins(File pluginsFolder, File newPlugin) {
        String pluginName = getPluginName(newPlugin.getName());
        
        return pluginsFolder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                String targetPluginName = getPluginName(file.getName());
                return targetPluginName.equals(pluginName) && !newPlugin.getName().equals(file.getName());
            }
        });
    }
    
    String getPluginName(String string) {
        int index = string.indexOf("_"); //$NON-NLS-1$
        if(index != -1) {
            string = string.substring(0, index);
        }
        
        return string;
    }

    String getPluginVersion(String string) {
        int index = string.lastIndexOf(".jar"); //$NON-NLS-1$
        if(index != -1) {
            string = string.substring(0, index);
        }
        
        index = string.lastIndexOf("_"); //$NON-NLS-1$
        if(index != -1) {
            string = string.substring(index + 1);
        }
        
        return string;
    }

    private boolean checkCanWriteToFolder(File folder) {
        folder.mkdirs();
        
        if(!Files.isWritable(folder.toPath())) {
            String message = Messages.DropinsPluginHandler_9 + " "; //$NON-NLS-1$
            
            if(PlatformUtils.isWindows()) {
                message += Messages.DropinsPluginHandler_10;
            }
            else {
                message += Messages.DropinsPluginHandler_11;
            }
            
            displayErrorDialog(message);
            
            return false;
        }
        
        return true;
    }

    boolean isPluginZipFile(File file) throws IOException {
        return ZipUtils.isZipFile(file) && ZipUtils.hasZipEntry(file, MAGIC_ENTRY);
    }
    
    private File getDefaultDropinsFolder() throws IOException {
        // Get user dropins folder as set in Archi.ini
        File dropinsFolder = getUserDropinsFolder();
        
        // Else get the instance dropins folder as set in osgi.instance.area
        if(dropinsFolder == null) {
            dropinsFolder = getInstanceDropinsFolder();
        }
        
        // Else get the dropins folder as the "dropins" folder in the app installation directory
        if(dropinsFolder == null) {
            dropinsFolder = getSystemDropinsFolder();
        }
        
        return dropinsFolder;
    }
    
    private File getUserDropinsFolder() {
        if(userDropinsFolder == null) {
            // If the dropins dir is set in Archi.ini
            String dropinsDirProperty = ArchiPlugin.INSTANCE.getBundle().getBundleContext().getProperty(DROPINS_DIRECTORY);
            if(dropinsDirProperty != null) {
                // Perform a variable substitution if necessary of %% tokens
                dropinsDirProperty = substituteVariables(dropinsDirProperty);
                userDropinsFolder = new File(dropinsDirProperty);
            }
        }
        
        return userDropinsFolder;
    }
    
    private File getInstanceDropinsFolder() throws IOException {
        if(instanceDropinsFolder == null) {
            URL url = Platform.getInstanceLocation().getURL();
            url = FileLocator.resolve(url);
            instanceDropinsFolder = new File(url.getPath(), "dropins"); //$NON-NLS-1$
        }
        
        return instanceDropinsFolder;
    }
    
    private File getSystemDropinsFolder() throws IOException {
        if(systemDropinsFolder == null) {
            URL url = Platform.getInstallLocation().getURL();
            url = FileLocator.resolve(url);
            systemDropinsFolder = new File(url.getPath(), "dropins"); //$NON-NLS-1$
        }
        
        return systemDropinsFolder;
    }
    
    /**
     * This is taken From org.eclipse.equinox.internal.p2.reconciler.dropins.Activator
     * When the dropins folder contains %% tokens, treat this as a system property.
     * Example - %user.home%
     */
    private String substituteVariables(String path) {
        if(path == null) {
            return path;
        }
        
        int beginIndex = path.indexOf('%');
        
        // no variable
        if(beginIndex == -1) {
            return path;
        }
        
        beginIndex++;
        
        int endIndex = path.indexOf('%', beginIndex);
        // no matching end % to indicate variable
        if(endIndex == -1) {
            return path;
        }
        
        // get the variable name and do a lookup
        String var = path.substring(beginIndex, endIndex);
        if(var.length() == 0 || var.indexOf(File.pathSeparatorChar) != -1) {
            return path;
        }
        
        var = ArchiPlugin.INSTANCE.getBundle().getBundleContext().getProperty(var);
        if(var == null) {
            return path;
        }
        
        return path.substring(0, beginIndex - 1) + var + path.substring(endIndex + 1);
    }
    
    /**
     * If the bundle is in one of the "dropins" folders return its file (jar or folder), else return null
     */
    File getDropinsBundleFile(Bundle bundle) throws IOException {
        File bundleFile = FileLocator.getBundleFile(bundle);
        File parentFolder = bundleFile.getParentFile();
        return (parentFolder.equals(getUserDropinsFolder())
                || parentFolder.equals(getInstanceDropinsFolder()) 
                || parentFolder.equals(getSystemDropinsFolder())) ? bundleFile : null;
    }

    private List<File> askOpenFiles() {
        FileDialog dialog = new FileDialog(shell, SWT.OPEN | SWT.MULTI);
        dialog.setFilterExtensions(new String[] { "*.archiplugin", "*.zip", "*.*" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        String path = dialog.open();
        
        // TODO: Bug on Mac 10.12 and newer - Open dialog does not close straight away
        // See https://bugs.eclipse.org/bugs/show_bug.cgi?id=527306
        if(path != null && PlatformUtils.isMac()) {
            while(Display.getCurrent().readAndDispatch());
        }
        
        List<File> files = new ArrayList<File>();
        
        if(path != null) {
            for(String name : dialog.getFileNames()) {
                String filterPath = dialog.getFilterPath();
                filterPath += File.separator; // Issue on OpenJDK if path is like C: or D: - no slash is added when creating File
                files.add(new File(filterPath, name));
            }
        }
        
        return files;
    }
    
    private void displayErrorDialog(String message) {
        MessageDialog.openError(shell,
                Messages.DropinsPluginHandler_12,
                message);
    }
    
    /*
     * Plug-in File cleanup deletion handling.
     * Because Mac doesn't call File#deleteOnExit() or a Shutdown hook on a Restart we have to do it this way.
     * When a plug-in file or folder is marked for deletion it is added to the list of files to delete.
     */
    private static Set<File> filesToDelete;
    
    private void addFileToDeleteOnExit(File file) {
        if(filesToDelete == null) {
            filesToDelete = new HashSet<>();
            
            // Mac does not call shutdown hooks on a Restart so delete files on Workbench shutdown
            if(PlatformUtils.isMac() && PlatformUI.isWorkbenchRunning()) {
                PlatformUI.getWorkbench().addWorkbenchListener(new IWorkbenchListener() {
                    @Override
                    public boolean preShutdown(IWorkbench workbench, boolean forced) {
                        return true;
                    }
                    
                    @Override
                    public void postShutdown(IWorkbench workbench) {
                        deleteFiles();
                    }
                });
            }
            // Else add a shutdown hook to delete files after Java has exited
            else {
                Runtime.getRuntime().addShutdownHook(new Thread(() -> deleteFiles()));
            }
        }
        
        filesToDelete.add(file);
    }
    
    private static void deleteFiles() {
        try {
            for(File file : filesToDelete) {
                if(file.isDirectory()) {
                    recursiveDelete(file);
                }
                else {
                    file.delete();
                }
            }
        }
        catch(Exception ex) {
            Logger.logError("Error deleting file", ex); //$NON-NLS-1$
        }
    }
    
    private static void recursiveDelete(File file) throws IOException {
        Files.walkFileTree(file.toPath(), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }
            
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                if(exc != null) {
                    throw exc;
                }
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
