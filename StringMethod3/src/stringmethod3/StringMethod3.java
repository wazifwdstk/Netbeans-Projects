
package stringmethod3;


public class StringMethod3 {
    public static void main(String[] args) {
        
        String s4 = "Syed Ahmad Wazif";
        boolean out1 = s4.equals("Syed");
        boolean out2 = s4.equals("Wazif");
        System.out.println("Equality Check: " +out1);
        System.out.println("Equality Check: " +out2);
        System.out.println("Equality Check: " +"Tangang".equals("Tangang"));
        
          
       String s5 = "Harry Potet";
       boolean out3 = s5.equalsIgnoreCase("harry");
       boolean out4 = s5.equalsIgnoreCase("Harry");
         System.out.println("Equality Ignore Case Check: " +out3);
         System.out.println("Equality Ignore Case Check " +out4);
         System.out.println("Equality Ignore Case Check " +"Tangang".equalsIgnoreCase("Tangang"));
           
                
          
    }
    
}
