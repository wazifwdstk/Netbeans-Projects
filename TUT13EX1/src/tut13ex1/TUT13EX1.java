
package tut13ex1;


public class TUT13EX1 {

    
    public static void main(String[] args) {
      int intArray[]={1,2,3};       //Declaring a new set of array (in 1 line)
                
      //printing out da ting in seq
      for(int i=0; i<intArray.length; i++){
          System.out.println(intArray[i] + " ");
      }
      
      //cloning process
      System.out.println();
      int cloneArray[] = intArray.clone();
      
      System.out.println(intArray == cloneArray);
      
      for (int i = 0; i < cloneArray.length; i++){
          System.out.println(cloneArray[i] + " ");
      }
    }
    
}
