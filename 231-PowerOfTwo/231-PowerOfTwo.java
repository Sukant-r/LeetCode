// Last updated: 2/5/2026, 3:40:22 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
          return n > 0 && (n & (n - 1)) == 0;


    }
}