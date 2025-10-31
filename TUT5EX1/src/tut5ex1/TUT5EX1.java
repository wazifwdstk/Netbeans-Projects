
package tut5ex1;


import javax.swing.JOptionPane;
public class TUT5EX1 {

   
    public static void main(String[] args) {
        
        String message = "My name is Wazif Al-Idrus \n"
                        + "I like this subject \n"
                        + "My birthday is 22 Sep";
        
        String title = "Kejadian dalam Panggung Wayang";
        
        
        JOptionPane.showMessageDialog(null, message, title,JOptionPane.PLAIN_MESSAGE);
    }
    
}
