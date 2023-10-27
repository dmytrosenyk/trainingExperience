/*
String to Integer (atoi)

Difficulty - Medium
Runtime - 2 ms
Memory - 41.2 MB
Time - 17 min
 */
public class Task8 {

  public int myAtoi(String s) {

    s = s.trim();
    if (s.isEmpty())
      return 0;

    int index = 0;
    int sign = 1;
    if (s.charAt(index) == '+' || s.charAt(index) == '-')
      sign = (s.charAt(index++) == '-') ? -1 : 1;

    long result = 0;
    while (index < s.length() && Character.isDigit(s.charAt(index))) {
      result = result * 10 + (s.charAt(index++) - '0');
      if (result * sign > Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
      else if (result * sign < Integer.MIN_VALUE)
        return Integer.MIN_VALUE;
    }

    return (int) (result * sign);
  }
}
