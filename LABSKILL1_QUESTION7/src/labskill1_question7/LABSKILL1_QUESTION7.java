/*Lab Skill 1 - Question 7
Name		: SYED AHMAD WAZIF BIN SYED AHMAD MUNIF AL-IDRUS
Matric No.	: DDCS22J008
Date		: 7 September 2023*/

package labskill1_question7;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class LABSKILL1_QUESTION7 {

    
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in);
    
     System.out.print("Enter the price of a pen: ");
        double penPrice = scanner.nextDouble();
        
      System.out.print("Enter the quantity of a pen: ");
        double penQuantity = scanner.nextDouble();
        
      double totalPrice = penQuantity * penPrice;
      
      scanner.close();
      
      JOptionPane.showMessageDialog(null,
                String.format("Total Price: %.2f", totalPrice),
                "Total Price",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
