package SortAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    void sort(double[] array)
    {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min_idx])
                    min_idx = j;
            }
            SortTools.swap(array, i, min_idx);
        }
    }

    public static void main(String[] args) {
        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        SelectionSort ob = new SelectionSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
