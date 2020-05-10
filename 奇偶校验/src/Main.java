import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            for (char c : str.toCharArray()) {
                String st1 = Integer.toBinaryString(c);//转化为二进制字符串
                String st2 = String.format("%07d", Integer.parseInt(st1));//变为七位的二进制字符串
                int count = 0;
                for (int i = 0; i < 7; i++) {
                    if (st2.charAt(i) == '1') {
                        count++;//记录二进制字符串中为1的个数
                    }
                }
                if (count % 2 == 0) {
                    //1的个数是偶数
                    System.out.println("1" + st2);
                } else {
                    //1的个数是奇数
                    System.out.println("0" + st2);
                }
            }
        }
    }
}
