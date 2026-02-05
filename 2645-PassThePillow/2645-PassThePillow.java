// Last updated: 2/5/2026, 3:39:54 PM
class Solution {
    public int passThePillow(int n, int time) {
       int cycle = 2 * (n - 1);
        int pos = time % cycle;
        
        if (pos < n) {
            return pos + 1; // forward direction
        } else {
            return n - (pos - (n - 1)); // backward direction
        }

 
    }
}