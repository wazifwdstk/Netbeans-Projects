/*Name		: Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus
Matric No.	: DDCS22J008
Date		: 12/10/2023*/
package labskill2q3;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class LABSKILL2Q3 {

    
    public static void main(String[] args) {
         Scanner s= new Scanner (System.in);
        
        String productNamePrompt = JOptionPane.showInputDialog(null, "Enter book title", "Input", JOptionPane.QUESTION_MESSAGE);
        
        String quantityPrompt = JOptionPane.showInputDialog(null, "Enter Quantity ", "Input", JOptionPane.QUESTION_MESSAGE);
        double quantity = Double.parseDouble(quantityPrompt);
        
        String pricePrompt = JOptionPane.showInputDialog(null, "Enter Unit Price ", "Input", JOptionPane.QUESTION_MESSAGE);
        double unitPrice = Double.parseDouble(pricePrompt);
        
        double grossPrice = unitPrice * quantity;
        double discount = grossPrice * 0.1;
        double netPrice = grossPrice - discount;
        
       JOptionPane.showMessageDialog(
                                         null, "Gross Price = RM" + String.format("%.2f",grossPrice) +
                                         "\nDiscount : RM " + String.format("%.2f", discount) +
                                         "\nPayment Due : RM" + String.format("%.2f", netPrice),
                                         "Message", JOptionPane.INFORMATION_MESSAGE);

        
        
    }
    
}
