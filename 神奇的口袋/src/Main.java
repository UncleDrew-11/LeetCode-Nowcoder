import java.util.Scanner;

public class Main {
    public static int num;
    public static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            num = sc.nextInt();
            nums = new int[num];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            int count = fun(0, 40);
            System.out.println(count);
        }
    }

    static int fun(int i, int sum) {
        //结束
        if (i == num) return 0;
        //刚好够，注意，这里还可以不填充继续递归

        if (nums[i] == sum) {
            return 1 + fun(i + 1, sum);
        }
        else if (sum > nums[i]) {
            return fun(i + 1, sum - nums[i]) + fun(i + 1, sum);
        }

        //sum<record[i]
        return fun(i + 1, sum);
    }
}
