
package tut12ex6;


import javax.swing.JOptionPane;
public class TUT12EX6 {

   
    public static void main(String[] args) {
        String fullName = JOptionPane.showInputDialog(null,"Enter your full name", "Input", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Your name is "+ fullName,"Message", JOptionPane.INFORMATION_MESSAGE);
        int count= 0;
        do{
           String inputNumber = JOptionPane.showInputDialog(null, "Enter number (1-10)", JOptionPane.QUESTION_MESSAGE);
           int enteredNumber = Integer.parseInt(inputNumber);
             if(enteredNumber < 1 || enteredNumber >10){
                JOptionPane.showMessageDialog(null,"You entered invalid number ","Message", JOptionPane.INFORMATION_MESSAGE);
            }
             else if(enteredNumber == 5){
                 break;
             }
             else{
                 JOptionPane.showMessageDialog(null, "The number you entered is "+enteredNumber,"Message", JOptionPane.INFORMATION_MESSAGE);
                 
                 count++;
             } 
             
            
        }while (count <5);
        
         JOptionPane.showMessageDialog(null, "I love Marvel","Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
