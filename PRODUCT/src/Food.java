
public class Food extends Product {
    
        private int calories;
        
        public Food(String description, double price, int calories){
            super(description, price);
            this.calories = calories;
        }
        public int getCalory(){
            return calories;
        }
        
        public String display(){
            return "Description :" + super.description +
               "\n Price: RM " + super.price
               + "\nCalories: " + getCalory();
        }
        
}
