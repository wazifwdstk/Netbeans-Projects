package tut6ex7;

import javax.swing.JOptionPane;
public class TUT6EX7 {


    public static void main(String[] args) {
        String prompt = JOptionPane.showInputDialog(null, "Enter your username:","Input",JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "My username is " + prompt, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
