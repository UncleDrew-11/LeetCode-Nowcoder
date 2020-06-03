import java.util.*;

public class Main {
    public static int[] exchangeAB(int[] AB) {
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[0] ^ AB[1];
        return AB;
    }

    public static void main(String[] args) {
        int[] AB = {1, 2};
        exchangeAB(AB);
    }
}