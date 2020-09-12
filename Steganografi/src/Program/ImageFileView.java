package Program;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.*;

public class ImageFileView extends FileView {
    ImageIcon jpgIcon = Utilities.createImageIcon("jpgIcon.gif");
    ImageIcon gifIcon = Utilities.createImageIcon("gifIcon.gif");
    ImageIcon tiffIcon = Utilities.createImageIcon("tiffIcon.gif");
    ImageIcon pngIcon = Utilities.createImageIcon("pngIcon.png");

    @Override
    public String getName(File f) {
        return null; 
    }

    @Override
    public String getDescription(File f) {
        return null; 
    }

    @Override
    public Boolean isTraversable(File f) {
        return null; 
    }

    @Override
    public String getTypeDescription(File f) {
        String extension = Utilities.getExtension(f);
        String type = null;
        if (extension != null) {
            if (extension.equals(Utilities.jpeg) ||
                extension.equals(Utilities.jpg)) {
                type = "JPEG Image";
            } else if (extension.equals(Utilities.gif)){
                type = "GIF Image";
            } else if (extension.equals(Utilities.tiff) ||
                       extension.equals(Utilities.tif)) {
                type = "TIFF Image";
            } else if (extension.equals(Utilities.png)){
                type = "PNG Image";
            }
        }
        return type;
    }

    @Override
    public Icon getIcon(File f) {
        String extension = Utilities.getExtension(f);
        Icon icon = null;
        if (extension != null) {
            if (extension.equals(Utilities.jpeg) ||
                extension.equals(Utilities.jpg)) {
                icon = jpgIcon;
            } else if (extension.equals(Utilities.gif)) {
                icon = gifIcon;
            } else if (extension.equals(Utilities.tiff) ||
                       extension.equals(Utilities.tif)) {
                icon = tiffIcon;
            } else if (extension.equals(Utilities.png)) {
                icon = pngIcon;
            }
        }
        return icon;
    }
}