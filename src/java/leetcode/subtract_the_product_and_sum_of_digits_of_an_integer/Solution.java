/*
 * @lc app=leetcode id=1281 lang=java
 *
 * [1281] Subtract the Product and Sum of Digits of an Integer
 */

// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.subtractProductAndSum(234);
    System.out.println(answer);
  }
  public int subtractProductAndSum(int n) {
    int additionSum = 0;
    int productSum = 1;

    while (n != 0) {
      int digit = n % 10;
      n /= 10;

      additionSum += digit;
      productSum *= digit;
    }

    return productSum - additionSum;
  }
}
// @lc code=end
