/**
 * + O(n * log n) time complexity
 * + o(1) memory complexity
 *
 * - На почти отсортированных массивах работает так же долго как и на хаотически
 * - Требуется мгновенный прямой доступ к данным
 * - До нескольких тысяч N быстрее будет сортировка Shell
 */
public class HeapSort {

    private static int heapSize;

    public static void sort(int[] a) {
        buildHeap(a);
        while (heapSize > 0) {
            swap(a, 0, --heapSize);
            rebuildHeap(a, 0);
        }
    }

    private static void buildHeap(int[] a) {
        heapSize = a.length;
        for (int i = a.length / 2; i >= 0; i--) {
            rebuildHeap(a, i);
        }
    }

    private static void rebuildHeap(int[] a, int i) {
        int l = left(i), r = right(i), largest = i;
        if (l < heapSize && a[i] < a[l]) {
            largest = l;
        }
        if (r < heapSize && a[largest] < a[r]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, i, largest);
            rebuildHeap(a, largest);
        }
    }

    private static int left(int i) {
        return 2 * i + 1;
    }

    private static int right(int i) {
        return 2 * i + 2;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}





























/*
 public static void sort(int[] a) {
        buildHeap(a);

        while(heapSize > 1) {
            swap(a, 0, heapSize - 1);
            heapSize--;
            rebuildHeap(a, 0);
        }
    }

    private static void buildHeap(int[] a) {
        heapSize = a.length;
        for(int i = a.length / 2; i >= 0; i--)
            rebuildHeap(a, i);
    }

    private static void rebuildHeap(int[] a, int i) {
        int left = left(i), right = right(i), largest = i;
        if(left < heapSize && a[i] < a[left])
            largest = left;
        if(right < heapSize && a[largest] < a[right])
            largest = right;
        if(i != largest) {
            swap(a, i, largest);
            rebuildHeap(a, largest);
        }
    }
 */