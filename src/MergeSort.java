import java.util.Arrays;

/**
 * O(n*log n) time complexity
 * O(n) memory complexity
 * + Подходит для структур данных с последовальным доступом
 * + Не имеет трудный входных данных
 * + Устойчив - сохраняет порядок равных элементов
 *
 * - Работает также долго на почти отсортированных как и на не отсотированных
 * - Требует дополнительную память в размере исходного массива
 */
public class MergeSort {

    public static int[] sort(int[] a) {
        if (a.length == 1) {
            return a;
        }
        int length = a.length;
        int mid = length / 2;
        return merge(sort(Arrays.copyOfRange(a, 0, mid)),
                sort(Arrays.copyOfRange(a, mid, length)));
    }

    private static int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0;
        for (int k = 0; k < res.length; k++) {
            if (j == b.length || (i < a.length && a[i] < b[j])) {
                res[k] = a[i++];
            } else {
                res[k] = b[j++];
            }
        }
        return res;
    }
}
