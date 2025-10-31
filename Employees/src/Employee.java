public abstract class Employee   {
    private String name;
    private int id;
    private double payRate;
    private int hoursWork;
    
    public Employee(){
        
    }
    public Employee(String name, int id, double payRate, int hoursWork){
        this.name = name;
        this.id = id;
        this.payRate = payRate;
        this.hoursWork = hoursWork;
        
    }
    public double getPayRate(){
        return payRate;
    }
    
    public int getHours(){
        return hoursWork;
    }
    
    public String toString(){
     String message = "\nName = " +name +
                      "\nID = " +id +
                      "\nPay Rate per Hour = " +payRate
                      +"\nHours Work = " +hoursWork +"\n"
                      ;
     return message;
    }
    
   public double calculateSalary(){
       return payRate * hoursWork;
   }
   
     public int compareTo(Employee o){
        if(this.calculateSalary()< o.calculateSalary()){
            return 1;
    }   
        else if (this.calculateSalary() == o.calculateSalary()){
        return 0;
    }
        else{
        return -1;
    }
    
}
}
