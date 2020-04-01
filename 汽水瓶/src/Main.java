import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int emptyBottle = sc.nextInt();
            if (emptyBottle == 0) {
                break;
            }
            int fullBottle = 0;
            int newCoca = 0;
            while (emptyBottle > 1) {
                fullBottle = emptyBottle / 3;
                newCoca += emptyBottle / 3;
                emptyBottle = fullBottle + emptyBottle % 3;
                if (emptyBottle == 2) {
                    newCoca += 1;
                    break;
                }
            }
            System.out.println(newCoca);
        }
    }
}