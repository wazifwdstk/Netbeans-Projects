public class MUETCandidate extends TestMUETCandidate{
    private String CandidateID;
    private double ListeningScore;
    private double ReadingScore;
    private double WritingScore;
    private double SpeakingScore;
    private double TotalScore;
    private  int BandScore;
    public MUETCandidate(){
    
}
    public  MUETCandidate(String CandidateID, double ListeningScore, double ReadingScore, double WritingScore, double SpeakingScore ){
        this.CandidateID = CandidateID;
        this.ListeningScore = ListeningScore;
        this.ReadingScore = ReadingScore;
        this.WritingScore = WritingScore;
        this.SpeakingScore = SpeakingScore;
        this.TotalScore = ListeningScore + ReadingScore + WritingScore + SpeakingScore;
              
    } 
    public double calculateTotalScore(){
         TotalScore = ListeningScore + ReadingScore + WritingScore + SpeakingScore;
        return TotalScore;
    }
    public int determineBandScore(){
        
        if(TotalScore >= 260 && TotalScore <=300){
            BandScore = 6;
        }
        else if(TotalScore >=220 && TotalScore <=259){
            BandScore = 5;
        }
        else if(TotalScore >=180 && TotalScore <=219){
            BandScore = 4; 
        }
        else if(TotalScore >= 140 && TotalScore <= 179){
            BandScore = 3;
        }
        else if(TotalScore >= 100 && TotalScore <= 139){
            BandScore = 2;
        }
        else if (TotalScore < 100){
            BandScore = 1;
        }
        return BandScore;
    }
}
