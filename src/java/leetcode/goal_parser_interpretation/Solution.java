/*
 * @lc app=leetcode id=1678 lang=java
 *
 * [1678] Goal Parser Interpretation
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    String answer = s.interpret("G()(al)");
    System.out.println(answer);
  }
  public String interpret(String command) {
    String answer = "";

    for (int i = 0; i < command.length(); i++) {
      if (command.charAt(i) == 'G')
        answer += "G";
      else {
        if (command.charAt(i) == '(') {
          if (command.charAt(i + 1) == ')') {
            answer += "o";
            i += 1;
          } else {
            answer += "al";
            i += 2;
          }
        }
      }
    }

    return answer;
  }
}
// @lc code=end
