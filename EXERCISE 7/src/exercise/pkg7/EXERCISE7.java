package exercise.pkg7;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.ImageIcon;
public class EXERCISE7 {

    public static void main(String[] args) {
        double aliaScore;       
        double annieScore;
        double abuScore;
        double finalAliaScore, finalAbuScore, finalAnnieScore;
        
        Scanner s = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null, "Do not enter value other than (1-100)!", "Message",JOptionPane.INFORMATION_MESSAGE);
       String inputAlia = JOptionPane.showInputDialog(null, "Alia Score:", "Score System", JOptionPane.INFORMATION_MESSAGE);
        aliaScore = Double.parseDouble(inputAlia);

       String inputAbu = JOptionPane.showInputDialog(null, "Abu Score:", "Score System", JOptionPane.INFORMATION_MESSAGE);
       abuScore = Double.parseDouble(inputAbu);

       String inputAnnie = JOptionPane.showInputDialog(null, "Annie Score:", "Score System", JOptionPane.INFORMATION_MESSAGE);
       annieScore = Double.parseDouble(inputAnnie);
       
         JOptionPane.showMessageDialog(null, "Alia Score is: "+aliaScore
                                              +"\nAbu Score is: " +abuScore
                                              +"\nAnnie Score is: "+annieScore, "Summary Score",JOptionPane.WARNING_MESSAGE);
         
         //declare bonus mark and adding bonus mark
         int bonusMark = 10;
         double totalAliaScore = aliaScore + bonusMark;
         double totalAbuScore = abuScore + bonusMark;
         double totalAnnieScore = annieScore + bonusMark;
         
            //final alia score
         if(totalAliaScore > 100){
                finalAliaScore = 100;
         }
         else{
              finalAliaScore = totalAliaScore;
         }
         
           //final abu score 
         if(totalAbuScore > 100){
                finalAbuScore = 100;
         }
         else{
              finalAbuScore = totalAbuScore;
         }
         
            //final annie score
         if(totalAnnieScore > 100){
                finalAnnieScore = 100;
         }
         else{
              finalAnnieScore = totalAnnieScore;
         }
         
         JOptionPane.showMessageDialog(null, "Alia Score is: "+ finalAliaScore
                                              +"\nAbu Score is: " +finalAbuScore
                                              +"\nAnnie Score is: "+finalAnnieScore, "Final Carry Mark",JOptionPane.INFORMATION_MESSAGE);
         
          ImageIcon icon = new ImageIcon("ugly.png");
         JOptionPane.showMessageDialog(null, "That is your Final Carry Mark","UTMSPACE",JOptionPane.PLAIN_MESSAGE, icon);
    }
    
}
