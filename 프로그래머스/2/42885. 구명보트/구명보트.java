import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        //50 50 80 70
        boolean[] safe = new boolean[people.length];
        int cnt = 0;
        int min = 0;

        for (int i = people.length - 1; i >= 0; i--) {
            if (!safe[i]) {
                int boat = limit;
                boat -= people[i];
                safe[i] = true;
                cnt++;
                if (min < i && boat >= people[min]) {
                    safe[min] = true;
                    min++;
                }
            }
        }
        return cnt;
    }
}