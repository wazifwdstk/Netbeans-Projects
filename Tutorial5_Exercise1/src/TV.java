public class TV {
    int channel =1;
    int volumeLevel=1;
    boolean on = false;
    
    
    public TV(){
        
}
    //ni semua setter
    public void turnOn(){
        on = true;

}
     public void turnOff(){
        on = false;

}
     public void setChannel(int newChannel){
         if(on && newChannel >= 1 && newChannel < 120)
         channel = newChannel; 
         else
             System.out.println("Invalid Range");
     }
     public void setVolume(int newVolumeLevel){
         if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
         volumeLevel = newVolumeLevel;
         else
             System.out.println("Invalid Volume Level Range ");
     }
     public void channelUp(){
         if(on && channel < 120)
             channel++;
         
     }
      public void channelDown(){
          if(on && channel > 1)
              channel--;
         
     }
      
      public void volumeDown(){
          if(on && volumeLevel < 120)
             volumeLevel--;
      }
      public void volumeUp(){
          if(on && channel < 120)
             volumeLevel++;
          
      }
}



