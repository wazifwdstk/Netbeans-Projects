package tutorial11exercise5;

import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TUTORIAL11EXERCISE5 {
    
    public static void main(String[] args) {
          String fullName = "Wazif Al-Idrus";
       
        JOptionPane.showMessageDialog(null,
                "Wazif Al-Idrus Multiplication Table",
                "Welcome Message",
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon("enterData.png")); 
       
        String sifirInput = JOptionPane.showInputDialog(null,
                "Masukkan sifir berapa : ",
                "Question",
                JOptionPane.QUESTION_MESSAGE);
        
        int sifir = Integer.parseInt(sifirInput);
        
        Scanner kiraSifir = new Scanner(System.in);
        System.out.print("Pengiraan sifir sehingga (1-12) : ");
        int lengthOfSifir = kiraSifir.nextInt();

        kiraSifir.close();

        if (lengthOfSifir >= 1 && lengthOfSifir <= 12) {
            
            StringBuilder multiplicationTable = new StringBuilder();
            multiplicationTable.append("Multiplication Table for ").append(sifir).append("\n");
            for (int count = 1; count <= lengthOfSifir; count++) {
                multiplicationTable.append(sifir).append(" x ").append(count).append(" = ").append(sifir * count).append("\n");
            }
            JOptionPane.showMessageDialog(null,
                    multiplicationTable.toString(),
                    "Multiplication Table",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
          
            JOptionPane.showMessageDialog(null,
                    "Pengiraan Sifir yang dimasukkan bukanlah di dalam range 1-12 !!",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
    }
   }   
}
