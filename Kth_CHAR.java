https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/?envType=daily-question&envId=2025-07-03

// Time Complexity: O(log k) - Counting bits in k-1
// Space Complexity: O(1) - Only constant extra space used
class Solution {
public:
    char kthCharacter(int k) {
        
        return __builtin_popcount(k-1) + 'a';
    
    }
};
