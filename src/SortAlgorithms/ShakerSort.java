package SortAlgorithms;

import java.util.Arrays;

public class ShakerSort {

    void sort (double[] array){

        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped){
            swapped = false;
            for(int i = start; i < end - 1; i++){
                if(array[i] > array[i + 1]){
                    SortTools.swap(array, i, i+1);
                    swapped = true;
                }
            }
            if (!swapped) break;

            swapped = false;
            end -= 1;

            for (int i = end - 1; i >= start; i--){
                if (array[i] > array[i + 1]){
                    SortTools.swap(array, i, i + 1);
                    swapped = true;
                }
            }

            start += 1;
        }
    }

    public static void main(String[] args) {

        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        ShakerSort ob = new ShakerSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
