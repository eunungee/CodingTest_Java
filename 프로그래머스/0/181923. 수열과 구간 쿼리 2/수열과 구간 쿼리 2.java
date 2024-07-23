class Solution {
    public static int[] solution(int[] arr, int[][] queries) {

        int[] min = new int[queries.length];

        for (int j = 0; j < queries.length; j++) {
            min[j] = 1000001;
            boolean check = true;

            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                if (arr[i] > queries[j][2] && arr[i] < min[j]) {
                    min[j] = arr[i];
                    check = false;
                }
            }
            if (check) {
                min[j] = -1;
            }
        }
        return min;
    }
}