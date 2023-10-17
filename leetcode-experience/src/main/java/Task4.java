/*
Median of Two Sorted Arrays

Difficulty - Hard
Runtime - 2 ms
Memory - 44.56 MB
Time - 28 min
 */
public class Task4 {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int totalLength = nums1.length + nums2.length;
    int[] mergedArray = new int[totalLength];
    int p1 = 0, p2 = 0, p3 = 0;

    while (p1 < nums1.length && p2 < nums2.length) {
      if (nums1[p1] < nums2[p2]) {
        mergedArray[p3++] = nums1[p1++];
      }
      else {
        mergedArray[p3++] = nums2[p2++];
      }
    }

    while (p1 < nums1.length) {
      mergedArray[p3++] = nums1[p1++];
    }

    while (p2 < nums2.length) {
      mergedArray[p3++] = nums2[p2++];
    }

    if (totalLength % 2 == 0) {
      int mid1 = mergedArray[totalLength / 2 - 1];
      int mid2 = mergedArray[totalLength / 2];
      return (double) (mid1 + mid2) / 2;
    }
    else {
      return mergedArray[totalLength / 2];
    }
  }
}
