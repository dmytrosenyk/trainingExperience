/*
Longest Palindromic Substring

Difficulty - Medium
Runtime - 62 ms
Memory - 45 MB
Time - 34 min
 */
public class Task5 {

  public String longestPalindrome(String s) {

    int n = s.length();
    boolean[][] dp = new boolean[n][n];
    int start = 0;
    int maxLength = 1;

    for (int i = 0; i < n; i++) {
      dp[i][i] = true;
    }

    for (int i = 0; i < n - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        dp[i][i + 1] = true;
        start = i;
        maxLength = 2;
      }
    }

    for (int length = 3; length <= n; length++) {
      for (int i = 0; i < n - length + 1; i++) {
        int j = i + length - 1;

        if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
          dp[i][j] = true;

          if (length > maxLength) {
            start = i;
            maxLength = length;
          }
        }
      }
    }

    return s.substring(start, start + maxLength);
  }
}
