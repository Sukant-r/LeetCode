// Last updated: 2/5/2026, 3:40:28 PM
class Solution {
    public boolean isPalindrome(int x) {
       if (x < 0) return false; // negatives not palindrome
        int original = x, reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;

  
    }
}