package assignment2;
import java.util.ArrayList;
import java.util.List;
public class Assignment2 {

    public static void main(String[] args) {
        ArrayList <String> Animal = new ArrayList<String>();
        System.out.println("This is an ArrayList String");
        
        Animal.add("Kangaroo");
        Animal.add("Cow");
        Animal.add("Sheep");
        Animal.add("Snake");
        Animal.add("Buffalo");  
        Animal.add("Camel");   
        Animal.add("Giraffe");
        Animal.add("Cat");
        Animal.add("Dog");
        Animal.add("Monkey");
        
        System.out.println("Size List Animal \t\t\t: " + Animal.size());
        System.out.println("Size List Animal \t\t\t: " + Animal);
        System.out.println("People:" + "|");
            
            for(int i = 0; i<Animal.size(); i++){
                System.out.println(Animal.get(i) + "|");
            if (Animal.contains("Camel") || Animal.contains("Giraffe")) {
            System.out.println("\nThe elements are found in the list");
        } else {
            System.out.println("\nThe elements are not found in the list");
        }
            
            Animal.add("Dolphin");
            System.out.println("\nAnimal List After add Dolphin" + Animal);
            }
            
            Animal.remove("Snake");
            Animal.remove("Dog");
            Animal.remove(1);
            System.out.println("Animal List after remove \t\t\t: " + Animal);
            System.out.println("The location of Monkey is at index");
            int numbermonkey=Animal.indexOf("Monkey");
            System.out.println(numbermonkey);
            
            int numbercat=Animal.indexOf("Cat");
           Animal.set(numbercat, "Hamster");
            System.out.println("Animal List after replace \t\t\t:"+Animal);
            
            boolean answer = Animal.isEmpty();
            if (answer == true){
                System.out.println("The List is empty");
            }
            else
            {
                System.out.println("The List is not empty");
            
            }
            String data1=Animal.get(4);
            String data2= Animal.get(6);
            
            if(data1.compareTo(data2) <0){
                System.out.println(data1+"Comes before"+data2);
                }
            else if(data1.compareTo(data2)==0){
                System.out.println(data1 + "Comes after" +data2);               
            }
            String dataNew=Animal.get(3);
            
            if(dataNew.contains("y")){
                System.out.println(data1+"Comes after"+data2);
            }
            else{
                System.out.println(" Not Ends with Y");
            }
            System.out.println("Animal List before clear \t\t\t:" +Animal);
            System.out.println("Performing clear operation!!");
            
            Animal.clear();
                System.out.println("Animal List after Clear \t\t\t: " +Animal);
    }
    
}
