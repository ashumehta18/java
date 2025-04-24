https://leetcode.com/problems/count-complete-subarrays-in-an-array/?envType=daily-question&envId=2025-04-24

import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int totalCount = 0;

        Set<Integer> distinctSet = new HashSet<>();
        for (int num : nums) {
            distinctSet.add(num);
        }
        int distinctTotal = distinctSet.size();

        
        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                seen.add(nums[j]);
                if (seen.size() == distinctTotal) {
                    totalCount++;
                }
            }
        }

        return totalCount;
    }
}
