package SortAlgorithms;

import java.util.Arrays;


public class MSDRadixSort {

    void sort(int[] array) {
        int max = SortTools.MaxIntElement(array);
        for (int s = 1; max / s > 0; s *= 10)
            countingSortForRadix(array, s);
    }

    static void countingSortForRadix(int[] array, int s) {
        int[] countingArray = {0,0,0,0,0,0,0,0,0,0};
        int[] outputArray = new int[array.length];
        for (int i : outputArray) outputArray[i] = 0;
        for (int j : array) countingArray[(j / s) % 10]++;
        for (int i = 1; i < 10; i++)
            countingArray[i] += countingArray[i - 1];
        for (int i = array.length - 1; i >= 0; i--)
            outputArray[--countingArray[(array[i] / s) % 10]] = array[i];

        System.arraycopy(outputArray, 0, array, 0, array.length);
    }

    public static void main(String[] args) {

        int [] array = SortTools.randomIntArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        MSDRadixSort ob = new MSDRadixSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
