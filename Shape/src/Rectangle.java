public class Rectangle extends Shape {
    private double width;
    private double length;
    
  
    public Rectangle(double width, double length, boolean filled, String color){
        
       this.width = width;
       this.length = length;
       this.color = color;
       this.filled = filled;
    }
}
