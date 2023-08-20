package SortAlgorithms;

import java.util.Arrays;

public class ShellSort {

    void sort(double[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                double temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        ShellSort ob = new ShellSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
