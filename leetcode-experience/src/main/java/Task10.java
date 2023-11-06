/*
Regular Expression Matching

Difficulty - Hard
Runtime - 1 ms
Memory - 40.94 MB
Time - 28 min
 */
public class Task10 {

  public boolean isMatch(String s, String p) {

    Boolean[][] memo = new Boolean[s.length() + 1][p.length() + 1];
    return work(0, 0, s, p, memo);
  }

  public boolean work(int i, int j, String text, String pattern, Boolean[][] memo) {

    if (memo[i][j] != null) {
      return memo[i][j];
    }

    boolean ans;
    if (j == pattern.length()) {
      ans = i == text.length();
    }
    else {
      boolean firstMatch = (i < text.length() && (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.'));
      if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
        ans = (work(i, j + 2, text, pattern, memo) || (firstMatch && work(i + 1, j, text, pattern, memo)));
      }
      else {
        ans = (firstMatch && work(i + 1, j + 1, text, pattern, memo));
      }
    }
    memo[i][j] = ans;
    return ans;
  }
}
