import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();

        for (char c : S.toCharArray()) {
            if (c != '#') {
                sList.add(c);
            } else {
                if (sList.size() > 0) {
                    sList.remove(sList.size() - 1);
                }
            }
        }
        for (char c : T.toCharArray()) {
            if (c != '#') {
                tList.add(c);
            } else {
                if (tList.size() > 0) {
                    tList.remove(tList.size() - 1);
                }
            }
        }

        if (sList.size() != tList.size()) {
            return false;
        }

        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i) != tList.get(i)) {
                return false;
            }
        }
        return true;
    }
}