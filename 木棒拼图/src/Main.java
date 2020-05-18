import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            ArrayList<Long> sticks = new ArrayList();
            for (int i = 0; i < num; i++) {

                int method = sc.nextInt();
                if (method == 1) {
                    //添加一个长度
                    Long target = sc.nextLong();
                    sticks.add(target);
                    System.out.println(isPolygon(sticks) == true ? "Yes" : "No");
                } else {
                    //删除一个长度
                    for (Long a : sticks) {
                        int delete = sc.nextInt();
                        if (a == delete) {
                            sticks.remove(a);
                            System.out.println(isPolygon(sticks) == true ? "Yes" : "No");
                            break;
                        }
                    }
                }

            }
        }
    }

    private static boolean isPolygon(ArrayList<Long> sticks) {
        int max = 0;
        int sum = 0;
        for (Long a : sticks) {
            if (a > max) {
                max = Math.toIntExact(a);
            }
            sum += a;
        }
        if (sum == 1) {
            return false;
        }
        if (max < (sum - max)) {
            return true;
        } else {
            return false;
        }
    }
}
