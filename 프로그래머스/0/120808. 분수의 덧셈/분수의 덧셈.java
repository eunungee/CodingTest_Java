class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int denom3 = denom1 * denom2;
        int divisor = gcd(numer3, denom3);
        return new int[]{numer3 / divisor, denom3 / divisor};
    }

    public int gcd(int m, int n) {
        if (m == n) {
            return m;
        } else if (m < n) {
            return gcd(m, n - m);
        } else {
            return gcd(m - n, n);
        }
    }
}