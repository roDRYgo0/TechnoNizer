package javaClass;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class controller {

    public  Icon changeImage(String path, int width, int height){
        ImageIcon original = new ImageIcon(getClass().getResource(path));
        Icon icono = new ImageIcon(original.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        return icono;
    }
    
}
