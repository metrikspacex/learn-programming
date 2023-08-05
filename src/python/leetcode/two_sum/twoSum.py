#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#
from typing import List, Dict

# @lc code=start


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        difference: Dict = {}

        for num in nums:
            if difference.get(target - num):
                pass

        return []


# @lc code=end
s: Solution = Solution()
answer: List[int] = s.twoSum([2, 7, 11, 15], 9)
print(answer)
