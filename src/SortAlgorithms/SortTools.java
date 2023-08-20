package SortAlgorithms;

public class SortTools {
    public static void swap(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static double[] randomDoubleArray(){
        int rand = (int)(Math.random() * 10) + 1;
        double[] array = new double[rand];
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random()*100 - 50;
        }
        return array;
    }

    public static int[] randomIntArray(){
        int rand = (int)(Math.random() * 20) + 1;
        int[] array = new int[rand];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100 + 1);
        }
        return array;
    }

    public static int MaxIntElement(int [] array){
        int max = array[0];
        for (int k = 1; k < array.length; k++) {
            if (max < k) {
                max = k;
            }
        }
        return max;
    }

    public static double MaxDoubleElement(double [] array){
        double max = array[0];
        for (int k = 1; k < array.length; k++) {
            if (max < k) {
                max = k;
            }
        }
        return max;
    }

    public static double MinDoubleElement(double [] array){
        double max = array[0];
        for (int k = 1; k < array.length; k++) {
            if (max > k) {
                max = k;
            }
        }
        return max;
    }

}
