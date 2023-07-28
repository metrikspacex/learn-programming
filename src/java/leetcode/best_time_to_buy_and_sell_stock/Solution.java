/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.maxProfit(new int[] {7, 1, 5, 3, 6, 4});
    System.out.println(answer);
  }
  public int maxProfit(int[] prices) {
    int left = 0;
    int maxProfit = 0;
    int right = 1;

    while (right < prices.length) {
      if (prices[left] < prices[right]) {
        int profit = prices[right] - prices[left];
        if (profit > maxProfit)
          maxProfit = profit;
      } else
        left = right;
      right += 1;
    }

    return maxProfit;
  }
}
// @lc code=end
