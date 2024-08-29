class Solution {
    public int solution(int n, int k) {
        int price = 12000 * n;
        price += 2000 * (k - (n / 10));
        return price;
    }
}