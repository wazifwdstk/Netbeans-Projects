public class TestStock {
    public static void main (String [] args){
        
        Item item1 = new Item("A24", 30, 25.90) {};
        item1.getPricePerItem();
        item1.getTotalCost();
        System.out.println(item1.toString());
        System.out.println("Total Cost     : " + item1.getTotalCost());
        
        Item item2 = new Item("A16", 25, 60.90) {};
        item2.getPricePerItem();
        item2.getTotalCost();
        System.out.println(item2.toString());
        System.out.println("Total Cost     : " + item2.getTotalCost());
        
        System.out.println("\nThe result of the comparison\t: " + item2.compareTo(item1));
    }
}
