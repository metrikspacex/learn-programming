#
# @lc app=leetcode id=2011 lang=python3
#
# [2011] Final Value of Variable After Performing Operations
#
from typing import List


# @lc code=start
class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        answer = 0

        for operator in operations:
            if operator[1] == "+":
                answer += 1
            elif operator[1] == "-":
                answer -= 1

        return answer


# @lc code=end
s = Solution()
answer = s.finalValueAfterOperations(["--X", "X++", "X++"])
print(answer)
