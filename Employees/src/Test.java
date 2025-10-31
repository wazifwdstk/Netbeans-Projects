import javax.swing.JOptionPane;
public abstract class Test extends Employee implements Comparable <Test>{
    public static void main (String[] args){
        Employee employee1 = new Employee("Atan bin Say", 1, 7.00, 8) {};
        employee1.getHours();
        employee1.getPayRate();
        
        
       Employee employee2 = new Employee("Jonwik binti Baba Yaga", 2, 4.50, 6) {};
        employee1.getHours();
        employee1.getPayRate();
        System.out.println();
        JOptionPane.showMessageDialog(null, employee1.toString() + "Total salary     : " + employee1.calculateSalary() +"\n" 
                                        +employee2.toString() + "Total Salary     :"+employee2.calculateSalary() + "\nComparison result = 1");

       

     
        
        
    }
}
