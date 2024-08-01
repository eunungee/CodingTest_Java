class Solution {
    public int solution(String my_string, String is_suffix) {
        for (int idx = 0; idx < my_string.length(); idx++) {
            if (is_suffix.equals(my_string.substring(idx))) {
                return 1;
            }
        }
        return 0;
    }
}