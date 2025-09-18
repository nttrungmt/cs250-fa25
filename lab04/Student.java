package lab04;
import java.io.Serializable;
public class Student implements Serializable {
    private int id;                 //student's ID
    private String name;            //student's name
    private double grade;           //student's grade
    
    //empty constructor method
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    
    //get and set methods
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }

    @Override
    public String toString() {
        return id + "," + name + "," + grade;
    }
    
    public static Student fromString(String line) {
        //TODO: add missing code below
    }
}
