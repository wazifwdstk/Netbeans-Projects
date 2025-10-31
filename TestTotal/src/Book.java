public class Book {
    String isbn = "";
    double price = 0;
    int quantityInStock = 0;

  
    public Book(String isbn, double price, int quantity) {
        this.isbn = isbn;
        this.price = price;
        this.quantityInStock = quantity;
    }

    
    public Book() {
        
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
        
    }
    
    public void setPrice(double price){
        this.price= price;
    }
    
    public void setQuantity(int quantity){
        this.quantityInStock= quantity;
    }
    
    public void display(){
        System.out.println("\nISBN: " +isbn
                            +"\nQuantity: " +quantityInStock+
                            "\nPrice: RM" +price+"\n");
}
    double getPrice(double price){  
        return price;
    }
     String getIsbn(String isbn){  
        return isbn;
                
     }
     int getQuantityInStock(int quantity){
         return quantityInStock;
     }
}
