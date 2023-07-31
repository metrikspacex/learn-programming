/*
 * @lc app=leetcode id=2119 lang=java
 *
 * [2119] A Number After a Double Reversal
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    boolean answer = s.isSameAfterReversals(526);
    System.out.println(answer);
    answer = s.isSameAfterReversals(1800);
    System.out.println(answer);
    answer = s.isSameAfterReversals(0);
    System.out.println(answer);
  }
  public boolean isSameAfterReversals(int num) {
    return num == 0 || num % 10 > 0;
  }
}
// @lc code=end
