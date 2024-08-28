class Solution {
    public int[] solution(int[] num_list) {
        int leng = num_list.length;
        int[] answer = new int[leng];
        for (int n = 0; n < leng; n++) {
            answer[n] = num_list[leng - 1 - n];
        }
        return answer;
    }
}