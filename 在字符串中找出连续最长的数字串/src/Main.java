import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String intStr = "";
            for (char c : str.toCharArray()) {
                if (c >= '0' && c <= '9') {
                    intStr += c;
                } else {
                    intStr += "a";
                }
            }
            String[] srr = intStr.split("a");
            int max = 0;
            for (int i = 0; i < srr.length; i++) {
                max = srr[i].length() > max ? srr[i].length() : max;
            }
            for (int i = 0; i < srr.length; i++) {
                if (srr[i].length() == max) {
                    System.out.println(srr[i]);
                }
            }
        }
    }
}