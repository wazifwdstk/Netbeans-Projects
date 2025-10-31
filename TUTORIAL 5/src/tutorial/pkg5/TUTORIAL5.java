
package tutorial.pkg5;

import java.util.Scanner;


public class TUTORIAL5 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter test mark: ");
        
        double testMark = scanner.nextDouble();
        
       double carryMark = (testMark / 5) ;
       
        scanner.close();
        
         System.out.printf("Your test 1 carry mark is: %.2f%n", carryMark);
    }
}