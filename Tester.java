import java.util.Arrays;
import java.util.Random;
public class Tester {
    public static void main(String[] args) {
        int[] a = {5,1,12,-5,16};
        Sorts.selectionSort(a);
        System.out.println(Arrays.toString(a));
        int[] b = {2,3,4,5,1};
        Sorts.selectionSort(b);
        System.out.println(Arrays.toString(b));
        int[] c = {6,1,2,3,4,5};
        Sorts.selectionSort(c);
        System.out.println(Arrays.toString(c));
        int seed = new Random().nextInt();
        System.out.println("seed:" + seed);
        Random object = new Random(seed);
        int[] d = new int[10];
        for (int i = 0; i < 10; i++) {
            d[i] = object.nextInt();
        }
        System.out.println("starting:" + Arrays.toString(d));
        Sorts.selectionSort(d);
        System.out.println("ending:" + Arrays.toString(d));
        Arrays.sort(d);
        System.out.println("sorted:" + Arrays.toString(d));

        int[] e = new int[0];
        System.out.println("starting:" + Arrays.toString(e));
        Sorts.selectionSort(e);
        System.out.println("ending:" + Arrays.toString(e));
        Arrays.sort(e);
        System.out.println("sorted:" + Arrays.toString(e));
        
        int[] f = {0};
        System.out.println("starting:" + Arrays.toString(f));
        Sorts.selectionSort(f);
        System.out.println("ending:" + Arrays.toString(f));
        Arrays.sort(f);
        System.out.println("sorted:" + Arrays.toString(f));
        
        int[] g = {64,25,12,22,11};
        System.out.println("starting:" + Arrays.toString(g));
        Sorts.selectionSort(g);
        System.out.println("ending:" + Arrays.toString(g));
        Arrays.sort(g);
        System.out.println("sorted:" + Arrays.toString(g));
    }
}