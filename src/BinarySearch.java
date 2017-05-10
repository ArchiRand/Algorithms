
public class BinarySearch {

    public static int search(int[] a, int x) {
        int i = -1;
        if (a != null) {
            int low = 0, mid, high = a.length;
            while (low < high) {
                mid = (low + high) >> 2;
                if (x == a[mid]) {
                    i = mid;
                    break;
                } else if (x < a[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return i;
    }
}
