package tutorial.pkg11.exercise.pkg2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class TUTORIAL11EXERCISE2 {
    
    public static void main(String[] args) {
        
        ImageIcon iconEnter = new ImageIcon ("enterData.png");
        ImageIcon iconFinal = new ImageIcon ("finalData.png");
        ImageIcon iconOutput = new ImageIcon ("outputData.png");
        
        String fullName = "Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus";

        JOptionPane.showMessageDialog(null,
                "Welcome to " + fullName + " Calculator System",
                "Welcome Message",
                JOptionPane.PLAIN_MESSAGE, iconEnter); 
                
        int sum = 0; 
        int input;
       
        for (int count = 1; count <= 5; count++) {
            
            input = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Input " + count + ":",
                    "Calculator",
                    JOptionPane.QUESTION_MESSAGE));

            sum += input;
           
            JOptionPane.showMessageDialog(null,
                    "Jumlah Semasa: " + sum,
                    "Output",
                    JOptionPane.PLAIN_MESSAGE, iconOutput);
        }
        
        double average = (double) sum / 5;

        JOptionPane.showMessageDialog(null,
                "Jumlah Keseluruhan: " + sum + "\n" +
                        "Purata: " + average,
                "Final Result",
                JOptionPane.PLAIN_MESSAGE, iconFinal);  
    }
}
        
    
    

