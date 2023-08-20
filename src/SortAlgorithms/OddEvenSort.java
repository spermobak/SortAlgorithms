package SortAlgorithms;

import java.util.Arrays;

public class OddEvenSort {

    void sort (double[] array){

        boolean swapped = true;

        while (swapped){
            swapped = false;
            for(int i = 0; i < array.length - 1; i += 2){
                if(array[i] > array[i + 1]){
                    SortTools.swap(array, i, i+1);
                    swapped = true;
                }
            }
            if (!swapped) break;

            swapped = false;
            for (int i = 1; i < array.length - 1; i += 2){
                if (array[i] > array[i + 1]){
                    SortTools.swap(array, i, i + 1);
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {

        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        OddEvenSort ob = new OddEvenSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
