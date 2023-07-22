/*
 * @lc app=leetcode id=2413 lang=java
 *
 * [2413] Smallest Even Multiple
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.smallestEvenMultiple(10);
    System.out.println(answer);
  }
  public int smallestEvenMultiple(int n) {
    if (n % 2 == 0)
      return n;
    else
      return n * 2;
  }
}
// @lc code=end
