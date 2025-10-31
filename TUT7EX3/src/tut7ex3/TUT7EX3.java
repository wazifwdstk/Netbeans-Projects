package tut7ex3;

import java.util.Scanner;
public class TUT7EX3 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:  ");
        int number = scanner.nextInt();
        
        if(number <0){
            System.out.println("The number is negative.");
        }
        else if(number >0){
            System.out.println("The number is postive.");
           
        }
        else{
            System.out.println("The number is 0. ");
        }
    }
    
}
