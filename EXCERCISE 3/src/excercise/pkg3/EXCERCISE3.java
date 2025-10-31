
package excercise.pkg3;
import javax.swing.JOptionPane;


public class EXCERCISE3 {

   
    public static void main(String[] args) {
        
        

        String inputPrice = JOptionPane.showInputDialog("Enter price hand bag: RM");
        
        try {
            
            double handbagPrice = Double.parseDouble(inputPrice);
            
           
            double GST_Tax = 0.06; 
            double totalPri = handbagPrice * (1 + GST_Tax);
            
            
            
            String message = "Total Price: RM" + totalPri;
            
            JOptionPane.showMessageDialog(null, message, "Total Price:  ", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            
           
        }
    }
}
