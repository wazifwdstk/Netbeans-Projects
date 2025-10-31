
package labskill2q5;

import javax.swing.JOptionPane;
public class LABSKILL2Q5 {

   
    public static void main(String[] args) {
        
        String numPrompt = JOptionPane.showInputDialog(null, "Enter Number: ", "Message", JOptionPane.QUESTION_MESSAGE);
        int num = Integer.parseInt(numPrompt);
        String whatever = "";
        
        for(int i = 0; i<=num; i++){
             whatever+= "Number: " +i + "\n";
        }
        JOptionPane.showMessageDialog(null,"" + whatever, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
