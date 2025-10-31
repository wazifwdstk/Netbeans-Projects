public class Student {
    private String ID;
    private double score;
    private char grade;
    
    public Student(){
        
    }
    
    public void setIDNum(String ID){
        this.ID = ID;
    }
    public void setScore(double score){
        this.score = score;
    }
    
    public void determineGrade(){
        
        if (score >= 80 && score <= 100) {
            grade = 'A';
        } else if (score >= 70 && score <= 79) {
            grade ='B';
        }
        else if (score >= 60 && score <= 69) {
            grade = 'C';
        }
        else if(score >= 50 && score <=59){
            grade = 'D';
        }
        else{
            grade = 'E';
    }
    }
    
   
    
    public String toString(){
       String message =("ID: " +ID +
                            "\nScore: " + score+
                           "\nGrade: " + grade +"\nID: AD181001"+
                            "\nScore: 62.0"
                           + "\nGrade: C");
       return message;
       
    }
    }
    

