public class Employees {
    int id = 0;
    String firstName = "";
    String lastName = "";
    int salary;
    String name; 
    int annualSalary;
    
    public Employees() {
        
    }
    
    public Employees(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.name = firstName + " " + lastName; 
    }
    
    public void setID(int id) {
        this.id= id;
    }
    
    public int getID() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary() {
        int raiseSalary = salary + (salary * 10 / 100);
        return raiseSalary;
    }

    public int getAnnualSalary() {
        annualSalary = salary * 12;
        return annualSalary;
    }

    public String toString() {
        return "Employee ID = " + id +
               "\nName = " + name +
               "\nSalary = " + salary +
               "\nAnnual Salary = " + annualSalary;
    }
}
