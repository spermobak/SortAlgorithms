package SortAlgorithms;

import java.util.Arrays;

public class TimSort {

    static int MIN_MERGE = 32;

    public static int minRunLength(int n)
    {
        assert n >= 0;

        int r = 0;
        while (n >= MIN_MERGE) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    public static void insertionSort(double[] array, int left,
                                     int right)
    {
        for (int i = left + 1; i <= right; i++) {
            double temp = array[i];
            int j = i - 1;
            while (j >= left && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    void sort(double[] array, int n)
    {
        int minRun = minRunLength(MIN_MERGE);

        for (int i = 0; i < n; i += minRun) {
            insertionSort(
                    array, i,
                    Math.min((i + MIN_MERGE - 1), (n - 1)));
        }

        for (int size = minRun; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1),
                        (n - 1));
                if (mid < right)
                    MergeSort.merge(array, left, mid, right);
            }
        }
    }


    public static void main(String[] args) {

        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        TimSort ob = new TimSort();
        ob.sort(array, array.length);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }

}
