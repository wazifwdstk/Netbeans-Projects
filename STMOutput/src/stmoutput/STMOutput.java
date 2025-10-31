package stmoutput;
import java.util.Scanner;

public class STMOutput {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner (System.in);
     System.out.println("Enter nama dan gelaran: ");
       String gelaran = keyboard.nextLine();
       
       String newGelaran = gelaran.toUpperCase();
              
       if (newGelaran.startsWith("PUAN")){
           
          System.out.println("You are PUAN");
          
       }else {
           System.out.println("Unknown person");
       }
       
       System.out.print("Enter new name: ");
       String name = keyboard.nextLine();
       
       if (name.endsWith("Abdullah")){
           System.out.println("Anak Abdullah");
       }else{
           System.out.println("Anak orang lain");
           
       }
       String warna = "Merah Biru Kuning";
       System.out.println("Contains : " + warna.contains("Biru"));
       System.out.println("Contains : " + warna.contains("Pink"));  
    }
    
}
