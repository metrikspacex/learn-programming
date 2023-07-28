#
# @lc app=leetcode id=1920 lang=python3
#
# [1920] Build Array from Permutation
#
from typing import List


# @lc code=start
class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        answer: List[int] = []

        for i in range(0, len(nums)):
            answer.append(nums[nums[i]])

        return answer


# @lc code=end
s: Solution = Solution()
answer: List[int] = s.buildArray([0, 2, 1, 5, 3, 4])
print(answer)
