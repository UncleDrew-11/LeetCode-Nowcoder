import java.util.Scanner;


public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String[] split = input.split(" ");
            int firstUper = 0;
            int firstUnder = 0;
            int lastUper = 0;
            int lastUnder = 0;

            String first[] = split[0].split("/");
            String last[] = split[2].split("/");

            firstUper = Integer.parseInt(first[0]);
            firstUnder = Integer.parseInt(first[1]);
            lastUper = Integer.parseInt(last[0]);
            lastUnder = Integer.parseInt(last[1]);
            if (split[1].equals("+")) {
                System.out.println(plus(firstUper, firstUnder, lastUper, lastUnder));
            } else if (split[1].equals("-")) {
                System.out.println(red(firstUper, firstUnder, lastUper, lastUnder));
            } else if (split[1].equals("*")) {
                System.out.println(mul(firstUper, firstUnder, lastUper, lastUnder));
            } else {
                //"÷"
                System.out.println(div(firstUper, firstUnder, lastUper, lastUnder));
            }
        }
    }

    private static String red(int firstUper, int firstUnder, int lastUper, int lastUnder) {
        int uper = 0;//分子
        int under = 0;//分母
        if (firstUnder == lastUnder) {
            under = firstUnder;
            uper = firstUper - lastUper;
        } else {
            under = firstUnder * lastUnder;
            uper = (firstUper * lastUnder) - (lastUper * firstUnder);
        }
        int yueshu = gcd(uper, under);
        uper = uper / yueshu;
        under = under / yueshu;
        if (uper == 0) {
            return "0";
        }
        if (uper < 0 && under < 0 || uper > 0 && under > 0) {
            if (uper == under) {
                return "1";
            }
            if (uper % under == 0) {
                return (uper / under) + "";
            }
            return uper + "/" + under;
        } else {
            uper = Math.abs(uper);
            under = Math.abs(under);
            uper = -uper;
            if (uper % under == 0) {
                return (uper / under) + "";
            }
            return uper + "/" + under;
        }
    }

    private static String mul(int firstUper, int firstUnder, int lastUper, int lastUnder) {
        int uper = 0;//分子
        int under = 0;//分母
        under = firstUnder * lastUnder;
        uper = firstUper * lastUper;
        int yueshu = gcd(uper, under);
        uper = uper / yueshu;
        under = under / yueshu;
        if (uper == 0) {
            return "0";
        }
        if (uper < 0 && under < 0 || uper > 0 && under > 0) {
            if (uper == under) {
                return "1";
            }
            if (uper % under == 0) {
                return (uper / under) + "";
            }
            return uper + "/" + under;
        } else {
            uper = Math.abs(uper);
            under = Math.abs(under);
            uper = -uper;
            if (uper % under == 0) {
                return (uper / under) + "";
            }
            return uper + "/" + under;
        }
    }

    private static String div(int firstUper, int firstUnder, int lastUper, int lastUnder) {
        int uper = 0;//分子
        int under = 0;//分母
        under = firstUnder * lastUper;
        uper = firstUper * lastUnder;
        int yueshu = gcd(uper, under);
        uper = uper / yueshu;
        under = under / yueshu;
        if (uper == 0) {
            return "0";
        }
        if (uper < 0 && under < 0 || uper > 0 && under > 0) {
            if (uper == under) {
                return "1";
            }
            if (uper % under == 0) {
                return (uper / under) + "";
            }
            return uper + "/" + under;
        } else {
            uper = Math.abs(uper);
            under = Math.abs(under);
            uper = -uper;
            if (uper % under == 0) {
                return (uper / under) + "";
            }
            return uper + "/" + under;
        }
    }

    private static String plus(int firstUper, int firstUnder, int lastUper, int lastUnder) {
        int uper = 0;//分子
        int under = 0;//分母
        if (firstUnder == lastUnder) {
            under = firstUnder;
            uper = firstUper + lastUper;
        } else {
            under = firstUnder * lastUnder;
            uper = (firstUper * lastUnder) + (lastUper * firstUnder);
        }
        int yueshu = gcd(uper, under);
        uper = uper / yueshu;
        under = under / yueshu;
        if (uper == 0) {
            return "0";
        }
        if (uper < 0 && under < 0 || uper > 0 && under > 0) {
            if (uper == under) {
                return "1";
            }
            if (uper % under == 0) {
                return (uper / under) + "";
            }
            return uper + "/" + under;
        } else {
            uper = Math.abs(uper);
            under = Math.abs(under);
            uper = -uper;
            if (uper % under == 0) {
                return (uper / under) + "";
            }
            return uper + "/" + under;
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
}
