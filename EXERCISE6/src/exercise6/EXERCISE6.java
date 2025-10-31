package exercise6;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class EXERCISE6 {

    
    public static void main(String[] args) {
        double hazelnutLattePrice, oreoCookiesPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Hazelnut Latte Price: RM ");
        hazelnutLattePrice = scanner.nextDouble();

        System.out.print("Enter Oreo Cookies Price: RM ");
        oreoCookiesPrice = scanner.nextDouble();

        System.out.printf("Hazelnut Latte Price is RM %.2f\n", hazelnutLattePrice);
        System.out.printf("Oreo Cookies Price is RM %.2f\n", oreoCookiesPrice);

        double discount = 0.60;

        double totalBeforeDiscount = hazelnutLattePrice + oreoCookiesPrice;
        
        double totalAfterDiscount = totalBeforeDiscount - (totalBeforeDiscount * discount);

        System.out.printf("Sub Total: RM %.2f\n", totalBeforeDiscount);

        System.out.printf("Total: RM %.2f\n", totalAfterDiscount);

        ImageIcon icon = new ImageIcon("cute.png");
        JOptionPane.showMessageDialog(null, "Thank You for Buying with Tea Live", "Tea Live", JOptionPane.PLAIN_MESSAGE, icon);
    }
    
}
