/*
Number Complement

Difficulty - Easy
Runtime - 6 ms
Memory - 39.95 MB
Time - 5 min
 */
public class Task476 {

  public int findComplement(int num) {

    String s = Integer.toString(num, 2);
    s = s.replaceAll("0", "2")
        .replaceAll("1", "0")
        .replaceAll("2", "1");

    return Integer.parseInt(s, 2);
  }
}
