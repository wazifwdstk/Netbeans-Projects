public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    private double total;
    
    public InvoiceItem() {
    }

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter methods
    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double getTotal(){
        total = unitPrice * qty; 
        return  total;
}
     public String toString(){
        String message = "INVOICE ITEM "+ "\n ID: " + id + " \n Description: " +desc
                           + "\n Quantity: " +qty + "\n Unit Price: " +unitPrice;
        return message;
    }
}
