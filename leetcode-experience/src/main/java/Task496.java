/*
Next Greater Element I

Difficulty - Easy
Runtime - 5 ms
Memory - 41.90 MB
Time - 9 min
 */
public class Task496 {

  public int[] nextGreaterElement(int[] nums1, int[] nums2) {

    int[] num = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      int greaterElement = -1;
      int j = nums2.length - 1;
      while (j >= 0 && nums2[j] != nums1[i]) {
        if (nums2[j] > nums1[i]) {
          greaterElement = nums2[j];
        }
        j--;
      }
      num[i] = greaterElement;
    }
    return num;
  }
}
