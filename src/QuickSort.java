/**
 * + O(n+log n)
 * + Один из самых быстрых алгоритмов общего назначения
 * + Работает на структурах данных с последовательным доступом
 *
 * - Может деградировать до сложности O(n^2)
 * - Может потребовать O(n) памяти и вызвать переполнение стека
 *
 */
public class QuickSort {

    public static void sort(int[] a) {
        qsort(a, 0, a.length - 1);
    }

    private static void qsort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start, j = end, op = i - (i - j) / 2;
        while (i < j) {
            while (i < op && a[i] <= a[op]) {
                i++;
            }
            while (op < j && a[op] <= a[j]) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
                if (op == i) {
                    op = j;
                } else if (op == j){
                    op = i;
                }
            }
        }

        qsort(a, start, op);
        qsort(a, op + 1, end);
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
