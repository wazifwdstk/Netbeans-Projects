    public abstract class ETS extends Booking implements Comparable<ETS> {
    private int etsNum;
    private String etsType;
    
    public ETS(int bookingNum, int etsNum, String etsType) {
        super(bookingNum);
        this.etsNum = etsNum;
        this.etsType = etsType;
       
    }
    public int getETSNum(){
        return etsNum;
    }
    
    public String getRoomTypes(){
        return etsType;
    }
    
    public String toString(){
        String message = 
                "ETS No.  : " + super.bookingNum +"\nRoom No. : " +etsNum+
                         "\nRoom Type" +etsType;
                         
        return message;
    }
    public double getRentalRate(){
        if(etsType == "ETS Silver"){
            return 250.00;
        }
        else if(etsType == "ETS Gold"){
            return 350.00;
        }
        else if(etsType == "ETS Platinum"){
            return 450.00;
        }
        else{
            return 0.00;
        }
    }
    public int compareTo(ETS a){
        if(this.getETSNum() < a.getETSNum()){
            return -1;
        }
        else if(this.getETSNum() == a.getETSNum()){
            return 0;
        }
        else{
            return 1;
        }
    }
}