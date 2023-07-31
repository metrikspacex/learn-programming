/*
 * @lc app=leetcode id=2652 lang=java
 *
 * [2652] Sum Multiples
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.sumOfMultiples(7);
    System.out.println(answer);
  }

  public int sumOfMultiples(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
        sum += i;
    }

    return sum;
  }
}
// @lc code=end
