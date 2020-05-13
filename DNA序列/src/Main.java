import java.util.Scanner;

public class Main {
    public static float judge(String str, String G, String C) {
        int countA = 0;
        int countB = 0;
        float ret = 0;
        for (char c : str.toCharArray()) {
            if (G.equals(c)) {
                countA++;
            }
            if (C.equals(c)) {
                countB++;
            }
        }
        ret = (float)countA / countB;
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int n = sc.nextInt();
            int flag = 5;
            StringBuffer sb = new StringBuffer(str);
            while (flag <= str.length()) {
                sb.insert(flag, " ");
                flag += 5;
            }
            str = sb.toString();
            String[] arr = str.split(" ");
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (judge(arr[max], "G", "C") < judge(arr[i], "G", "C")) {
                    max = i;
                }
            }
            System.out.println(arr[max]);
        }
    }
}
