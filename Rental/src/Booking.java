public abstract class Booking {
    protected int bookingNum;
    
    public Booking(int bookingNum) {
       
    }
    
    public void setBookingNum() {
        this.bookingNum = bookingNum;
        
    }
    
    public abstract double getBookingRate();
}