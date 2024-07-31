class Solution {
   public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        for (int idx = 1; idx < numLog.length; idx++) {
            if (numLog[idx] - numLog[idx - 1] == 1) {
                answer.append("w");
            } else if (numLog[idx] - numLog[idx - 1] == -1) {
                answer.append("s");
            } else if (numLog[idx] - numLog[idx - 1] == 10) {
                answer.append("d");
            } else if (numLog[idx] - numLog[idx - 1] == -10) {
                answer.append("a");
            }
        }
        return answer.toString();
    }
}