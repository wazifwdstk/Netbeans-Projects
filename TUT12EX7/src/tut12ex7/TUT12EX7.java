
package tut12ex7;


public class TUT12EX7 {

    
    public static void main(String[] args) {
        int arr [][][] = new int [3] [4] [5];
        int i, j, k;
        int num = 1;
        
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                for(k=0; k<5; k++){
                    arr[i][j][k] = num;
                    num++;
                }
            }
        }
         for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                for(k=0; k<5; k++){
                    System.out.println("arr["+i+ "] {"+j+"]["+k+"]" +arr[i][j][k]+ "\t");
                }
                System.out.println();
            }
                System.out.println();
        }
        
        
        
                
    }
    
}
