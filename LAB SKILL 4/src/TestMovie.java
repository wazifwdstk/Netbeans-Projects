import java.util.Scanner;

public class TestMovie {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       Movie[] MovieArray = new Movie[5]; 

       for (int i = 0; i < MovieArray.length; i++) {
           MovieArray[i] = new Movie(); 

           System.out.println("Enter Title: ");
           String title = s.nextLine();
           System.out.println("Enter Director: ");
           String director = s.nextLine();
           System.out.println("Enter rating: ");
           int rating = s.nextInt();

           MovieArray[i].setMovie(title, director, rating);

           System.out.println(MovieArray[i].toString());
           s.nextLine(); 
           System.out.println("");
       }
           
       s.close();
   }
}
