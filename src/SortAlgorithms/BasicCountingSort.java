package SortAlgorithms;

import java.util.Arrays;

public class BasicCountingSort {

    void sort(int[] array){
        int max = SortTools.MaxIntElement(array);

        int[] freq = new int[max + 1];
        for (int i = 0; i < max + 1; i++)
        {
            freq[i] = 0;
        }
        for (int k : array) {
            freq[k]++;
        }

        for (int i = 0, j = 0; i <= max; i++)
        {
            while (freq[i] > 0)
            {
                array[j] = i;
                j++;
                freq[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] array = SortTools.randomIntArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        BasicCountingSort ob = new BasicCountingSort();
        ob.sort(array);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }
}
