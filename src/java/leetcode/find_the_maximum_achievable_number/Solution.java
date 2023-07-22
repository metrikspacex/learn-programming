/*
 * @lc app=leetcode id=2769 lang=java
 *
 * [2769] Find the Maximum Achievable Number
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.theMaximumAchievableX(4, 1);
    System.out.println(answer);
  }
  public int theMaximumAchievableX(int num, int t) { return (t * 2) + num; }
}
// @lc code=end
