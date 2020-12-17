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
}