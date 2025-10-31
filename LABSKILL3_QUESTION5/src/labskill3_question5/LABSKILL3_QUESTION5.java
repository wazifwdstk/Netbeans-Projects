/*Name		: Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus
Matric No.	: DDCS22J008
Date		: 12/10/2023*/
package labskill3_question5;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LABSKILL3_QUESTION5 {

    
    public static void main(String[] args) {
        int maxBooks = 5; // 5 buku sahaja
        String[] bookTitles = new String[maxBooks];
        int[] quantities = new int[maxBooks];
        double[] unitPrices = new double[maxBooks];
        double totalPayment = 0;
        double totalGrossPrice = 0;
        double totalDiscount = 0;
        double totalPaymentDue = 0;

        for (int i = 0; i < maxBooks; i++) {
            // masuk book title
            String title = JOptionPane.showInputDialog("Enter the title of book: ");
            if (title == null) {
                break; 
            }
            bookTitles[i] = title;

            // masuk quantity
            String quantityStr = JOptionPane.showInputDialog("Enter the quantity: ");
            if (quantityStr == null) {
                break;
            }
            int quantity = Integer.parseInt(quantityStr);
            quantities[i] = quantity;

            // masuk unit price
            String unitPriceStr = JOptionPane.showInputDialog("Enter the unit price:  ");
            if (unitPriceStr == null) {
                break;
            }
            double unitPrice = Double.parseDouble(unitPriceStr);
            unitPrices[i] = unitPrice;

            // Calculate payment due
          double grossPrice = quantity * unitPrice;
          double discount = grossPrice * 0.1; 
          
          

           totalDiscount += discount;
           totalGrossPrice += grossPrice;
           double paymentDue = grossPrice - discount;
           totalPaymentDue += paymentDue;
            
           JOptionPane.showMessageDialog(null, "Book Title: " + title +
                           "\nGross Price: RM" + String.format("%.2f", grossPrice) +
                           "\nDiscount: RM" + String.format("%.2f", discount) +
                           "\nTotal Payment Due: RM" + String.format("%.2f", totalPaymentDue));

        }

        // Display final result
            double averagePaymentDue= totalPaymentDue / 5;
            
                    
            JOptionPane.showMessageDialog(null, "Average Payment Due: RM" + String.format("%.2f", averagePaymentDue)
                                 + "\nTotal Gross Price: RM" + String.format("%.2f", totalGrossPrice)
                                 + "\nTotal Discount = RM" + String.format("%.2f", totalDiscount)
                                 + "\nTotal Payment Due = RM" + String.format("%.2f", totalPaymentDue));

    }
    
}
