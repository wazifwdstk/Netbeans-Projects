package tut6ex8;

import javax.swing.JOptionPane;

public class TUT6EX8 {

    
    public static void main(String[] args) {
       String prompt = JOptionPane.showInputDialog(null, "Masukkan kad matrik:","Input",JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "No. Kad Matrik Saya: " + prompt, "Kad Matrik", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
