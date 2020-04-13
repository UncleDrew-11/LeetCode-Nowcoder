import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static String AddLongInteger(String addend, String augend) {
        BigInteger a = new BigInteger("0");
        BigInteger i = new BigInteger(addend);
        BigInteger j = new BigInteger(augend);
        if (i.compareTo(a) > 0 && j.compareTo(a) > 0) {
            i = i.add(j);
            String ret = i.toString();
            return ret;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String addend = sc.nextLine();
            String augend = sc.nextLine();
            System.out.println(AddLongInteger(addend, augend));
        }
    }
}
