/*
Max Consecutive Ones

Difficulty - Easy
Runtime - 2 ms
Memory - 44.04 MB
Time - 3 min
 */
public class Task485 {

  public int findMaxConsecutiveOnes(int[] nums) {

    int max = 0;
    int cur = 0;

    for (int n : nums) {
      if (n == 1) {
        cur++;
        max = Math.max(max, cur);
      }
      else {
        cur = 0;
      }
    }
    return max;
  }
}
