/*
 * @lc app=leetcode id=2520 lang=java
 *
 * [2520] Count the Digits That Divide a Number
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.countDigits(7);
    System.out.println(answer);
    answer = s.countDigits(121);
    System.out.println(answer);
  }
  public int countDigits(int num) {
    int answer = 0;
    int tempNum = num;

    while (num > 0) {
      int digit = num % 10;
      num /= 10;
      if (tempNum % digit == 0)
        answer++;
    }

    return answer;
  }
}
// @lc code=end
