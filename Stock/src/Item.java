public abstract class Item extends Stock implements Comparable <Item> {
    private int quantity;
    private double pricePerItem;
    
    
    public Item(String partNumber, int quantity, double pricePerItem){
       super (partNumber);
       this.quantity = quantity;
       this.pricePerItem = pricePerItem;
       
    }
    
    public double getPricePerItem(){
        return pricePerItem;
    }
    
    public String toString(){
        String message = "Part Number    : " + super.partNumber
                         +"\nQuantity       : " + quantity
                         +"\nPrice Per Item : RM" + getPricePerItem();
        return message;
    }
    
    public double getTotalCost(){
        return quantity * pricePerItem;
    } 
    
    public int compareTo(Item o){
        if(this.getTotalCost()< o.getTotalCost()){
            return -1;
    }   
        else if (this.getTotalCost() == o.getTotalCost()){
        return 0;
    }
        else{
        return 1;
    }
        
}
}

