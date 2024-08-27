class Solution {
    public String solution(String n_str) {
        boolean check = true;

        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) == '0') {
                continue;
            } else {
                check = false;
                return n_str.substring(i, n_str.length());
            }
        }
        return n_str;
    }
}