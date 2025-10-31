
package labskillq6;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class LABSKILLQ6 {

    
    public static void main(String[] args) {
         Scanner s= new Scanner (System.in);
        
          int userChoice;

        do {
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
       
        String continuePrompt = JOptionPane.showInputDialog(null, "Enter 1 - New Transaction"+
                                                            "\nEnter 2 - End Transaction", "Input", JOptionPane.QUESTION_MESSAGE);
        userChoice = Integer.parseInt(continuePrompt);

        }while(userChoice == 1);
        
    }
    
}
