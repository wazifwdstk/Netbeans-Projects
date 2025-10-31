
package tutorial.pkg11.exercise.pkg1;

import java.util.Scanner;


public class TUTORIAL11EXERCISE1 {

    
    public static void main(String[] args) {
        String fullName = "Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus";

       
        System.out.println(fullName);

       
        Scanner masuknombor = new Scanner(System.in);

        int sum = 0; 

        
        for (int count = 1; count <= 5; count++) {
            System.out.print("Input " + count + ": ");
            
            
            int number = masuknombor.nextInt();
            
            
            sum += number;
            
            
            System.out.println("Jumlah Semasa: " + sum);
        }

        
        masuknombor.close();

        
        System.out.println("Jumlah Keseluruhan: " + sum);
    }
}
    
    

