class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        for (int idx1 = n; idx1 < num_list.length; idx1++) {
            answer[idx] = num_list[idx1];
            idx++;
        }
        for (int idx2 = 0; idx2 < n; idx2++) {
            answer[idx] = num_list[idx2];
            idx++;
        }
        return answer;
    }
}