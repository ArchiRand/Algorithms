
/**
 * - O(n^2)
 */
public class CocktailSort {

    public static void sort(int[] a) {
        long start = System.currentTimeMillis();
        int left = 0, right = a.length - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (a[i - 1] > a[i]) {
                    swap(a, i - 1, i);
                }
            }
            left++;
        }
        System.out.printf("Cocktail Sort ==> %f\n",(double)(System.currentTimeMillis() - start));
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

























/*
        int left = 0;
        int right = a.length - 1;
        while(left <= right) {
            for(int i = left; i < right; i++) {
                if(a[i] > a[i + 1])
                    swap(a, i,i + 1);
            }
            right--;

            for(int i = right; i > left; i--) {
                if(a[i -1] > a[i])
                    swap(a, i - 1, i);
            }
            left++;
        }
 */