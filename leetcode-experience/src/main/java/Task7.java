/*
Reverse Integer

Difficulty - Medium
Runtime - 2 ms
Memory - 39.5 MB
Time - 8 min
 */
public class Task7 {

  public int reverse(int x) {

    StringBuilder result = new StringBuilder();
    String resultSt;
    int val;

    int q = 1;
    if (x < 0) {
      q = -1;
    }
    try {
      resultSt = result.append(x * q)
          .reverse()
          .toString();
      val = Integer.parseInt(resultSt);
      return val * q;
    }
    catch (NumberFormatException e) {
      return 0;
    }
  }
}
