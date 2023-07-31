/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4});
    System.out.println(answer);
  }

  public int maxSubArray(int[] nums) {
    int currentSum = 0;
    int maxSum = nums[0];

    for (int num : nums) {
      if (currentSum < 0)
        currentSum = 0;
      currentSum += num;
      if (maxSum < currentSum)
        maxSum = currentSum;
    }

    return maxSum;
  }
}
// @lc code=end
