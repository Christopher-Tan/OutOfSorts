import java.util.*;
public class Sorts{
    public static void bubbleSort(int[] data) {
        boolean no_swap = false;
        for (int i = 0; i < data.length && !no_swap; i++) {
            no_swap = true;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    no_swap = false;
                }
            }
        }
    }
    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minimum = data[i];
            int index = i;
            for (int j = i; j < data.length; j++) {
                if (data[j] < minimum) {
                    minimum = data[j];
                    index = j;
                }
            }
            data[index] = data[i];
            data[i] = minimum;
        }
    }
    public static void insertionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            
        }
    }
}