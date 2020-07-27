import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            int max = 0;
            int count = 0;
            int end = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                    count++;
                    if (count > max) {
                        max = count;
                        end = i;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println(input.substring(end - max + 1, end));
        }
    }
}
