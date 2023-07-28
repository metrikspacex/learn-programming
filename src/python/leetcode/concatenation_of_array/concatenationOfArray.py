#
# @lc app=leetcode id=1929 lang=python3
#
# [1929] Concatenation of Array
#
from typing import List


# @lc code=start
class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        return nums * 2


# @lc code=end
s = Solution()
answer = s.getConcatenation([1, 2, 1])
print(answer)
