/*Lab Skill 1 - Question 4
Name		: SYED AHMAD WAZIF BIN SYED AHMAD MUNIF AL-IDRUS
Matric No.	: DDCS22J008
Date		: 7 September 2023*/

package labskill1_question5;
import javax.swing.JOptionPane;

public class LABSKILL1_QUESTION5 {

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog(null, "Enter your full name:", "Name Input", JOptionPane.PLAIN_MESSAGE);
        String nickname = JOptionPane.showInputDialog(null, "Enter your nickname:", "Nickname Input", JOptionPane.PLAIN_MESSAGE);
        String ageStr = JOptionPane.showInputDialog(null, "Enter your age:", "Age Input", JOptionPane.PLAIN_MESSAGE);
        
        int age = Integer.parseInt(ageStr);
          JOptionPane.showMessageDialog(null,
                "Personal Information:\n" +
                "Name: " + name + "\n" +
                "Nickname: " + nickname + "\n" +
                "Age: " + age,
                "Personal Information", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}
