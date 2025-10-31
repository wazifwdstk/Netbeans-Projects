
public class MotorVehicle extends Product implements Taxable {
    private String motorType;
   
    public MotorVehicle(String description, double price, String motorType){
        super(description, price);
        this.motorType = motorType;
        
       
    }
    public String getMotorType(){
        return motorType;
    }
    
    public String display(){
        return "Description : "+ super.description
                +"\nPrice : RM " + super.price
                +"\nMotor Type : " + getMotorType();
    }
    
    public double calcTax(){
        return super.price * MotorVehicleTaxRate;
    }
    
}
