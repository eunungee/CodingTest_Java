class Solution {
     public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        if (s != 0) {
            answer.append(my_string, 0, s);
        }
        for (int idx = e; idx >= s; idx--) {
            answer.append(my_string.charAt(idx));
        }
        if (e != my_string.length() - 1) {
            answer.append(my_string, e + 1, my_string.length());
        }
        return answer.toString();
    }
}