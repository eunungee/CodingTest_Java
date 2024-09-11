import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int cnt = 0;

        //할인 기간을 10일씩 앞에서부터 끊어서 확인
        for (int i = 0; i < discount.length - 9; i++) {
            //할인하는 제품명과 수량을 10일 단위로 끊어서 확인하기
            Map<String, Integer> discountMap = new HashMap<>();
            
            //10일간 할인하는 제품명과 수량 파악
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            //할인 리스트가 구매 원하는 리스트와 같은지 확인
            boolean check = true;
            for (int w = 0; w < want.length; w++) {
                if (discountMap.get(want[w]) == null || discountMap.get(want[w]) != number[w]) {
                    check = false;
                }
            }
            if (check) cnt++;
        }
        return cnt;
    }
}