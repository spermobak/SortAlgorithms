package SortAlgorithms;

import java.util.Arrays;

public class GnomeSort {

    void sort (double[] array){
        int index = 0;

        while (index < array.length) {
            if (index == 0)
                index++;
            if (array[index] >= array[index - 1])
                index++;
            else {
                SortTools.swap(array, index, index - 1);
                index--;
            }
        }
    }

    public static void main(String[] args) {
        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        GnomeSort ob = new GnomeSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
