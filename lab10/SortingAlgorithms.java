public class SortingAlgorithm {
    /**
     * Sort the integer array using the insertion sort algorithm
     * @param arrInt: the integer array to be sorted
     * @return: none (this method will internally modify the order of elements of the array)
     */
    private static void insertionSort(int[] arrInt) {
        //TODO add code below
    }

    /**
     * Merge two sorted subarrays: left=array[low:mid] and right=array[mid+1:high]
     * @param array: the integer array to be sorted
     * @param low: the leftmost index of left subarray
     * @param mid: the rightmost index of left subarray
     * @param high: the rightmost index of the right subarray
     * @return: none
     */
    public static void merge(int[] array, int low, int mid, int high) {
        //TODO add code below
    }

    /**
     * Perform Merge Sort on the range specified by low and high indexes of the array
     * @param array: the integer array to be sorted
     * @return: none (this method will internally modify the order of elements of the array)
     */
    private static void mergeSort(int[] array, int low, int high) {
        //TODO add code below
    }

    /**
     * Perform Merge Sort on the array
     * @param array: the integer array to be sorted
     * @return: none (this method will internally modify the order of elements of the array)
     */
    private static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length-1);
    }

    /**
     * Partition the part of the array specified by low, high into three parts: left, pivot, right
     * @param array: the array to be sorted
     * @param low: the lowerbound index of the range
     * @param high: the upperbound index of the range
     * @return: the location of the pivot (should be between low and high)
     */
    public static int partition(int[] array, int low, int high) {
        //TODO add code below
    }

    /**
     * Perform Quick Sort on the range specified by low and high indexes of the array
     * @param array: the integer array to be sorted
     * @return: none (this method will internally modify the order of elements of the array)
     */
    private static void quickSort(int[] array, int low, int high) {
        //TODO add code below
    }

    /**
     * Perform Quick Sort on the array
     * @param array: the integer array to be sorted
     * @return: none (this method will internally modify the order of elements of the array)
     */
    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length-1);
    }
    
    public static void main(String[] args) {
        int[] arrInt = {53, 81, 78, 4, 9, 66, 59, 16, 59, 49};
        //TODO add code below
    }
}
