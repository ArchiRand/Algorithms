import java.util.ArrayList;
import java.util.List;

public class FastDeletingFromList {

    public static List<Integer> fastDeleting(List<Integer> list, int from, int count) {
        List<Integer> result = new ArrayList<>(list);
        for (int i = from + count, k = 0; i < list.size(); i++, k++) {
            result.set(from + k, result.get(i));
        }
        System.out.println(result);
        int end = list.size() - 1;
        while (end != list.size() - 1 - count) {
            result.remove(end--);
        }
        return result;
    }

}
