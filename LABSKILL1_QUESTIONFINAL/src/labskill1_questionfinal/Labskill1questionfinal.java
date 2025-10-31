package labskill1_questionfinal;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Labskill1questionfinal {


    public static void main(String[] args) {

        String name;
        int currentYear = 2019, birthYear, age;
        
        Scanner dataMasuk = new Scanner(System.in);
                
        System.out.println("Enter your name : ");
        name = dataMasuk.nextLine();
        
        System.out.println("Enter your birth year : ");
        birthYear = dataMasuk.nextInt();
        
        age = currentYear - birthYear;
        
        JOptionPane.showMessageDialog(null, "I am " + name + ".\nI am " +
        age + " years old.", "My Details", JOptionPane.ERROR_MESSAGE); 
        
                
    }
    
}