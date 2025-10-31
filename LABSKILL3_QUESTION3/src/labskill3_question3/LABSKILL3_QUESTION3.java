/*Name		: Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus
Matric No.	: DDCS22J008
Date		: 12/10/2023*/
package labskill3_question3;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class LABSKILL3_QUESTION3 {

    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        
         String prompt = "Enter first number : ";
         
        String Enter = JOptionPane.showInputDialog(null, prompt , "Input", JOptionPane.QUESTION_MESSAGE);
        int input = Integer.parseInt(Enter);
        
                   // if (input >0), i++;
            
           for (int i = input; i >= 1; i--) { //ini untuk make countdown
                for (int j = i; j >= 1; j--) { //make sure dia start balik from (input -1)
                    System.out.print(j + " ");
                  }
                System.out.println();
            s.close();
    }
   }
}

