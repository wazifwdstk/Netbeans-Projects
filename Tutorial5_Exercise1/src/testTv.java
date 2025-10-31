public class testTv {
    public static void main (String[] args){
             
        TV astroRia = new TV();
        astroRia.turnOn();
        astroRia.setChannel(55);
        astroRia.setVolume(7);
        
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
       TV TV_ALHIJRAH = new TV();
       TV_ALHIJRAH.turnOff();
       TV_ALHIJRAH.setChannel(119);
       TV_ALHIJRAH.setVolume(7);
       
       TV Nickelodeon = new TV();
       Nickelodeon.turnOn();
       Nickelodeon.setChannel(130);
       Nickelodeon.setVolume(10);
       
       TV AstroCeria = new TV();
       AstroCeria.turnOn();
       AstroCeria.setChannel(100);
       AstroCeria.setVolume(5);
       AstroCeria.channelUp();
       AstroCeria.volumeDown();
       
        System.out.println("tv1 channel is " +
                 tv1.channel + " and volume level is "
                 + tv1.volumeLevel);
        
         System.out.println("AstroRia channel is " +
                 astroRia.channel + " and volume level is "
                 + astroRia.volumeLevel);
         
         System.out.println("TV_Alhijrah channel is " +
                 TV_ALHIJRAH.channel + " and volume level is "
                 + TV_ALHIJRAH.volumeLevel);
         
         System.out.println("Nickelodeon channel is " +
                 Nickelodeon.channel + " and volume level is "
                 + Nickelodeon.volumeLevel);
         
         System.out.println("Astro Ceria channel is " +
                 AstroCeria.channel + " and volume level is "
                 + AstroCeria.volumeLevel);
         
         
         
    }
}
//This is so cool \(>=<)/