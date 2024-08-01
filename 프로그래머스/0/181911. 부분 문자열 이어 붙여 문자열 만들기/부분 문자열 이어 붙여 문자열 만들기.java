class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        for (int idx = 0; idx < my_strings.length; idx++) {
            answer.append(my_strings[idx].substring(parts[idx][0], parts[idx][1] + 1));
        }
        return answer.toString();
    }
}