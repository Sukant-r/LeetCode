// Last updated: 2/5/2026, 3:39:43 PM
class Solution {
    public String winningPlayer(int x, int y) {
       int turns = Math.min(x, y / 4);
        return (turns % 2 == 1) ? "Alice" : "Bob";

 
    }
}