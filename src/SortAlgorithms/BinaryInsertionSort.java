package SortAlgorithms;

import java.util.Arrays;

public class BinaryInsertionSort {

    public void sort(double[] array) {
        for (int i = 1; i < array.length; i++) {
            double x = array[i];

            int j = Math.abs(
                    Arrays.binarySearch(array, 0,
                            i, x) + 1);
            System.arraycopy(array, j,
                    array, j + 1, i - j);
            array[j] = x;
        }
    }

    public static void main(String[] args) {
        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        BinaryInsertionSort ob = new BinaryInsertionSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
