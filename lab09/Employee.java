package lab09;

public class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName()        { return name;       }
    public String getDepartment()  { return department; }
    public double getSalary()      { return salary;     }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', department='%s', salary=%.2f}", 
                             name, department, salary);
    }
}
