package tutorial14ex1;

import javax.swing.JOptionPane;

public class TUTORIAL14EX1 {
  
    public static void main(String[] args) {
        String transactionDetails = "";
        double totalPayment = 0.00;
        double totalQuantity = 0.0;
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

            
            totalPayment += netPrice;
            totalQuantity += quantity;

            
            transactionDetails += "Book Title: " + productNamePrompt + "\n";
            transactionDetails += "Quantity: " + String.format("%.0f", quantity)  + "\n";
            transactionDetails += "Unit Price: RM" + String.format("%.2f", unitPrice) + "\n";
            transactionDetails += "Gross Price: RM" + String.format("%.2f", grossPrice) + "\n";
            transactionDetails += "Discount: RM" + String.format("%.2f", discount) + "\n";
            transactionDetails += "Payment Due: RM" + String.format("%.2f", netPrice) + "\n\n";

            JOptionPane.showMessageDialog(null,"Book Title: " + productNamePrompt+"\nQuantity: "
                                         + String.format("%.0f", quantity)  + "\n"
                                         + "Unit Price: RM" + String.format("%.2f", unitPrice) + "\n"
                                         + "Gross Price: RM" + String.format("%.2f", grossPrice) + "\n"
                                         + "Discount: RM" + String.format("%.2f", discount) + "\n"
                                         + "Payment Due: RM" + String.format("%.2f", netPrice) + "\n\n"
                                         ,"Message", JOptionPane.INFORMATION_MESSAGE );
            
            String continuePrompt = JOptionPane.showInputDialog(null, "Enter 1 - New Transaction" +
                    "\nEnter 2 - End Transaction", "Input", JOptionPane.QUESTION_MESSAGE);
            userChoice = Integer.parseInt(continuePrompt);

        } while (userChoice == 1);

        String ending = "Total Quantity of Books: " + String.format("%.0f", totalQuantity) + "\n";
        ending += "Total Payment: RM" + String.format("%.2f", totalPayment);

        JOptionPane.showMessageDialog(null, transactionDetails + ending, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}

