#
# @lc app=leetcode id=1108 lang=python3
#
# [1108] Defanging an IP Address
#


# @lc code=start
class Solution:
    def defangIPaddr(self, address: str) -> str:
        return address.replace(".", "[.]")


# @lc code=end
s = Solution()
answer = s.defangIPaddr("1.1.1.1")
print(answer)
