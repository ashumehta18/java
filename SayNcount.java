https://leetcode.com/problems/count-and-say/submissions/1612169720/

// Time Complexity: O(n * m) - n iterations, each processing string of length m
// Space Complexity: O(m) - StringBuilder for current result
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        String result = "1";
        
        for (int i = 2; i <= n; i++) {
            StringBuilder current = new StringBuilder();
            int count = 1;
            char prevChar = result.charAt(0);
            
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == prevChar) {
                    count++;
                } else {
                    current.append(count).append(prevChar);
                    prevChar = result.charAt(j);
                    count = 1;
                }
            }
            
            current.append(count).append(prevChar); // Append last group
            result = current.toString();
        }
        
        return result;
    }
}
