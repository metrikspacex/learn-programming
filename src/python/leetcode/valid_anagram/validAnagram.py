#
# @lc app=leetcode id=242 lang=python3
#
# [242] Valid Anagram
#
from typing import Dict

# @lc code=start


class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        countS: Dict[str, int] = {}
        countT: Dict[str, int] = {}

        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i], 0)
            countT[t[i]] = 1 + countT.get(t[i], 0)
        for c in countS:
            if countS[c] != countT.get(c, 0):
                return False

        return True


# @lc code=end
