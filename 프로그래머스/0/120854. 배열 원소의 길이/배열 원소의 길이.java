class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int idx = 0; idx < answer.length; idx++) {
            answer[idx] = strlist[idx].length();
        }
        return answer;
    }
}