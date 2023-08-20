package SortAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    void sort (double[] array){
        boolean isSortet = false;
        while (!isSortet) {
            isSortet = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    isSortet = false;
                    SortTools.swap(array, j, j+1);
                }
            }
        }
    }



    public static void main(String[] args) {

        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        BubbleSort ob = new BubbleSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
