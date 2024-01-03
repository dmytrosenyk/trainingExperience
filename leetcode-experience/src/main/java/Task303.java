/*
Range Sum Query - Immutable

Difficulty - Easy
Runtime - 54 ms
Memory - 49.93 MB
Time - 7 min
 */
public class Task303 {

  private int[] nums;

  public Task303(int[] nums) {

    this.nums = nums;
  }

  public int sumRange(int left, int right) {

    int sum = 0;
    for (int i = left; i <= right; i++) {
      sum += nums[i];
    }
    return sum;
  }
}
