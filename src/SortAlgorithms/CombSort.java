package SortAlgorithms;

import java.util.Arrays;

public class CombSort {

    void sort(double[] array) {
        int gap = array.length;
        boolean swapped = true;

        while (gap > 1 || swapped) {

            gap = (gap * 10) / 13;

            if (gap < 1) {
                gap = 1;
            }

            swapped = false;

            for (int i = 0; i < array.length - gap; i++) {
                if (array[i] > array[i + gap]) {
                    SortTools.swap(array, i, i + gap);
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {

        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        CombSort ob = new CombSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
