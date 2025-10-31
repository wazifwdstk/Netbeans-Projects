package tut7ex2;

public class TUT7EX2 {
   
    public static void main(String[] args) {
        char grade = 'C';
        String testscore = "";
        
        switch(grade){
            case 'A':
              testscore = "91 - 100";
              break;
            case 'B':
              testscore = "81 - 90";
              break;
            case 'C':
              testscore = "71 - 80";
              break;
            case 'D':
               testscore = "61 - 70";
               break;
            case 'E':
                testscore = "0 - 60";
                break;
            default:
                   testscore = "Invalid Grade";
                   break;
        }
        System.out.println(testscore);
    } 
}
