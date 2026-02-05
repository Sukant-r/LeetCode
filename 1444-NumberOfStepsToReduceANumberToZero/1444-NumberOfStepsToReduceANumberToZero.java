// Last updated: 2/5/2026, 3:40:07 PM
class Solution {
    public int numberOfSteps(int num) {
       int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num -= 1;
            steps++;
        }
        return steps;

 
    }
}