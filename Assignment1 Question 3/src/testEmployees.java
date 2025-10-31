public class testEmployees {
    public static void main(String []args){
        
       Employees objectBaru = new Employees();
       objectBaru.setID(1243);
       objectBaru.setFirstName("Ali");
       objectBaru.setLastName("Azhari");
       objectBaru.setSalary(1200);
       
       objectBaru.getName();
       objectBaru.getSalary();
       objectBaru.getAnnualSalary();
       objectBaru.toString();
       
       System.out.println(objectBaru);
    }
   
}
