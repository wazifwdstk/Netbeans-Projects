package exercise4;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class EXERCISE5 {

    
    public static void main(String[] args) {
       ImageIcon icon = new ImageIcon("turtle.png");
       ImageIcon iconUgly= new ImageIcon("ugly (1).png");
       ImageIcon iconCute = new ImageIcon("cute.png");
       
       int input = JOptionPane.showConfirmDialog(null, "Do you like turtles?", "Question", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
       
       System.out.print(input);
       
       if(input == 0){
           JOptionPane.showConfirmDialog(null, "Turtle is cute", "Yes Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, iconCute);
       }
       else if (input ==1){
           JOptionPane.showConfirmDialog(null, "Turtle is ugly", "No Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, iconUgly);
       }
       else if (input ==2){
           JOptionPane.showConfirmDialog(null, "You Click Cancel!!");
       }
    }
    
}
