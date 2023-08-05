/*
 * @lc app=leetcode id=2373 lang=java
 *
 * [2373] Largest Local Values in a Matrix
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[][] answer = s.largestLocal(
        new int[][] {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}});
    System.out.println(Arrays.toString(answer));
  }
  public int[][] largestLocal(int[][] grid) { return grid; }
}
// @lc code=end
