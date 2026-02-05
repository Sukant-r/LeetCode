// Last updated: 2/5/2026, 3:39:50 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int takeOnes = Math.min(k, numOnes);
        k -= takeOnes;
        
       
        int takeZeros = Math.min(k, numZeros);
        k -= takeZeros;
        
      
        int takeNegOnes = k; 
        
        return takeOnes * 1 + takeZeros * 0 + takeNegOnes * -1;

 
    }
}