/*
Container With Most Water

Difficulty - Medium
Runtime - 5 ms
Memory - 55.68 MB
Time - 17 min
 */
public class Task11 {

  public int maxArea(int[] height) {

    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {
      int x = Math.min(height[left], height[right]);
      int currentArea = x * (right - left);
      maxArea = Math.max(maxArea, currentArea);

      if (height[left] < height[right]) {
        left++;
      }
      else {
        right--;
      }
    }

    return maxArea;
  }
}
