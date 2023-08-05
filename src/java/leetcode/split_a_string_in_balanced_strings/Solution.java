/*
 * @lc app=leetcode id=1221 lang=java
 *
 * [1221] Split a String in Balanced Strings
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.balancedStringSplit("RLRRLLRLRL");
    System.out.println(answer);
  }

  public int balancedStringSplit(String s) {
    int balanced = 0;
    int count = 0;
    for (char letter : s.toCharArray()) {
      if (letter == 'R')
        count += 1;
      else
        count -= 1;

      if (count == 0)
        balanced++;
    }

    return balanced;
  }
}
// @lc code=end
