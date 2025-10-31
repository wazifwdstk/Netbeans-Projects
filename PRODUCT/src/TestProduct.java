
public class TestProduct {
    public static void main (String[] args){
        
        Product lol = new Gasoline("Petronas",2.07, "RON95");
        System.out.println(lol.display());
        
        Product kete = new MotorVehicle("Nissan Silvia S15", 200000.50,"Drift Car");
        System.out.println(kete.display());
        
        Product makang = new Food("Rendang Ayam", 24.50, 450);
        System.out.println(makang.display());
        
        //Array
        Product ayam[] = new Product[3];
        ayam[0] = new Gasoline("Shell", 2.13,"RON97");
        ayam[1] = new MotorVehicle("Kancil", 1500.22,"RON97");
        ayam[2] = new Food("Mando's", 12.44 ,390);
        
               for(int i = 0; i<ayam.length; i++){
                    System.out.println(ayam[i].display());
              }
    }
}
