class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        for (int idx = 0; idx < code.length(); idx++) {
            if (idx % q == r) {
                answer.append(code.charAt(idx));
            }
        }
        return answer.toString();
    }
}