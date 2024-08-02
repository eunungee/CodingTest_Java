import java.util.*;
class Solution {
    public int solution(int[] nums) {
        List<Integer> pokemon = new ArrayList<>();
        pokemon.add(nums[0]);
        for (int idx = 1; idx < nums.length; idx++) {
            if (!pokemon.contains(nums[idx])) {
                pokemon.add(nums[idx]);
            }
        }
        return Math.min(pokemon.size(), (nums.length / 2));
    }
}