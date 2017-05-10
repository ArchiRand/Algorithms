/**
 * O(n^2)
 */
public class InsertSort {

    public static void sort(int[] a) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < a.length; i++) {
            int cur = a[i];
            int prev = i - 1;
            while (prev >= 0 && a[prev] > cur) {
                a[prev + 1] = a[prev];
                prev--;
            }
            a[prev + 1] = cur;
        }
        System.out.printf("Insert Sort ==> %f\n",(double)(System.currentTimeMillis() - start));
    }
}
