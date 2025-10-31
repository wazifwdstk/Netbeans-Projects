
package tut12ex5;

import java.util.Scanner;



public class TUT12EX5 {

   
    public static void main(String[] args) {
       String fullName = "Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus \n";
       System.out.println(fullName);
       int count = 0;
       Scanner s = new Scanner(System.in);
       
      
       
       do{
           
            System.out.print("Enter number (1 - 10) : ");
            int num = s.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("You entered an invalid number ");
            } else if (num == 5) {
                break;
            } else {
                System.out.println("Your number entered is " + num);
                count++;
            }

        } while (count < 5);

        System.out.println("Done Exercise 5");
        System.out.print("I love Marvel.");
    }
    
}
