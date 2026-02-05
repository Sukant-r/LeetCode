// Last updated: 2/5/2026, 3:39:40 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
         int sumSingle = 0, sumDouble = 0, totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
            if (num < 10) {
                sumSingle += num;
            } else {
                sumDouble += num;
            }
        }
        
        return (sumSingle > totalSum - sumSingle) || (sumDouble > totalSum - sumDouble);

    }
}