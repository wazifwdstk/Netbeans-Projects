package stringmethod2;


public class StringMethod2 {

   
    public static void main(String[] args) {
       
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
    }
    
}
