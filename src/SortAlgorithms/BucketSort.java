package SortAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class BucketSort {

    void sort(double[] array) {
        int size = array.length;
        if (size == 0)
            return;

        double minValue = SortTools.MinDoubleElement(array);
        double maxValue = SortTools.MaxDoubleElement(array);
        @SuppressWarnings("unchecked")
        ArrayList<Double>[] buckets = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (double v : array) {
            int bucketIndex = (int) ((v - minValue) / (maxValue - minValue) * (size - 1));
            buckets[bucketIndex].add(v);
        }

        for (int i = 0; i < size; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < size; i++) {
            for (Double value : buckets[i]) {
                array[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        BucketSort ob = new BucketSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
