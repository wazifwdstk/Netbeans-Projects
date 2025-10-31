
package labskill2q4;

import javax.swing.JOptionPane;
public class LABSKILL2Q4 {

    
    public static void main(String[] args) {
       
        String agePrompt = JOptionPane.showInputDialog(null, "Enter Age : ", "Input", JOptionPane.QUESTION_MESSAGE);
       int age = Integer.parseInt(agePrompt);
        
        if (age >= 21){
           JOptionPane.showMessageDialog(null, "CAN VOTE", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "CANNOT VOTE", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
