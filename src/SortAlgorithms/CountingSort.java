package SortAlgorithms;

import java.util.Arrays;

public class CountingSort {

    void sort(int[] array)
    {
        int n = array.length;

        int[] output = new int[n];
        int[] count = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;

        for (int k : array) ++count[k];

        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];


        for (int j : array) {
            output[count[j] - 1] = j;
            --count[j];
        }

        System.arraycopy(output, 0, array, 0, n);
    }

    public static void main(String[] args) {

        int[] array = SortTools.randomIntArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        CountingSort ob = new CountingSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
