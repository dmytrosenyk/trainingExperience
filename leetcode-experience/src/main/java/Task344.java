/*
Reverse String

Difficulty - Easy
Runtime - 0 ms
Memory - 50.44 MB
Time - 12 min
 */
public class Task344 {

  public void reverseString(char[] s) {

    int i = 0;
    int j = s.length - 1;

    while (i < j) {
      char x = s[i];
      s[i] = s[j];
      s[j] = x;
      i++;
      j--;
    }
  }
}
