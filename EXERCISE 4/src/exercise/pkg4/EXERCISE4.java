
package exercise.pkg4;

import javax.swing.JOptionPane;


public class EXERCISE4 {

    public static void main(String[] args) {
        
        double penPrice = 4.59;
        double eraserPrice = 0.80;
        
       
        
        
        System.out.println("Pen Price: RM" +penPrice );
        System.out.println("Eraser Price: RM" +eraserPrice);
       
        double discount = 0.30; 

        
        double totalBeforeDiscount = penPrice + eraserPrice;
        double totalAfterDiscount = totalBeforeDiscount - (totalBeforeDiscount * discount);
        
        String totalMessage = String.format("Total Before Discount: RM %.2f%n", totalBeforeDiscount);
        String discountedTotalMessage = String.format("Total After Discount: RM %.2f%n", totalAfterDiscount);

        System.out.print(totalMessage);
        System.out.print(discountedTotalMessage);

        JOptionPane.showMessageDialog(null, "Thank You for Buying with Popular Book", "Popular Book", JOptionPane.PLAIN_MESSAGE);
       
    }
}
    
    

