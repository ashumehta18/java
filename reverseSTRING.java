// Time Complexity: O(n) - StringBuilder reverse method
// Space Complexity: O(n) - StringBuilder stores the string
 public static String reverseString(String str) {
     StringBuilder sb = new StringBuilder(str);
     String rev = sb.reverse().toString();
     return rev;
}
