/*
Shortest Distance to Target String in a Circular Array

Difficulty - Easy
Runtime - 0 ms
Memory - 43.56 MB
Time - 14 min
 */
public class Task2515 {

  public int closetTarget(String[] words, String target, int startIndex) {

    int n = words.length;
    if (n == 0) {
      return -1;
    }

    if (target.equals(words[startIndex])) {
      return 0;
    }

    int left = (startIndex - 1 + n) % n;
    int right = (startIndex + 1) % n;
    int steps = 1;

    while (left != right) {
      if (target.equals(words[left]) || target.equals(words[right])) {
        return steps;
      }
      else {
        left = (left - 1 + n) % n;
        right = (right + 1) % n;
        steps++;
      }
    }

    return target.equals(words[left]) ? steps : -1;
  }
}
