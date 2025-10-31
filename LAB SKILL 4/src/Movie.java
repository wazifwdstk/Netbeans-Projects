public class Movie extends TestMovie {
    private String title;
    private String director;
    private int rating;
    private String placeholder;
            
    public Movie(){
        
    }
    
    public Movie(String title, String director, int rating){
        
    }
    
    public  String setMovie (String title, String director, int rating){
        this.title = title;
        this.director = director;
        this.rating =rating;
        
        return placeholder;
        
    }
    
    public String toString(){
        String message = "Title: " +title
                         +"\nDirector: " +director
                         +"\nRating: " +rating ;
        return message;
    }   
    
}
