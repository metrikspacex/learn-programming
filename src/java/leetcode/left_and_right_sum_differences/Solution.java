/*
 * @lc app=leetcode id=2574 lang=java
 *
 * [2574] Left and Right Sum Differences
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.leftRightDifference(new int[] {10, 4, 8, 3});
    System.out.println(Arrays.toString(answer));
  }
  public int[] leftRightDifference(int[] nums) {
    int[] answer = new int[nums.length];
    int[] leftSum = new int[nums.length];
    int[] rightSum = new int[nums.length];

    Arrays.fill(leftSum, 0, nums.length, 0);
    Arrays.fill(rightSum, 0, nums.length, 0);
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        leftSum[i] = 0;
        rightSum[nums.length - 1] = 0;
      } else {
        leftSum[i] = leftSum[i - 1] + nums[i - 1];
        rightSum[nums.length - (i + 1)] =
            rightSum[nums.length - i] + nums[nums.length - i];
      }
    }

    for (int i = 0; i < leftSum.length; i++) {
      answer[i] = Math.abs(leftSum[i] - rightSum[i]);
    }

    return answer;
  }
}
// @lc code=end
