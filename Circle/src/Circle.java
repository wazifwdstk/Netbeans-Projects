//MASUK FINAL 40% of final marks 
public class Circle {
    private double radius;
    private String color;
    private double area;
    
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        String message = "Circle radius: " +
                radius + "Circle area : " + area;
        return message;
    }
    public double getArea(){
        return area;
    }
    
    
}
