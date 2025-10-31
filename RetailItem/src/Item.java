public abstract class Item extends Stock implements Comparable <Item> {
        
    private int quantity;
    private double pricePerItem;
    
    public Item (String partNumber, int quantity, double pricePerItem){
        super (partNumber);
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    public double getPricePerItem(){
        return pricePerItem;
    }
    
    public String toString(){
        return "partNumber : " + super.partNumber
                +"\n quantity: " + quantity
                + "\npricePerItem: " + getPricePerItem();
                
    }
    
    public int compareTo(Item hehe){
        if (this.getTotalCost() < hehe.getTotalCost() ){
            return -1;
        
    }else if (this.getTotalCost() == hehe.getTotalCost()){
        return 0;
    }else {
            return 1;
    }
}
}
