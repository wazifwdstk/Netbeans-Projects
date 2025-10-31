package stringmethod1;

public class StringMethod1 {
    
    public static void main(String[] args) {
      
        String s = new String();
        s = "Wazif Al-Idrus";
        System.out.println("Name : "+s);
        
        String nama = new String("Wazif Al-Idrus");
        System.out.println("Nama : " + nama);
        
        String nickname = "Ajip";
        System.out.println("Nickname : "+ nickname);
        
        String namaBaru = new String ("@wazifwoodstock");
        System.out.println("String length: " + namaBaru.length());
        System.out.println("String length : " + "Fairus Amarz".length());
        
        String testNama = new String("Beli books");
        System.out.println("Char Index 0 : "+ testNama.charAt(0));
        System.out.println("Char Index 7 : "+ testNama.charAt(7));
        System.out.println("Char Index 2 : "+"Tak nak beli".charAt(2));
        
        String ayam = new String("Jangan Kedekut");
        System.out.println("Substring 3: " + ayam.substring(3));
        System.out.println("Substring 4: " + "Tak baik tipu".substring(4));
        
           
        String lembu = new String("Mengantok tak?");
        System.out.println("Substring 2 - 7: " + lembu.substring(2,7));
        System.out.println("Substring 4 - 8: " + lembu.substring(4,8));
        
        String s1 = "Tak nak";
        String s2 = "buat kerja";
        System.out.println("Concatenation : "+ s1.concat(s2));
        System.out.println("Concatenation : "+ "Tido".concat(" ke "));
        
        
        String ikan = "Ikan Kembung Bakar";
        int output = ikan.indexOf("Kembung");
        System.out.println("Index : "+ output);
        System.out.println("Index : "+ "Ikan Kari Bakar".indexOf("Pari"));
        
        String apa2 = new String("Makan sendiri atau makan sekali?");
        int out = apa2.indexOf("Makan",3);
        System.out.println("IndexOf: " + out);
        System.out.println("IndexOf : "+ "nak ke tak nak".indexOf("nak, 1"));
        
        String s3 = "Belajar ke terlajak";
        int hehe = s3.lastIndexOf("la");
        System.out.println("lastIndexOf : " + hehe);
        System.out.println("lastIndexOf : " + "mak mak mak".lastIndexOf("mak"));
        
          String s4 = "Syed Ahmad Wazif";
        boolean out1 = s4.equals("Syed");
        boolean out2 = s4.equals("Wazif");
        System.out.println("Equality Check: " +out1);
        System.out.println("Equality Check: " +out2);
        System.out.println("Equality Check: " +"Tangang".equals("Tangang"));
        
          
       String s5 = "Harry Potet";
       boolean out3 = s5.equalsIgnoreCase("harry");
       boolean out4 = s5.equalsIgnoreCase("Harry");
         System.out.println("Equality Ignore Case Check: " +out3);
         System.out.println("Equality Ignore Case Check " +out4);
         System.out.println("Equality Ignore Case Check " +"Tangang".equalsIgnoreCase("Tangang"));
         
       String s9 = "Ikan";
       String s10 = "Kucing";
       String s11 = "tucen<3";
       System.out.println("Compare Ignore: " +s9.compareToIgnoreCase(s10));
       System.out.println("Compare Ignore: " +s10.compareToIgnoreCase(s9));
       System.out.println("Compare Ignore: " +s11.compareToIgnoreCase(s10));
       
       String word1 = "wELcOmE TO cluB";
       System.out.println("toLowerCase: " +word1.toLowerCase());
       
        String word2 = "wELcOmE TO cluB";
       System.out.println("toUpperCase: " +word2.toUpperCase());
       
       String word3 = " Sikit lagi ";
       System.out.println("Trim : " + word3.trim());
       
       String word4 = "nanak mak";
       System.out.println("Replace n with k: " + word4.replace("n", "k"));
       System.out.println("Replace n with k: " + word4.replace("na", "gi"));
    }
    
}
