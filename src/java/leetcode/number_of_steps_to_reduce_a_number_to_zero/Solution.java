/*
 * @lc app=leetcode id=1342 lang=java
 *
 * [1342] Number of Steps to Reduce a Number to Zero
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.numberOfSteps(0);
    System.out.println(answer);
  }
  public int numberOfSteps(int num) {
    int count = 0;
    while (num != 0) {
      if (num % 2 == 0)
        num /= 2;
      else
        num -= 1;
      count++;
    }

    return count;
  }
}
// @lc code=end
