public abstract class RetailItem {
    protected String itemID;
    
    public RetailItem(){
    
    }
    
    public void setItemID(String itemID){
        this.itemID = itemID;
    }
    
    public String toString(){
        String message = "Item ID: " +itemID;
        
        return message;
        
    }
}
