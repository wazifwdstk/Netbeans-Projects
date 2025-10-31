
package tut12ex2;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class TUT12EX2 {

   
    public static void main(String[] args) {
        
        String fullName = "Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus";
        JOptionPane.showMessageDialog(null, fullName,"Message", JOptionPane.INFORMATION_MESSAGE);
        
        Scanner s = new Scanner(System.in);
        
        int count= 1;
        int sum = 0;
        int currentSum =0;
        
        while (count <=5){
            System.out.println("Enter number " +count + " : ");
            int number = s.nextInt();
            
            currentSum = sum + number;
            sum = number + sum;

            System.out.println("current sum : " + currentSum);
            
           count++;
        
    }
           System.out.println("\nFinal Sum = " +currentSum);
           
           int avg = currentSum / 5;
           System.out.println("Average = " +avg);
        
    }
    
}
