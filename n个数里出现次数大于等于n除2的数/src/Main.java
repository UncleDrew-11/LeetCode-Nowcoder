import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 4, 5, 6, 2, 2, 2, 2};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        Collections.sort(list);
        int ret = list.get(list.size() / 2 - 1);
        System.out.println(ret);

    }
}