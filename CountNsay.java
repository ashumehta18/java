https://leetcode.com/problems/count-and-say/H

// Time Complexity: O(n * m) - n iterations, each processing string of length m
// Space Complexity: O(m) - String builder grows with result string length
class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = describe(result);
        }
        return result;
    }

    private String describe(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 2;
        count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }

        sb.append(count).append(s.charAt(s.length() - 1));
        return sb.toString();
        // return sb.toString();
    }
}
