/*Name		: Syed Ahmad Wazif bin Syed Ahmad Munif Al-Idrus
Matric No.	: DDCS22J008
Date		: 12/10/2023*/

package labskill3_question6;

import javax.swing.JOptionPane;

public class LABSKILL3_QUESTION6 {

    public static void main(String[] args) {
        double[] cgpArray = new double[10];
        int numStudents = 0;
        int continueInput = 0;
        double totalCpa = 0;

        do {
            String studentCpaPrompt = "Enter CGPA:";
            String CGPAinput = JOptionPane.showInputDialog(null, studentCpaPrompt, "Input", JOptionPane.INFORMATION_MESSAGE);
            
            String continuePrompt = JOptionPane.showInputDialog(null, "Do you want to continue?"
                    + "1 = Yes / 2 = No");
            continueInput = Integer.parseInt(continuePrompt);
                    
                double cpa = Double.parseDouble(CGPAinput);
                if (cpa >= 0 && cpa <= 4.0) {
                    cgpArray[numStudents] = cpa;
                    totalCpa += cpa;
                    numStudents++;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid CGPA. Please enter a value between 0.0 and 4.0.");
                }
            
        } while (continueInput != 2);

            double averageCPA = totalCpa / numStudents;
            int lowerAverage = 0;
            int higherAverage = 0;
            int equalAverage = 0;
            
            for (int i = 0; i < numStudents; i++) {
                if (cgpArray[i] < averageCPA) {
                    lowerAverage++;
                } else if (cgpArray[i] > averageCPA) {
                    higherAverage++;
                } else {
                    equalAverage++;
                }
             
            }

          JOptionPane.showMessageDialog(null, "No of Student: " + numStudents +
        "\nTotal CGPA: " + String.format("%.2f",totalCpa) +
        "\nAverage CGPA: " + String.format("%.2f",averageCPA)+
        "\nStudents with CGPA lower than average: " +  lowerAverage +
        "\nStudents with CGPA equal to average: " + equalAverage +
        "\nStudents with CGPA higher than average: " + higherAverage);
        }
    }

