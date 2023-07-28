/*
 * @lc app=leetcode id=2006 lang=java
 *
 * [2006] Count Number of Pairs With Absolute Difference K
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.countKDifference(new int[] {1, 2, 2, 1}, 1);
    System.out.println(answer);
  }
  public int countKDifference(int[] nums, int k) {
    int answer = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        if (Math.abs(nums[i] - nums[j]) == k && i < j)
          answer++;
      }
    }

    return answer;
  }
}
// @lc code=end
