import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        List<Integer> ingredients = new ArrayList<>();
        for (int i : ingredient) {
            ingredients.add(i);
        }
        int cnt = 0;
        int i = 3;
        while(i < ingredients.size()) {
            if (ingredients.get(i - 3) == 1 && ingredients.get(i - 2) == 2 && ingredients.get(i - 1) == 3 && ingredients.get(i) == 1) {
                cnt++;
                ingredients.remove(i - 3);
                ingredients.remove(i - 3);
                ingredients.remove(i - 3);
                ingredients.remove(i - 3);
                if (i - 4 < 3) {
                    i = 3;
                } else {
                    i -= 4;
                }
            } else {
                i++;
            }
        }
        return cnt;
    }
}