import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        for (int idx = 0; idx < answers.length; idx++) {
            if (answers[idx] == student1[idx % student1.length]) {
                cnt1++;
            }
            if (answers[idx] == student2[idx % student2.length]) {
                cnt2++;
            }
            if (answers[idx] == student3[idx % student3.length]) {
                cnt3++;
            }
        }
        int cnt = Math.max(cnt1, Math.max(cnt2, cnt3));
        List<Integer> answer = new ArrayList<>();
        if (cnt1 == cnt) {
            answer.add(1);
        }
        if (cnt2 == cnt) {
            answer.add(2);
        }
        if (cnt3 == cnt) {
            answer.add(3);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}