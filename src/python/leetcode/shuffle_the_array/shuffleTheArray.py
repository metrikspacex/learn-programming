#
# @lc app=leetcode id=1470 lang=python3
#
# [1470] Shuffle the Array
#
from typing import List


# @lc code=start
class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        answer: List[int] = []

        for i, j in zip(nums[:n], nums[n:]):
            answer += [i, j]

        return answer


# @lc code=end
s = Solution()
answer = s.shuffle([2, 5, 1, 3, 4, 7], 3)
print(answer)
