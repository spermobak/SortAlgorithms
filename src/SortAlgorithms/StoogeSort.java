package SortAlgorithms;

import java.util.Arrays;

public class StoogeSort {

    void sort (double[] array, int left, int right){
        if (left >= right)
            return;

        if (array[left] > array[right]) {
            SortTools.swap(array, left, right);
        }

        if (right - left + 1 > 2) {
            int border = (right - left + 1) / 3;

            sort(array, left, right - border);
            sort(array, left + border, right);
            sort(array, left, right - border);
        }
    }

    public static void main(String[] args) {
        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        StoogeSort ob = new StoogeSort();
        ob.sort(array, 0, array.length - 1);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
