import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> scv = new PriorityQueue<Integer>();
        for (int s : scoville) {
            scv.add(s);
        }
        int cnt = 0;
        while (scv.size() > 1 && scv.peek() < K) {
            scv.offer(scv.poll() + scv.poll() * 2);
            cnt++;
        }
        return scv.peek() < K ? -1 : cnt;
    }
}