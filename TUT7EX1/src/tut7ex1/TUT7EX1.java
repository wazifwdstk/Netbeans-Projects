
package tut7ex1;


public class TUT7EX1 {

   
    public static void main(String[] args) {
        int day = 4;
        String nameDay ="";
        
        if(day == 1){
            nameDay = "Sunday";
            
        }
        else if(day == 2){
            nameDay = "Monday";
        }
        else if (day == 3){
            nameDay = "Tuesday";
        }
        else if (day==4){
            nameDay = "Wednesday";
        }
        else if (day==5){
            nameDay = "Thursday";
        }
        else if (day==6){
            nameDay = "Friday";
        }
        else if (day ==7){
            nameDay = "Saturday";
        }
        else{
            
        }
          System.out.println(nameDay); 
        
    }
    
}
