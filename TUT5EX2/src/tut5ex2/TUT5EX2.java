
package tut5ex2;

import javax.swing.JOptionPane;


public class TUT5EX2 {

    public static void main(String[] args) {
        
        String message = "Hari ini saya tengok cerita hantu Conjuring \n"
                        + "Cerita itu agak seram \n"
                        + "Orang depan menjerit \n"
                        + "Saya pun takut \n"
                        + "Terbalik popcorn saya";
        
        String title = "Kejadian dalam Panggung Wayang";
        
        
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
    }
    
}
