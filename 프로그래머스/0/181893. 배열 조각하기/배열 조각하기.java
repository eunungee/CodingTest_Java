import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        // 작업을 수행할 배열의 시작과 끝 인덱스를 추적합니다.
        int start = 0;
        int end = arr.length;
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스: query[i]번 인덱스 뒤를 자름
                end = start + query[i] + 1;
            } else {
                // 홀수 인덱스: query[i]번 인덱스 앞을 자름
                start = start + query[i];
            }
        }
        
        // 최종 남은 배열을 반환
        return Arrays.copyOfRange(arr, start, end);
    }
}