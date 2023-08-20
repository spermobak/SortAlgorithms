package SortAlgorithms;

import java.util.Arrays;

public class MergeSort {

    void sort(double[] arr, int left, int right)
    {
        if (left < right) {
            int middle = (left + right) / 2;

            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    static void merge(double[] arr, int left, int middle, int right)
    {
        int left_size = middle - left + 1;
        int right_size = right - middle;

        double[] L = new double[left_size];
        double[] R = new double[right_size];

        System.arraycopy(arr, left, L, 0, left_size);
        for (int j = 0; j < right_size; ++j)
            R[j] = arr[middle + 1 + j];


        int i = 0, j = 0;

        int k = left;
        while (i < left_size && j < right_size) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < left_size) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < right_size) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {

        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        MergeSort ob = new MergeSort();
        ob.sort(array, 0, array.length - 1);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}