public class Account {
         String id = "";
         String name = "";
          int balance = 0;
    public Account(){
        
    }
   
    public Account(String id, String name){
        this.id = id;
        this.name = name;
        
    }
    public Account(int balance){
        this.balance = balance;
    }
    public void setID(String id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public String getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public int credit(int amount){
        balance += amount;
        return balance;
    }
    
    public int debit(int amount){
        if (amount <= balance){
           amount -= balance;
        }
        else{
            System.out.println("Amount exceeded balance. ");
        }
        return balance;
    }
    
    public String toString(){
        String message = "Account[id= " +id+", name=  "+name+", balance= "+balance+ "]";
                         
        return message;
    }
}
