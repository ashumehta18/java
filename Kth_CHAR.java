https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/?envType=daily-question&envId=2025-07-03

class Solution {
public:
    char kthCharacter(int k) {
        
        return __builtin_popcount(k-1) + 'a';
    
    }
};
