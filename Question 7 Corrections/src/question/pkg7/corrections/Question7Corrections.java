
package question.pkg7.corrections;


import java.util.Scanner;
public class Question7Corrections {

   
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

        int numberOfSubjects = 5;
        int totalScore = 0;
        int subjectCount = 0;

        System.out.println("Enter scores for " + numberOfSubjects + " subjects:");

        while (subjectCount < numberOfSubjects) {
            System.out.print("Enter score for subject " + (subjectCount + 1) + ": ");
            int score = s.nextInt();

            // Validate the score (assuming scores are in a reasonable range)
            if (score >= 0 && score <= 100) {
                totalScore += score;
                subjectCount++;
            } else {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
            }
        }

        s.close();

        // Calculate and display the average score
        double averageScore = (double) totalScore / numberOfSubjects;
        System.out.println("Average score: " + averageScore);
    }
    
}
