import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int path;
            int lastPath;
            for (int i = 1;; i++) {
                path = Math.abs(fib(i) - a);
                lastPath = Math.abs(fib(i - 1) - a);
                if (path > lastPath) {
                    System.out.println(lastPath);
                    break;
                }
            }
        }
    }

    private static int fib(int n)//斐波那契函数
    {
        if (n==0)
        {
            return 0;
        }
        int a=0;
        int b=1;
        for(int i=1;i<n;i++)
        {
            b=a+b;
            a=b-a;
        }
        return b;
    }
}
