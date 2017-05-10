/**
 * O(n^2) time complexity
 * O(1) memory complexity
 */
public class SelectionSort {

    public static void sort(int[] a) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    index = j;
                }
            }
            if (i != index) {
                swap(a, i, index);
            }
        }
        System.out.printf("Selection Sort ==> %f\n",(double)(System.currentTimeMillis() - start));
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
