package SortAlgorithms;

import java.util.Arrays;

public class ExchangeSort {

    void sort(double[] array) {
        int size = array.length;
        int i, j;
        for (i = 0; i < size - 1; i++) {
            for (j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    SortTools.swap(array, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        ExchangeSort ob = new ExchangeSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
