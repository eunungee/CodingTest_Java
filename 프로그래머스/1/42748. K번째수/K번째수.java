import java.util.Arrays;
class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0], j = commands[idx][1], k = commands[idx][2];
            int[] arr = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(arr);
            answer[idx] = arr[k - 1];
        }
        return answer;
    }
}