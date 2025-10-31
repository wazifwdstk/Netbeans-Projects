/*Name		: Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus
Matric No.	: DDCS22J008
Date		: 12/10/2023*/
package labskill2q1;

import javax.swing.JOptionPane;
import java.util.Scanner;
      
public class LABSKILL2Q1 {

    
    public static void main(String[] args) {
       
        Scanner s= new Scanner (System.in);
        String widthPrompt = JOptionPane.showInputDialog(null, "Enter the width ", "Input", JOptionPane.QUESTION_MESSAGE);
        int width = Integer.parseInt(widthPrompt);
        
        String lengthPrompt = JOptionPane.showInputDialog(null, "Enter the length ", "Input", JOptionPane.QUESTION_MESSAGE);
        int length = Integer.parseInt(lengthPrompt);
        
        int areaRectangle = width * length;
        
        JOptionPane.showMessageDialog(null,"Width = "+width+
                "\nLength = "+length
                +"\nArea = "+areaRectangle);
        
        
    }
    
}
