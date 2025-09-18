package lab04;

import java.util.*;
import java.io.*;
public class StudentGradeManager {
    private ArrayList<Student> listStudent; //store the collection of Student objects

    public StudentGradeManager() {          //constructor method
        this.listStudent = new ArrayList<>();
    }

    // This method displays all Student records on the Console
    public void show() {
        for(Student obj : listStudent)
             System.out.println(obj);
    }

    // This method adds a new Student object to the listStudent
    public void addStudent(int id, String name, double grade) {
        listStudent.add(new Student(id, name, grade));
    }

    /* This method loads Student objects from a text file into listStudent
     * @param filePath: The input file path
     * @return none
     */
    public void loadFromTextFile(String filePath) {
        //TODO: add code below
    }    
    
    /* This method writes the Student objects in listStudent to a text file
     * @param path: the output file path
     * @return none
     */
    public void saveToTextFile(String filePath) {
        //TODO: add code below
    }

    /* This method loads Student objects from a binary file into listStudent
     * @param filePath: The input file path
     * @return none
     */
    public void loadFromBinaryFile(String filePath) {
        //TODO: add code below
    }    
    
    /* This method writes the Student objects in listStudent to a binary file
     * @param path: the output file path
     * @return none
     */
    public void saveToBinaryFile(String filePath) {
        //TODO: add code below
    }
    
     //the program entry point
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //use to read user's command
        StudentGradeManager manager = new StudentGradeManager(); //the data manager instance
        while(true) {
            System.out.print("StudentGradeManager> ");  //prompt for the user to enter the command
            String line = sc.nextLine();                //read the command line
            String[] cmds = line.split("\\s+");         //split it to extract the command and arguments
            if(cmds[0].equalsIgnoreCase("exit") {               //EXIT command
                break;              //break the loop and exit the program
            } else if(cmds[0].equalsIgnoreCase("show")) {       //SHOW command
                manager.show();     //display the person list
            } else if(cmds[0].equalsIgnoreCase("add"))          //ADD command to add a new person to the list
			{
				//TODO: add the code to handle the add command
			} else if(cmds[0].equalsIgnoreCase("load"))         //Load data from text/binary file
			{
				//TODO: add the code to handle the load command
			} else if(cmds[0].equalsIgnoreCase("save"))         //SAVE data to text/binary file
			{
				//TODO: add the code to handle the save command
			} else {
				System.err.println("Unsupported command");
			}
        }
    }
}
