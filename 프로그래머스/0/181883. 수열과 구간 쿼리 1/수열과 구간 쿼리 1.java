class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            answer[j] = arr[j];
        }
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j >= queries[i][0] && j <= queries[i][1]) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}