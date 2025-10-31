
package tut13ex6;


public class TUT13EX6 {

    
    public static void main(String[] args) {
        //declare array
        int[][] arr= { { 1, 2}, { 3, 4 }};
        
        //print array
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("arr["+i+ "] {"+j+"]");
            }
            System.out.println();
        }
    }
}
