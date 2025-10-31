
package corrections.question.pkg4;

import java.util.Scanner;
public class CorrectionsQuestion4 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:  ");
        int number = scanner.nextInt();
        
        scanner.close();
        
        if(number <0){
            System.out.print("The number is negative.");
        }
        else if(number >0){
            System.out.print("The number is postive.");
           
        }
        else{
            System.out.print("The number is 0. ");
        }
    }
    
}
