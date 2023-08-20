package SortAlgorithms;

import java.util.Arrays;

public class BogoSort {

    void sort(double[] array) {
        while (!isSorted(array))
            shuffle(array);
    }

    void shuffle(double[] array) {
        for (int i = 0; i < array.length; i++)
            SortTools.swap(array, i, (int) (Math.random() * i));
    }

    boolean isSorted(double[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }

    public static void main(String[] args) {

        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        BogoSort ob = new BogoSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }

}
