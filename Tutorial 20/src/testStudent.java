import java.util.Scanner;

public abstract class testStudent extends Student implements Comparable<Student> {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("Enter ID: ");
        String ID = info.nextLine();

        System.out.println("Enter Score: ");
        double score = info.nextDouble();

        Student studentScores = new Student();
        studentScores.setIDNum(ID);
        studentScores.setScore(score);
        studentScores.determineGrade(); 

        System.out.println(studentScores.toString());
    }
}
