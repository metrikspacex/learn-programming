/*
 * @lc app=leetcode id=1108 lang=java
 *
 * [1108] Defanging an IP Address
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    String answer = s.defangIPaddr("1.1.1.1");
    System.out.println(answer);
  }
  public String defangIPaddr(String address) {
    return address.replace(".", "[.]");
  }
}
// @lc code=end
