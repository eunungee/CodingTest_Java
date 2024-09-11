import java.util.*;

public class Solution {
    public int solution(int n) {
        //n을 계속 2로 나누며 홀수면 -1을 하고 건전지 사용량 cnt값을 1 올림, 0이 될 때까지 진행
        int cnt = 0;
        while (n > 0) {
            //n이 짝수일 때
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                cnt++;
            }
        }
        return cnt;
    }
}