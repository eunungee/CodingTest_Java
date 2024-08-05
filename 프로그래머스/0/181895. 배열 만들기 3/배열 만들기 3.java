import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0], b1 = intervals[0][1], a2 = intervals[1][0], b2 = intervals[1][1];
        List<Integer> num = new ArrayList<>();
        for (int i = a1; i <= b1; i++) {
            num.add(arr[i]);
        }
        for (int i = a2; i <= b2; i++) {
            num.add(arr[i]);
        }
        return num.stream().mapToInt(i->i).toArray();
    }
}