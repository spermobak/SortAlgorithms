package SortAlgorithms;

import java.util.Arrays;

public class QuickSort {

    void sort (double[] array, int minIndex, int maxIndex){

        if (array.length == 0 || minIndex >= maxIndex) return;

        int pivot = partition(array, minIndex, maxIndex);

            sort(array, minIndex, pivot);
            sort(array, pivot + 1, maxIndex);

    }

    int partition (double[] array, int minIndex, int maxIndex){
        double pivot = array[minIndex];
        int i = minIndex - 1;
        int j = maxIndex + 1;
        while (true){
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);
            if (i >= j) {
                return j;
            }
            SortTools.swap(array, i, j);
        }
    }

    public static void main(String[] args) {

        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        QuickSort ob = new QuickSort();
        ob.sort(array, 0, array.length-1);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
