
package tut7extraquestion;
import java.util.Scanner;

public class TUT7EXTRAQUESTION {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
       int numStudents = 30; 
       double[] cgpArray = new double[numStudents];

        for(int i= 0; i<numStudents; i++){
            System.out.println("Enter CPA for student " + (i+1) + ": ");
            cgpArray[i] = s.nextDouble();
            
        }
        int aboveThree = 0;
        int aboveTwo = 0;
        int belowTwo = 0;
        double totalCpa=0;
        
        for (int i = 0; i<numStudents; i++){
            double cpa = 0;
            totalCpa+=cpa;
            if(cpa >= 3.0){
                aboveThree++;
            }
            else if (cpa >=2.00){
                aboveTwo++;
            }
            else {
                belowTwo++;
            }
        }
        
        double averageCPA = totalCpa / numStudents;
        
        System.out.println("Students with CPA 3.00 and above = " +aboveThree);
        System.out.println("Students with between 2.00 and 2.99 = " +aboveTwo);
        System.out.println("Students with CPA below 2.00 = " +belowTwo);
        double averageCpa = totalCpa/numStudents;
        System.out.print("Average CPA: " +averageCpa);
        
    }
    
}
