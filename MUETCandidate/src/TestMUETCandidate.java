import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestMUETCandidate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Candidate ID: ");
        String CandidateID = s.nextLine();
        System.out.println("Enter your Listening Score (1 to 45 marks): ");
        double ListeningScore = s.nextDouble();
        System.out.println("Enter your Speaking Score (1 to 45 marks): ");
        double SpeakingScore = s.nextDouble();
        System.out.println("Enter your Reading Score (1 to 120 marks): ");
        double ReadingScore = s.nextDouble();
        System.out.println("Enter your Writing Score (1 to 90 marks): ");
        double WritingScore = s.nextDouble();

        MUETCandidate Candidate = new MUETCandidate(CandidateID, ListeningScore, SpeakingScore, ReadingScore, WritingScore);

        String resultMessage = "Total Score: " + Candidate.calculateTotalScore() + "\nBand Score: " + Candidate.determineBandScore();
        JOptionPane.showMessageDialog(null, resultMessage);

        s.close();
    }
}
