https://leetcode.com/problems/find-the-original-typed-string-i/?envType=daily-question&envId=2025-07-01

class Solution {
    public int possibleStringCount(String word) {
         int n = word.length();
        int count = 1; // Original string without any shortening

        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int len = j - i;
            if (len > 1) {
                count += (len - 1); // We can shorten this group in (len - 1) ways
            }
            i = j; // Move to the next group
        }

        return count;
    }
}
