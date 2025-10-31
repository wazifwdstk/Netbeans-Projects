package tutorial11exercise3;

import java.util.Scanner;


public class TUTORIAL11EXERCISE4 {

    public static void main(String[] args) {
        
        Scanner berapa = new Scanner(System.in);

        
        System.out.print("Masukkan sifir berapa: ");
        int sifir = berapa.nextInt();

        
        System.out.print("Pengiraan sifir sehingga (1-12): ");
        int lengthOfSifir = berapa.nextInt();

        berapa.close(); 

        
        String fullName = "Shazlin Azhari";

        
        System.out.println(fullName + " Multiplication Table");

        
        for (int count = 1; count <= lengthOfSifir; count++) {
            System.out.println(sifir + " x " + count + " = " + (sifir * count));
        }
    }
    
}
