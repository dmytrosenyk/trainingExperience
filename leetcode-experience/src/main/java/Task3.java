/*
Longest Substring Without Repeating Characters

Difficulty - Medium
Runtime - 2 ms
Memory - 41.53 MB
Time - 17 min
 */
public class Task3 {

  public int lengthOfLongestSubstring(String s) {

    if (s.length() <= 1)
      return s.length();

    int maxL = 1;
    int x = 0;
    for (int i = 1; i < s.length(); i++) {
      int index = s.indexOf(s.charAt(i), x);
      if (index < i)
        x = index + 1;
      maxL = Math.max(maxL, i - x + 1);
    }

    return maxL;
  }
}
