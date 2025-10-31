/*Name		: Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus
Matric No.	: DDCS22J008
Date		: 12/10/2023*/
package labskill3_question4;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class LABSKILL3_QUESTION4 {

   
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        
         String prompt = "Enter first number : ";
         
        String Enter = JOptionPane.showInputDialog(null, prompt , "Input", JOptionPane.QUESTION_MESSAGE);
        int input = Integer.parseInt(Enter);
        
        for (int i = 1; i <= input; i++) { //for looping number of digits displayed.
                
                for (int space = 1; space <= input - i; space++) {
                    System.out.print("  "); //coding spaces
                }
                
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " "); //regular number countdown code
                }
                System.out.println();
    }
}
}