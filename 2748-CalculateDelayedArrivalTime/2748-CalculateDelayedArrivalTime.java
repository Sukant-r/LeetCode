// Last updated: 2/5/2026, 3:39:49 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
         return (arrivalTime + delayedTime) % 24;
    }
}