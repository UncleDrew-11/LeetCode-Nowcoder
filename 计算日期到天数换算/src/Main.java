import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            HashMap<Integer, Integer> allYear = new HashMap<>();
            allYear.put(1, 31);

            //二月单独
            if (isRunYear(year)) {
                allYear.put(2, 29);
            } else {
                allYear.put(2, 28);
            }

            allYear.put(3, 31);
            allYear.put(4, 30);
            allYear.put(5, 31);
            allYear.put(6, 30);
            allYear.put(7, 31);
            allYear.put(8, 31);
            allYear.put(9, 30);
            allYear.put(10, 31);
            allYear.put(11, 30);
            allYear.put(12, 31);

            if (day > allYear.get(month)) {
                System.out.println(-1);
            }
            System.out.println(iConverDateToDay(year, month, day));;
        }
    }

    private static int iConverDateToDay(int year, int month, int day) {

        int days = 0;
        if (isRunYear(year)) {
            for (int i = 1; i <= month - 1; i++) {
                switch (i) {
                    case 1: days += 31; break;
                    case 2: days += 29; break;
                    case 3: days += 31; break;
                    case 4: days += 30; break;
                    case 5: days += 31; break;
                    case 6: days += 30; break;
                    case 7: days += 31; break;
                    case 8: days += 31; break;
                    case 9: days += 30; break;
                    case 10: days += 31; break;
                    case 11: days += 30; break;
                    case 12: days += 31; break;
                }
            }
        } else {
            for (int i = 1; i <= month - 1; i++) {
                switch (i) {
                    case 1: days += 31; break;
                    case 2: days += 28; break;
                    case 3: days += 31; break;
                    case 4: days += 30; break;
                    case 5: days += 31; break;
                    case 6: days += 30; break;
                    case 7: days += 31; break;
                    case 8: days += 31; break;
                    case 9: days += 30; break;
                    case 10: days += 31; break;
                    case 11: days += 30; break;
                    case 12: days += 31; break;
                }
            }
            return days + day;
        }
        return days + day;
    }

    private static boolean isRunYear(int year) {
        if (year % 4  == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
