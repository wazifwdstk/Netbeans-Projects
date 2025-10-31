
package tut6ex12;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TUT6EX12 {

   
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("turtle.png");
        
        int answer = JOptionPane.showConfirmDialog(null, "Kura-kura ni comel tak?", "Animal Beauty", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon);
        
        System.out.println(answer);
    }
    
}
