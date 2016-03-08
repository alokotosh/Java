package jcomponent;

import javax.swing.*;
import javax.swing.filechooser.FileView;
import java.io.File;
import java.io.FileFilter;

/**
 * Created by kepler23 on 8/31/15.
 */
public class FileIconView extends FileView {
private FileFilter filter;
private  Icon icon;
public  FileIconView(FileFilter aFilter, Icon anIcon)
{
filter = aFilter;
    icon = anIcon;
}
    public Icon getIcon(File f)
    {
        if(!f.isDirectory() && filter.accept(f))

            return icon;
            else return null;
    }
}
