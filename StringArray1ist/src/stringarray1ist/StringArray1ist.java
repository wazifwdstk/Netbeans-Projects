package stringarray1ist;
import java.util.ArrayList;
import java.util.List;
public class StringArray1ist {

    public static void main(String[] args) {
        
       ArrayList <Integer> bilangan = new ArrayList<Integer>();
       System.out.println("This is ArrayList Integer");
       
       bilangan.add(23);
       bilangan.add(46);
       bilangan.add(4100);
       bilangan.add(436);
       bilangan.add(1236);
       
       System.out.println("List add \t\t\t: " +bilangan );
       
       bilangan.remove(3);
       System.out.println("List Remove \t\t\t: " + bilangan);
       
       bilangan.set(2, 88888);
       System.out.println("List Update \t\t\t: " +bilangan);
       
       System.out.println("List Get Data \t\t\t: " +bilangan.get(1)); //
        System.out.println("List Size Data \t\t\t: " +bilangan.size()); //return array size
        System.out.println("List Check Data (Ada) \t\t: " +bilangan.contains(46));
        System.out.println("List Check Data (Takde) \t: " +bilangan.contains(1234567890));
       
        
        bilangan.clear();
        System.out.println("List Data Semua Deleted \t: " +bilangan);
       
    }
    
}
