
package tut5ex3;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TUT5EX3 {

    
    public static void main(String[] args) {
              
        
        String message = "Makcik-makcik bawang";
        
        String title = "Black Onion";
        ImageIcon pictureIcon = new ImageIcon("buruk.png");
        
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE, pictureIcon);
    }
    
}
