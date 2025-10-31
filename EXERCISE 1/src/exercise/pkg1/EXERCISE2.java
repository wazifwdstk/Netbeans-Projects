package exercise.pkg1;
// SYED AHMAD WAZIF BIN SYED AHMAD MUNIF AL-IDRUS

public class EXERCISE2 {
    public static void main(String[] args) {
            double aliaScore, abuScore, annieScore;
        int bonusMark = 10;
       
        JOptionPane.showMessageDialog(null, "Please enter scores between 1-100 only.", "Information", JOptionPane.INFORMATION_MESSAGE);

        
        aliaScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Alia's Score:"));
        abuScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Abu's Score:"));
        annieScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Annie's Score:"));

       
        double totalAliaScore = aliaScore + bonusMark;
        double totalAbuScore = abuScore + bonusMark;
        double totalAnnieScore = annieScore + bonusMark;

        
        double finalAliaScore = (totalAliaScore > 100) ? 100 : totalAliaScore;
        double finalAbuScore = (totalAbuScore > 100) ? 100 : totalAbuScore;
        double finalAnnieScore = (totalAnnieScore > 100) ? 100 : totalAnnieScore;

        
        JOptionPane.showMessageDialog(null,
                "Alia's Final Score: " + finalAliaScore + "%\n" +
                "Abu's Final Score: " + finalAbuScore + "%\n" +
                "Annie's Final Score: " + finalAnnieScore + "%",
                "Final Scores", JOptionPane.WARNING_MESSAGE);

        
        JOptionPane.showMessageDialog(null, "That is your Final Carry Mark", "UTMSPACE", JOptionPane.PLAIN_MESSAGE,
tyu                new ImageIcon("C:\\Users\\User\\Downloads\\ugly.png")); 
    }
}
