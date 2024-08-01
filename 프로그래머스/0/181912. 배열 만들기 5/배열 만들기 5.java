import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> num = new ArrayList<>();
        for (String is : intStrs) {
            int temp = Integer.parseInt(is.substring(s, s + l));
            if (temp > k) {
                num.add(temp);
            }
        }
        return num.stream().mapToInt(i->i).toArray();
    }
}