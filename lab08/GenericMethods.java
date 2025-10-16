package lab08;
import java.util.List;
import java.util.LinkedList;

public class GenericMethods {
    /**
      * The generic method to print an array of a generic type
      * @param arrObj: the array of the generic type E
      * @return: none
      */
    private static <E> void printArray(E[] arrObj) {
        //TODO: add code below
    }
    /**
     * The generic method to linear search an item on a given list
     * @param listObj: the list of objects of generic type E
     * @param target: The element to search in the list
     * @return: the index of such an element in the given list, -1 if not found
     */
    private static <E extends Comparable<E>> int linearSearch(List<E> listObj, E target) {
        //TODO add code below
    }

    public static void main(String[] args) {
        //TODO add code below
    }
}
