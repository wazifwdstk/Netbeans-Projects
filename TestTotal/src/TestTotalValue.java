import java.util.Scanner;

public class TestTotalValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalQuan = 0;
        double totalPriceStock = 0.0; // Changed the data type to double
        Book[] booksArray = new Book[5];

        for (int i = 0; i < booksArray.length; i++) {
            System.out.println("Enter ISBN: ");
            String isbn = s.next();

            System.out.println("Enter Quantity: ");
            int quantity = s.nextInt();

            System.out.println("Enter Price: ");
            double price = s.nextDouble();

            booksArray[i] = new Book();
            booksArray[i].setIsbn(isbn);
            booksArray[i].setPrice(price);
            booksArray[i].setQuantity(quantity);
            booksArray[i].display();
        }

        for (int j = 0; j < booksArray.length; j++) {
            totalQuan += booksArray[j].getQuantityInStock(j); // Corrected method call
            totalPriceStock += booksArray[j].getPrice(j) * booksArray[j].getQuantityInStock(j); // Corrected method calls
        }

        System.out.println("Total Book Quantity: " + totalQuan);
        System.out.println("Total Book Price: RM" + totalPriceStock);
        
        s.close();
    }
}
