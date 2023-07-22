/*
 * @lc app=leetcode id=2194 lang=java
 *
 * [2194] Cells in a Range on an Excel Sheet
 */
import java.util.ArrayList;
import java.util.List;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    List<String> answer = s.cellsInRange("K1:L2");
    System.out.println(answer);
  }
  public List<String> cellsInRange(String s) {
    ArrayList<String> answer = new ArrayList<String>();
    char c1 = s.charAt(0);
    char c2 = s.charAt(3);
    char r1 = s.charAt(1);
    char r2 = s.charAt(4);

    for (char c = c1; c <= c2; ++c) {
      for (char r = r1; r <= r2; ++r) {
        answer.add("" + c + r);
      }
    }

    return answer;
  }
}
// @lc code=end
