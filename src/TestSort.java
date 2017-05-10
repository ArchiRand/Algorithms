import java.text.CollationKey;
import java.util.*;

public class TestSort {

    static int[] a;

    static void fillArray() {
        a = new int[10];
        for(int i = 0; i < a.length; i++)
            a[i] = (int)(Math.random() * 100);
//            a[i] = i + 1;
    }

    public static void main(String[] args) {

        fillArray();
        System.out.println(Arrays.toString(a));
        CocktailSort.sort(a);
        System.out.println(Arrays.toString(a));
//        System.out.println(BinarySearch.search(a,10));
//        int[] w = new int[]{1, 2, 3, 2};
//        int[] c = new int[]{100, 200, 300, 250};
//        System.out.println(backBack(w, c, 4));
    }

    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }

        System.out.println();
    }
}