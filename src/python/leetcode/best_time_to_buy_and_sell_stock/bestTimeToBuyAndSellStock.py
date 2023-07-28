#
# @lc app=leetcode id=121 lang=python3
#
# [121] Best Time to Buy and Sell Stock
#
from typing import List

# @lc code=start


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left: int = 0
        max_profit: int = 0
        right: int = 0

        while right < len(prices):
            if prices[left] < prices[right]:
                profit: int = prices[right] - prices[left]
                max_profit = max(profit, max_profit)
            else:
                left = right
            right += 1

        return max_profit


# @lc code=end
s: Solution = Solution()
answer: int = s.maxProfit([7, 1, 5, 3, 6, 4])
print(answer)
