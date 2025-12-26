https://leetcode.com/problems/count-the-hidden-sequences/description/?envType=daily-question&envId=2025-04-21

// Time Complexity: O(n) - Single pass through differences array
// Space Complexity: O(1) - Only constant extra space used
class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min = 0, max = 0, sum = 0;
        for (int diff : differences) {
            sum += diff;
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }
        
        long startMin = lower - min;
        long startMax = upper - max;
        
        long result = startMax - startMin + 1;
        return (int)Math.max(0, result);
    }
}
