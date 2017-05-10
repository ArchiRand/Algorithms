
public class BubbleSort {

    public static void sort(int[] a) {
        long start = System.currentTimeMillis();
        for(int i = a.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(a[j] > a[j + 1]) {
                    swap(a, j, j+1);
                }
            }
        }
        System.out.printf("Bubble Sort ==> %f\n",(double)(System.currentTimeMillis() - start));
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
