// Last updated: 2/5/2026, 3:40:26 PM
class Solution {
    public int trailingZeroes(int n) {
         int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;


    }
}