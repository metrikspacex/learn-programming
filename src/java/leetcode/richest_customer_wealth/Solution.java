/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.maximumWealth(new int[][] {{1, 2, 3}, {3, 2, 1}});
    System.out.println(answer);
  }
  public int maximumWealth(int[][] accounts) {
    int max = 0;

    for (int[] account : accounts) {
      int total = 0;
      for (int statement : account) {
        total += statement;
      }
      if (max < total)
        max = total;
    }

    return max;
  }
}
// @lc code=end
