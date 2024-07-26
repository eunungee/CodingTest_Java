import java.util.*;


public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for (int idx = 1; idx < arr.length; idx++) {
            if (arr[idx] != arr[idx - 1]) {
                list.add(arr[idx]);
            }
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for (int num : list) {
            answer[idx] = list.get(idx);
            idx++;
        }
        return answer;
    }
}