package tut7ex4;
import java.util.Scanner;
public class TUT7EX4 {

   
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Input 1st number: ");
        int num1 = s.nextInt();
        System.out.print("Input 2nd number: ");
        int num2 = s.nextInt();
        System.out.print("Input 3rd number: ");
        int num3 = s.nextInt();
        
        if(num1 >num2 && num1>num3){
            System.out.println("The Greatest: " +num1);
        }
        else if(num2> num1 && num2> num3){
            System.out.println("The Greatest: " +num2);
        }
        else{
            System.out.println("The Greatest: " +num3);
        }
    }
    
}
