/*Name		: Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus
Matric No.	: DDCS22J008
Date		: 12/10/2023*/
package labskill3_question2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LABSKILL3_QUESTION2 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
         String prompt = "Enter first number : ";
         
        String Enter = JOptionPane.showInputDialog(null, prompt , "Input", JOptionPane.QUESTION_MESSAGE);
        int input = Integer.parseInt(Enter);
        
        
        for(int i = 1; i <= input; i++){            
            for(int j = 1; j <= i; j++){
            
            System.out.print(j);}
            System.out.println();
           }
    }
    
}
