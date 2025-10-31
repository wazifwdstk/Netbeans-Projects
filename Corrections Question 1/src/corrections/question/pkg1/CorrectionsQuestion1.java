
package corrections.question.pkg1;

import javax.swing.JOptionPane;

public class CorrectionsQuestion1 {

    
    public static void main(String[] args) {
        //String prompt = JOptionPane.showInputDialog(null, "Enter the radius of the circle", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        //double radius = Double.parseDouble(prompt);
        
        String message = "William Shakespeare was born \n"
                          + "on April 23 1564 in \n "
                          +"Stratford-on-Avon near London.";
        
        String title = "Dialog";
        
       JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
        
        
    }
    
}
