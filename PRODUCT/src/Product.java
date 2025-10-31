public abstract class Product {
        protected String description;
        protected double price;
        
        public Product(String description, double price){
                this.description = description;
                this.price = price;
            }       
        
        public double getPrice(){
            return price;
        }
        
        public abstract String display();
            
        
        
        
}
