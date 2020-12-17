import java.util.Arrays;
import java.util.Random;
public class Tester {
    public static void main(String[] args) {
        int[] a = {5,1,12,-5,16};
        Sorts.bubbleSort(a);
        System.out.println(Arrays.toString(a));
        int[] b = {2,3,4,5,1};
        Sorts.bubbleSort(b);
        System.out.println(Arrays.toString(b));
        int[] c = {6,1,2,3,4,5};
        Sorts.bubbleSort(c);
        System.out.println(Arrays.toString(c));
        int seed = new Random().nextInt();
        System.out.println("seed:" + seed);
        Random object = new Random(seed);
        int[] d = new int[10];
        for (int i = 0; i < 10; i++) {
            d[i] = object.nextInt();
        }
        System.out.println("starting:" + Arrays.toString(d));
        Sorts.bubbleSort(d);
        System.out.println("ending:" + Arrays.toString(d));
        Arrays.sort(d);
        System.out.println("sorted:" + Arrays.toString(d));

        int[] e = new int[0];
        System.out.println("starting:" + Arrays.toString(e));
        Sorts.bubbleSort(e);
        System.out.println("ending:" + Arrays.toString(e));
        Arrays.sort(e);
        System.out.println("sorted:" + Arrays.toString(e));
        
        int[] f = {0};
        System.out.println("starting:" + Arrays.toString(f));
        Sorts.bubbleSort(f);
        System.out.println("ending:" + Arrays.toString(f));
        Arrays.sort(f);
        System.out.println("sorted:" + Arrays.toString(f));
    }
}