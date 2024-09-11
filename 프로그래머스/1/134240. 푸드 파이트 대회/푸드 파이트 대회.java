import java.util.*;
class Solution {
    public String solution(int[] food) {
        //음식 순서대로 배치할 Deque생성
        Deque<Integer> foodOrder = new ArrayDeque<>();
        //물(0)을 가운데에 넣어줌
        foodOrder.add(0);
        //마지막 음식(칼로리가 가장 높은 음식)부터 2로 나눈 몫만큼 Deque의 양쪽에 넣어줌 ~ 1번 음식까지
        for (int i = food.length - 1; i >= 0; i--) {
            int times = food[i] / 2;
            while (times > 0) {
                foodOrder.add(i);
                foodOrder.addFirst(i);
                times--;
            }
        }
        //String으로 변환 후 return
        StringBuilder str = new StringBuilder();
        while (!foodOrder.isEmpty()) {
            str.append(foodOrder.pollFirst());
        }
        return str.toString();
    }
}