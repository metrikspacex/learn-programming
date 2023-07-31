/*
 * @lc app=leetcode id=1486 lang=java
 *
 * [1486] XOR Operation in an Array
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.xorOperation(5, 0);
    System.out.println(answer);
    answer = s.xorOperation(4, 3);
    System.out.println(answer);
  }
  public int xorOperation(int n, int start) {
    int answer = 0;

    int iterator = start;
    while (n > 0) {
      answer ^= iterator;
      iterator += 2;
      n -= 1;
    }

    return answer;
  }
}
// @lc code=end
