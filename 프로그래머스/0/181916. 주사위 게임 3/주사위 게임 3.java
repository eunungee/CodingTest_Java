import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        int score = 0;

        if (dice[0] == dice[3]) {
            score = 1111 * dice[0];

        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            int three = 0, one = 0;
            if (dice[0] == dice[2]) {
                three = dice[0];
                one = dice[3];
            } else {
                three = dice[3];
                one = dice[0];
            }
            score = (int) Math.pow(10 * three + one, 2);

        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            score = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);

        } else if (dice[0] != dice[1] && dice[1] != dice[2] && dice[2] != dice[3]) {
            score = dice[0];

        } else {
            if (dice[0] == dice[1]) score = dice[2] * dice[3];
            else if (dice[1] == dice[2]) score = dice[0] * dice[3];
            else score = dice[0] * dice[1];
        }
        return score;
    }
}