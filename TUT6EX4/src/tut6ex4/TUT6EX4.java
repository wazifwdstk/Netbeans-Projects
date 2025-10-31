package tut6ex4;
import javax.swing.JOptionPane;

public class TUT6EX4 {

    public static void main(String[] args) {
       
        String message = JOptionPane.showInputDialog(null, "What is your full name?", JOptionPane.WARNING_MESSAGE);
       
        System.out.println(message);
       
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}

