public class testAccount {
    public static void main(String[]args){
        Account myAccount = new Account();
        myAccount.setID("5243");
        myAccount.setName("Alia Zain");
       myAccount.toString();
       
       Account akaunBaru = new Account();
       akaunBaru.setID("17895");
       akaunBaru.setName("Luna Maya");
       akaunBaru.setBalance(1200);
       akaunBaru.credit(200);
       akaunBaru.toString();
       akaunBaru.debit(1500);
       akaunBaru.toString();
       
       
       
       System.out.println(myAccount);
       System.out.println("");
       System.out.println(akaunBaru);
       
    }
}
