import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> binaryNums = new ArrayList<Integer>();
        ArrayList<Integer> fiveNums = new ArrayList<Integer>();
        int maxNum = Integer.parseInt("111111", 2);
        for (int i = 1; i <= maxNum; i++) {
            String binary = Integer.toBinaryString(i);
            binaryNums.add(Integer.parseInt(binary));
            int fiveNum = binaryNums.get(i-1)*5;
            if (fiveNum >= l && fiveNum <= r) {
                fiveNums.add(fiveNum);
            }
        }
        if (fiveNums.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] answer = new int[fiveNums.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = fiveNums.get(i);
            }
            return answer;
        }
    }
}