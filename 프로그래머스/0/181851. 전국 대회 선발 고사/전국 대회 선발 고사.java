import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> finalRank = new ArrayList<Integer>();
        for (int idx = 0; idx < rank.length; idx++) {
            if (attendance[idx]) {
                finalRank.add(rank[idx]);
            }
        }
        Collections.sort(finalRank);
        int a = -1, b = -1, c = -1;
        for (int idx = 0; idx < rank.length; idx++) {
            if (rank[idx] == finalRank.get(0)) {
                a = idx;
            } else if (rank[idx] == finalRank.get(1)) {
                b = idx;
            } else if (rank[idx] == finalRank.get(2)) {
                c = idx;
            }
        }
        return 10000 * a + 100 * b + c;
    }
}