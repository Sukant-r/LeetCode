// Last updated: 2/5/2026, 3:39:41 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
       int distance = 0;
        
        while (mainTank > 0) {
            
            mainTank--;
            distance += 10;
            
          
            if (distance % 50 == 0 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }
        
        return distance;

 
    }
}