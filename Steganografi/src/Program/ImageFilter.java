package Program;

import java.io.File;
import javax.swing.filechooser.*;

public class ImageFilter extends FileFilter {

    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String extension = Utilities.getExtension(f);
        if (extension != null) {
            if (extension.equals(Utilities.tiff) ||
                extension.equals(Utilities.tif) ||
                extension.equals(Utilities.gif) ||
                extension.equals(Utilities.jpeg) ||
                extension.equals(Utilities.jpg) ||
                extension.equals(Utilities.png)) {
                    return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public String getDescription() {
        return "Image";
    }
}