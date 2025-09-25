package lab05;

public class Employee {
    private int ssn;            //the SSN of this employee
    private String name;        //name of the employee
    private double salary;      //salary of the employee

    //Constructor method
    public Employee(int ssn, String name, double salary) {
        this.ssn = ssn;
        this.name = name;
        this.salary = salary;
    }
    
    //get methods
    public int getSsn()       { return ssn;     }
    public String getName()   { return name;    }
    public double getSalary() { return salary;  }

    //Overrided toString() method
    public String toString() {
        return "ssn: " + ssn + ", name: " + name + ", salary: " + salary;
    }
}
