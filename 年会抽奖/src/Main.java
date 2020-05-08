import java.util.Scanner;
public class Main{
    public static float count(int n) {
        //这个函数用来得到有多少种可能，每个人拿不到自己的名字，
        //也就是得到分子
        if(n==1){
            //n=1的时候返回0
            return 0;
        }
        if(n==2){
            //n=2的时候返回1
            return 1;
        }else{
            //否则就递归。
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
    //下面的函数用来求阶乘，也是递归，最后得到分母
    public static float probability(int n){
        if(n==0){
            //0的阶乘等于1，不用多说吧
            return 1;
        }else{
            //阶乘表示，进行递归
            return n*probability(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            //将得到的分子分母进行相除，就可以得到概率了。
            float result = (count(n)/probability(n))*100;
            System.out.println(String.format("%.2f", result) + "%");
        } while (sc.hasNext());
    }
}