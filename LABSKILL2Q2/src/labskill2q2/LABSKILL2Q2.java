
package labskill2q2;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class LABSKILL2Q2 {

    
    public static void main(String[] args) {
         Scanner s= new Scanner (System.in);
        
        String productNamePrompt = JOptionPane.showInputDialog(null, "Enter product name ", "Input", JOptionPane.QUESTION_MESSAGE);
        
        
        String pricePrompt = JOptionPane.showInputDialog(null, "Enter unit price ", "Input", JOptionPane.QUESTION_MESSAGE);
        double unitPrice = Double.parseDouble(pricePrompt);
        
        double tax = unitPrice * 0.06;
        double netPrice = unitPrice + tax;
        
       JOptionPane.showMessageDialog(
                                         null, "Gross Price = RM" + String.format("%.2f", unitPrice) +
                                         "\nTax : RM " + String.format("%.2f", tax) +
                                         "\nPayment Due : RM" + String.format("%.2f", netPrice),
                                         "Message", JOptionPane.INFORMATION_MESSAGE);  
        
    }  
}
 