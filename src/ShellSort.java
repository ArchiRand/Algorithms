
/**
 * O(n^2)
 *
 * + Отсутствует потребность в памяти под стек
 * + Отсутствие деградация в отличии от быстрой
 * + На небольших объемах данных может работать быстрее пирамидальной сортировки
 */
public class ShellSort {

    public static void sort(int[] a) {
        long start = System.currentTimeMillis();
        int step = a.length / 2;
        while (step > 0) {
            for (int i = 0; i < (a.length - step); i++) {
                int j = i;
                while (j >= 0 && a[j] > a[j + step]) {
                    swap(a, j, j + step);
                    j--;
                }
            }
            step /= 2;
        }
        System.out.printf("Shell Sort ==> %f\n",(double)(System.currentTimeMillis() - start));
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
