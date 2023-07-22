/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.getConcatenation(new int[] {1, 2, 1});
    System.out.println(Arrays.toString(answer));
  }
  public int[] getConcatenation(int[] nums) {
    int[] answer = new int[nums.length * 2];

    for (int i = 0; i < nums.length; i++) {
      answer[i] = nums[i];
      answer[i + nums.length] = nums[i];
    }

    return answer;
  }
}
// @lc code=end
