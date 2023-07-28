/*
 * @lc app=leetcode id=2315 lang=java
 *
 * [2315] Count Asterisks
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.countAsterisks("l|*e*et|c**o|*de|");
    System.out.println(answer);
    answer = s.countAsterisks("yo|uar|e**|b|e***au|tifu|l");
    System.out.println(answer);
  }
  public int countAsterisks(String s) {
    int answer = 0;
    int bars = 0;

    for (int i = 0; i < s.length(); ++i) {
      if (s.charAt(i) == '*' && bars % 2 == 0)
        answer++;
      if (s.charAt(i) == '|')
        bars++;
    }

    return answer;
  }
}
// @lc code=end
