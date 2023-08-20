package SortAlgorithms;

import java.util.Arrays;

public class CycleSort {

    void sort(double[] array)
    {
        int size = array.length;

        for (int cycle_start = 0; cycle_start <= size - 2; cycle_start++) {

            double item = array[cycle_start];

            int pos = cycle_start;
            for (int i = cycle_start + 1; i < size; i++)
                if (array[i] < item)
                    pos++;
            if (pos == cycle_start)
                continue;
            while (item == array[pos])
                pos += 1;
            if (pos != cycle_start) {
                double temp = item;
                item = array[pos];
                array[pos] = temp;
            }

            while (pos != cycle_start) {
                pos = cycle_start;
                for (int i = cycle_start + 1; i < size; i++)
                    if (array[i] < item)
                        pos += 1;
                while (item == array[pos])
                    pos += 1;
                if (item != array[pos]) {
                    double temp = item;
                    item = array[pos];
                    array[pos] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        CycleSort ob = new CycleSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
