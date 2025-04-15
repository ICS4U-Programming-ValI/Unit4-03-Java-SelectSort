import java.util.Arrays;
import java.util.Random;

/**
 * This is the package for SelectSort.java
 *
 * The SelectSort program makes a random array.
 * it displays an array of 10 integers,
 * displays the array in numerical order,
 * using insert sort.
 *
 * <p>This class satisfies style checkers.</p>
 *
 * @version 1.0
 * @since 2025-04-11
 */

public final class SelectSort {

    /**
     * The size of the array to be populated. */
    private static final int ARRAYSIZE = 10;

    /**
     * This method sorts an array using the bubble sort algorithm.
     *
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] selectSort(final int[] array) {
        // Selection sort algorithm
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private SelectSort() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args unused.
     */
    public static void main(final String[] args) {
        Random rand = new Random();
        int[] arrayOfInts = new int[ARRAYSIZE];
        int[] sortedArray = new int[ARRAYSIZE];


        // populate array with random numbers
        for (int i = 0; i < ARRAYSIZE; i++) {
            arrayOfInts[i] = rand.nextInt(100);
        }

        // print array to console
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arrayOfInts));

        // Call Bubble sort function
        sortedArray = selectSort(arrayOfInts);

        // print sorted array to console
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(sortedArray));

    }
}
