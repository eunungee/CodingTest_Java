import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] suffix = new String[my_string.length()];
        for (int idx = 0; idx < my_string.length(); idx++) {
            suffix[idx] = my_string.substring(idx);
        }
        Arrays.sort(suffix);
        return suffix;
    }
}