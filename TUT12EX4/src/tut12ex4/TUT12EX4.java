
package tut12ex4;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TUT12EX4 {

    public static void main(String[] args) {
       String fullName = "Wazif Al-Idrus multiplication table";
       ImageIcon iconEnter = new ImageIcon("enterData.png");
       
        JOptionPane.showMessageDialog(null, "Wazif Al-Idrus Multiplication Table","welcome Message", JOptionPane.PLAIN_MESSAGE, iconEnter);
        Scanner s = new Scanner(System.in);
        
        String sifirBerapa = JOptionPane.showInputDialog(null, "Masukkan sifir berapa:  ","Question", JOptionPane.QUESTION_MESSAGE);
        int sifir = Integer.parseInt(sifirBerapa);
        
        String promptSecond = JOptionPane.showInputDialog(null, "Pengiraan sifir sehingga (1-12):  ", "Question" , JOptionPane.QUESTION_MESSAGE);
        int lengthSifir = Integer.parseInt(promptSecond);
        String numberHehe ="";
            if(lengthSifir <=12 && lengthSifir >=1){
               int count= 1; 
                while (count <=lengthSifir){
                     
                     int answer = sifir * count;
                     numberHehe += "" +sifir +" * "  +count +"= " +answer +"\n";
                    
                     JOptionPane.showMessageDialog(null, numberHehe, "Multiplication Table", JOptionPane.PLAIN_MESSAGE);

                     
           count++;
                  
    }
            }
            else{
                JOptionPane.showMessageDialog(null, "Pengiraan Sifir bukanlah dari (1-12)!","ERROR", JOptionPane.WARNING_MESSAGE);
            }
        
        
        
    }
    
}
