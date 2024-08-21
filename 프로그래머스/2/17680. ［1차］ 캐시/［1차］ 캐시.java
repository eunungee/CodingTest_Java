import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        Deque<String> cache = new ArrayDeque<String>();
        int runTime = 0;

        if (cacheSize == 0) {
            runTime = cities.length * 5;
            return runTime;
        }

        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();

            if (cache.contains(cities[i])) {
                cache.remove(cities[i]);
                cache.offerLast(cities[i]);
                runTime += 1;
            } else if (cache.size() < cacheSize) {
                cache.offerLast(cities[i]);
                runTime += 5;
            } else {
                cache.pollFirst();
                cache.offerLast(cities[i]);
                runTime += 5;
            }
        }
        return runTime;
    }
}