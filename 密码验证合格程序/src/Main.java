import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String code = sc.nextLine();
            if (code.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            int kind = 0;
            if (containsBig(code)) {
                kind++;
            }
            if (containsSmall(code)) {
                kind++;
            }
            if (containsNumber(code)) {
                kind++;
            }
            if (containsOthers(code)) {
                kind++;
            }
            if (kind < 3) {
                System.out.println("NG");
                continue;
            }
            if (isRepeat(code)) {
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
    }

    private static boolean isRepeat(String code) {
        for (int i = 0; i < code.length() - 3; i++) {
                for (int j = i + 1; j <= code.length() - 3; j++) {
                    String a = code.substring(i, i + 3);
                    String b = code.substring(j, j + 3);
                    if (a.equals(b)) {
                        return true;
                    }
                }
        }
        return false;
    }

    private static boolean containsOthers(String code) {
        for (char c : code.toCharArray()) {
            if (c < '0' ||
                    (c > '9' && c < 'A') ||
                    (c > 'Z' && c < 'a') ||
                    (c > 'z')) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsNumber(String code) {
        for (char c : code.toCharArray()) {
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSmall(String code) {
        for (char c : code.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                return true;
            }
        }
        return false;
    }

    private static boolean containsBig(String code) {
        for (char c : code.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
        }
        return false;
    }
}
