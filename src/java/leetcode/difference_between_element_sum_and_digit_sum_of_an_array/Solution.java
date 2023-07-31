/*
 * @lc app=leetcode id=2535 lang=java
 *
 * [2535] Difference Between Element Sum and Digit Sum of an Array
 */

// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.differenceOfSum(new int[] {1, 15, 6, 3});
    System.out.println(answer);
  }

  public int differenceOfSum(int[] nums) {
    int sumDigit = 0;
    int sumElement = 0;

    for (int num : nums) {
      sumElement += num;
      while (num > 0) {
        int digit = num % 10;
        sumDigit += digit;
        num /= 10;
      }
    }

    return Math.abs(sumElement - sumDigit);
  }
}
// @lc code=end
