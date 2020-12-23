import java.util.Arrays;
import java.util.Random;
public class repeated_tester {
    public static void main(String[] args) {
        int size = 10;
        Random object = new Random();
        for (int i = 0; i < 10000; i++) {
            Random created = new Random(object.nextInt());
            int[] list1 = new int[size];
            for (int j = 0; j < size; j++) {
                list1[j] = created.nextInt() % 10;
            }
            int[] list2 = Arrays.copyOf(list1, list1.length);
            int[] list3 = Arrays.copyOf(list1, list1.length);
            int[] list4 = Arrays.copyOf(list1, list1.length);
            Arrays.sort(list1);
            Sorts.bubbleSort(list2);
            Sorts.selectionSort(list3);
            Sorts.insertionSort(list4);
            if (Arrays.equals(list1,list2)) {System.out.println("bubble: correct");} else {System.out.println("bubble: incorrect");}
            if (Arrays.equals(list1,list3)) {System.out.println("selection: correct");} else {System.out.println("selection: incorrect");}
            if (Arrays.equals(list1,list4)) {System.out.println("insertion: correct");} else {System.out.println("insertion: incorrect");}
        }
    }
}