public class Rectangle {
   private float length =1.0f;
   private float width = 1.0f;
   private double perimeter = 1.0;
   private double area = 1.0;
   
   public Rectangle() {
       
   }

   public Rectangle(float length, float width) {
       this.length = length;
       this.width = width;
   }

   public float getLength() {
       return length;
   }

   public float getWidth() {
       return width;
   }

   public float calculateArea() {
       return length * width;
   }
   
   public void setWidth(float width){
    this.width = width;
}
   public void setLength(float length){
       this.length = length;
   }
   
   public double getPerimeter(){
       perimeter = (length*2) + (width*2);
     return  perimeter;
       
   }
   
   public double getArea(){
       area = length * width;
     return  area;
     }
   
   public String toString(){
        String message = "Rectangle length: " +
                length + " and  width: " + width + "and area: " +area;
        return message;
    }
   
}
