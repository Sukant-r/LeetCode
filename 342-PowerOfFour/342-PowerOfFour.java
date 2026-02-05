// Last updated: 2/5/2026, 3:40:15 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) n /= 4;
        return n == 1;

 
    }
}