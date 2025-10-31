package stringbuffer;
public class StringBuffeSample {

   
    public static void main(String[] args) {
        StringBuffer ikan = new StringBuffer("Ikan Jos");
        
      int ikanLength = ikan.length();
      System.out.println("Length ayat ikan: " + ikanLength);

      int ikanCapacity = ikan.capacity();
      System.out.println("Capacity ikan = " + ikanCapacity);

      //apend()
      
      StringBuffer nini = new StringBuffer("Running");
      nini.append(" ");
      nini.append("Man");
      nini.append(" ");
      nini.append("2020");
      System.out.println("Append Nini : " + nini);
      
      //insert()
      StringBuffer miya = new StringBuffer ("MobileLegend");
      
      miya.insert(6, "  ");
      System.out.println(miya);
      System.out.println(miya.length());
      
      miya.insert(miya.length(), 2020);
      System.out.println(miya);
      
      //reverse
      StringBuffer saje = new StringBuffer ("Call of Duty");
      
      StringBuffer pastu = saje.reverse();
      System.out.println(pastu);
      
      //delete
      StringBuffer yeke = new StringBuffer("Madu Lebah");
      System.out.println(yeke.delete(2, 6));
      
      //deleteCharAt()
      StringBuffer hmm = new StringBuffer("Shawarma Wrap");
      System.out.println(hmm.deleteCharAt(3));
      
      //replace
      StringBuffer tukar = new StringBuffer("Ganti Kereta Kebal");
      System.out.println(tukar.replace(0,5, "Beli"));
    }
    
}
