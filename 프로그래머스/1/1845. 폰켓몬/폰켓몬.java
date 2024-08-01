import java.util.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> pokemon = new ArrayList<>();
        Arrays.sort(nums);
        pokemon.add(nums[0]);
        for (int idx = 1; idx < nums.length; idx++) {
            if (nums[idx] != nums[idx - 1]) {
                pokemon.add(nums[idx]);
            }
        }
        if (pokemon.size() > (nums.length / 2)) {
            return nums.length / 2;
        } else {
            return pokemon.size();
        } 
    }
}