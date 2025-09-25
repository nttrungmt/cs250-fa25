package lab05;
import java.util.Arrays;

public class ArraySearch {
    /** Search the index of a value in an integer array.
     * @param arrInt - an array containing the elements to be searched.
     * @param target - the element to be found in arrInt.
     * @return the index of the target in the array if found; -1 otherwise.
     */
    public static int linearSearch(int[] arrInt, int target) {
        //TODO 1: add code below
    }

    /** Search and return the Employee that matches the given name in the array.
     * @param arrEmp- an array of Employee objects
     * @param name - the Employee’s name to be found in arrEmp.
     * @return the Employee object in the array if found; null otherwise.
     */
    public static Employee linearSearch(Employee[] arrEmp, String name) {
        //TODO 2: add code below
    }

    /**
     * Implement the binary search to search for the target index in arrInt. 
     * Return -1 if not found.
     */
    public static int binarySearch(int[] arrInt, int target) {
       //TODO 3: add code below
    }

    /** Implement binary search to search for an Employee that matches the name
     * @param arrEmp - an array of Employee objects
     * @param name - the Employee’s name to be found in arrEmp.
     * @return the Employee object in the array if found; null otherwise.
     */
    public static Employee binarySearch(Employee[] arrEmp, String name) {
        //TODO 4: add code below
    }

    /* the main application method */
    public static void main(String[] args) {
        int[] arrInt = { 1, 5, 4, 8, 3, 2 };
        //Test linear search on arrInt
        System.out.println("linearSearch of 8 in arrInt: " + linearSearch(arrInt, 8));
        System.out.println("linearSearch of 15 in arrInt: " + linearSearch(arrInt, 15));
        //TODO 5: Add code to test binary search on arrInt below
        
        Employee[] arrEmp = new Employee[5];
        arrEmp[0] = new Employee( 237860451, "Callum", 30000);
        arrEmp[1] = new Employee( 867584562, "Blake", 45000);
        arrEmp[2] = new Employee( 628457851, "Kayden", 50000);
        arrEmp[3] = new Employee( 784583166, "Colin", 60000);
        arrEmp[4] = new Employee( 789451263, "James", 55000);
        //Test linear search on arrEmp
        System.out.println("linearSearch of Employee named Blake: " + linearSearch(arrEmp, "Blake"));
        System.out.println("linearSearch of Employee named Jane: "  + linearSearch(arrEmp, "Jane"));
        //TODO 6: Add code to test binary search on arrEmp below
    }
}
