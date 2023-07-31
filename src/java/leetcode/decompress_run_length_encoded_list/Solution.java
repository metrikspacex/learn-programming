/*
 * @lc app=leetcode id=1313 lang=java
 *
 * [1313] Decompress Run-Length Encoded List
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    // [2, 4, 4, 4]
    int[] answer = s.decompressRLElist(new int[] {1, 2, 3, 4});
    System.out.println(Arrays.toString(answer));
    // [1, 3, 3]
    answer = s.decompressRLElist(new int[] {1, 1, 2, 3});
    System.out.println(Arrays.toString(answer));
    // [3, 3, 4, 4, 4]
    answer = s.decompressRLElist(new int[] {2, 3, 3, 4});
    System.out.println(Arrays.toString(answer));
  }

  public int[] decompressRLElist(int[] nums) {
    int decompressedSize = 0;
    for (int i = 0; i < nums.length; i += 2) {
      decompressedSize += nums[i];
    }

    int[] decompressed = new int[decompressedSize];
    int lastPlace = 0;
    for (int i = 0; i < nums.length; i += 2) {
      int frequency = nums[i];
      int value = nums[i + 1];

      while (frequency > 0) {
        decompressed[lastPlace++] = value;
        frequency--;
      }
    }

    return decompressed;
  }
}
// @lc code=end
