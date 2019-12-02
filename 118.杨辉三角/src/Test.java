import java.util.ArrayList;
import java.util.List;

public class Test {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> generate = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            generate.add(new ArrayList<>());//每一行建立一个list
            generate.get(i).add(1);//每一行开头加一个1
        }

        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < i; j++) {
                int ret = generate.get(i - 1).get(j - 1) + generate.get(i - 1).get(j);
                generate.get(i).add(ret);
            }
            generate.get(i).add(1);
        }
        return generate;
    }
}
