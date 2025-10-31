public class Test {
    public static void main (String[]args){
        
        CD test1 = new CD();
        test1.setItemID("A123");
        test1.setTitle("Harry Potter");
        test1.setQuantity(5);
        test1.setPrice(15.30);
        
        System.out.println(test1.toString());
    }
}
