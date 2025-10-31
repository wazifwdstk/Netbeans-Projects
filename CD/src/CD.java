public class CD extends RetailItem {
    private String title;
    private int quantity;
    double price;
    
    public CD(){
        super();
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        
        String message =  super.toString() +
                "\nTitle: "+ title+
                        "\nQuantity: " + quantity+
                        "\nPrice: " +price;
        return message;
    }
    
    public double calculateSalesAmount(){
        double calculateSalesAmount = quantity * price;
        return calculateSalesAmount;
    }    
}
