package SortAlgorithms;

import java.util.Arrays;

public class PancakeSort {

    void sort (double[] array){
        for (int curr_size = array.length; curr_size > 1; --curr_size) {
            int mi = findMax(array, curr_size);
            if (mi != curr_size - 1) {
                flip(array, mi);
                flip(array, curr_size - 1);
            }
        }
    }

    int findMax (double[] array, int size){
        int mi, i;
        for (mi = 0, i = 0; i < size; ++i)
            if (array[i] > array[mi])
                mi = i;
        return mi;
    }

    void flip(double[] array, int i)
    {
        int start = 0;
        while (start < i) {
            SortTools.swap(array, start, i);
            start++;
            i--;
        }
    }

    public static void main(String[] args) {
        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        PancakeSort ob = new PancakeSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
