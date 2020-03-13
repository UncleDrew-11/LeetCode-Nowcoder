import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String right = sn.nextLine();
        String wrong = sn.nextLine();
        //首先把错误的保存
        Set<Character> wrongSet = new HashSet<>();
        for (char ch : wrong.toCharArray()) {
            wrongSet.add(ch);
        }
        Set<Character> printSet = new HashSet<>();
        //遍历正确的wrongset查找
        for (char ch : right.toCharArray()) {
            if (!wrongSet.contains(ch)) {
                ch = Character.toUpperCase(ch);
                if (!printSet.contains(ch)) {
                    printSet.add(ch);
                    System.out.print(ch);
                }
            }
        }
    }
}
