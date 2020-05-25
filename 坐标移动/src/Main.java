import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String call = sc.nextLine();
            String[] split = call.split(";");
            Queue<String> callList = new LinkedList<>();
            int x = 0;
            int y = 0;
            for (int i = 0; i < split.length; i++) {
                if (isLegal(split[i])) {
                    callList.add(split[i]);
                }
            }
            while (!callList.isEmpty()){
                String s = callList.poll();
                int num = Integer.parseInt(s.substring(1, s.length()));
                if (s.charAt(0) == 'A') {
                    x -= num;
                }
                if (s.charAt(0) == 'S') {
                    y -= num;
                }
                if (s.charAt(0) == 'D') {
                    x += num;
                }
                if (s.charAt(0) == 'W') {
                    y += num;
                }
            }
            System.out.println(x + "," + y);
        }
    }

    private static boolean isLegal(String s) {
        if (s.equals("")) {
            return false;
        }
        if (s.charAt(0) == 'A' ||
                s.charAt(0) == 'S' ||
                s.charAt(0) == 'D' ||
                s.charAt(0) == 'W')    {


            char[] arr = s.toCharArray();
            for (int i = 1; i < arr.length; i++) {
                if (!Character.isDigit(arr[i])) {
                    return false;
                }
            }
            return true;

        } else {
            return false;
        }
    }

}
