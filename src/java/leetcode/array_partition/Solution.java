/*
 * @lc app=leetcode id=561 lang=java
 *
 * [561] Array Partition
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.arrayPairSum(new int[] {1, 4, 3, 2});
    System.out.println(answer);
  }
  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int max = 0;

    for (int i = 0; i < nums.length; i += 2) {
      max += Math.min(nums[i], nums[i + 1]);
    }

    return max;
  }
}
// @lc code=end
