package SortAlgorithms;

import java.util.Arrays;

public class RadixSort {

    static int getMax(int[] array)
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    static void countSort(int[] array, int size, int exp)
    {
        int[] output = new int[size]; // output array
        int i;
        int[] count = new int[10];
        Arrays.fill(count,0);

        for (i = 0; i < size; i++)
            count[ (array[i]/exp)%10 ]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = size - 1; i >= 0; i--)
        {
            output[count[ (array[i]/exp)%10 ] - 1] = array[i];
            count[ (array[i]/exp)%10 ]--;
        }

        for (i = 0; i < size; i++)
            array[i] = output[i];
    }

    void sort(int[] array)
    {
        int max = getMax(array);

        for (int exp = 1; max/exp > 0; exp *= 10)
            countSort(array, array.length, exp);
    }

    public static void main(String[] args) {

        int[] array = SortTools.randomIntArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        RadixSort ob = new RadixSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
