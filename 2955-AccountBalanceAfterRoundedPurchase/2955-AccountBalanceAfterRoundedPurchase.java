// Last updated: 2/5/2026, 3:39:38 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
         int remainder = purchaseAmount % 10;
        int roundedAmount;
        
        if (remainder >= 5) {
            roundedAmount = purchaseAmount + (10 - remainder); // round up
        } else {
            roundedAmount = purchaseAmount - remainder; // round down
        }
        
        return 100 - roundedAmount;


    }
}