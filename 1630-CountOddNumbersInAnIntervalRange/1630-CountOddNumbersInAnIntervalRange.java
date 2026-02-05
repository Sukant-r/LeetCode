// Last updated: 2/5/2026, 3:40:05 PM
class Solution {
    public int countOdds(int low, int high) {
        return ((high - low) / 2) + ((low % 2 != 0 || high % 2 != 0) ? 1 : 0);


    }
}