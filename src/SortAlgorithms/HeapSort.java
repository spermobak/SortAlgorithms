package SortAlgorithms;

import java.util.Arrays;

public class HeapSort {

    public void sort(double[] array)
    {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);
        for (int i = n - 1; i >= 0; i--) {
            SortTools.swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    void heapify(double[] array, int n, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest])
            largest = left;

        if (right < n && array[right] > array[largest])
            largest = right;

        if (largest != i) {
            SortTools.swap(array, i, largest);
            heapify(array, n, largest);
        }
    }

    public static void main(String[] args) {

        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        HeapSort ob = new HeapSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }

}
