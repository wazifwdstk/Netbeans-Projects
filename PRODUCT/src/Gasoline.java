
public class Gasoline extends Product implements Taxable{
        private String type;
        
        public Gasoline(String description, double price, String type){
           super(description, price);
            this.type = type;
                  
        }
        
        public String getType(){
            return type;
        }
        
       public String display(){
         return "Description : " + super.description
            + "\nPrice : RM " + super.price
            + "\nType Gasoline : " + getType();
}

        
        public double calcTax(){
            return super.price * GasTaxRate;
            
        }
}
