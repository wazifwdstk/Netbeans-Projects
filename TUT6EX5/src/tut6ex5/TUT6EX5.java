package tut6ex5;

import javax.swing.JOptionPane;

public class TUT6EX5 {

    public static void main(String[] args) {
       String message = JOptionPane.showInputDialog(null, "Input your datae of birth", JOptionPane.QUESTION_MESSAGE);
       
        System.out.println(message);
       
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
