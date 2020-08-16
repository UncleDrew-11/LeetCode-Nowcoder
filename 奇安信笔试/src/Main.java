import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//hello undo redo world.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.length() == 0) {
                System.out.println("");
            }
            String[] split = str.split(" ");
            Stack<String> stack = new Stack<>();
            Stack<String> stackUndo = new Stack<>();
            for (int i = 0; i < split.length; i++) {
                if (split[i].equals("undo")) {
                    if (i == 0) {
                        stack.add("");
                        stackUndo.add("");
                    }
                    if (!stack.isEmpty()) {
                        stackUndo.add(stack.pop());
                    }
                } else if (split[i].equals("redo")) {
                    if (i != 0) {
                        stack.add(stackUndo.pop());
                    }
                } else {
                    stack.add(split[i]);
                }
            }
            Stack<String> ret = new Stack<>();
            while (!stack.isEmpty()) {
                ret.add(stack.pop());
            }
            StringBuilder sb = new StringBuilder();
            while (!ret.isEmpty()) {
                sb.append(ret.pop());
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
