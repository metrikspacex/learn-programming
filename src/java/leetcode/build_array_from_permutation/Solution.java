/*
 * @lc app=leetcode id=1920 lang=java
 *
 * [1920] Build Array from Permutation
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.buildArray(new int[] {0, 2, 1, 5, 3, 4});
    System.out.println(Arrays.toString(answer));
  }
  public int[] buildArray(int[] nums) {
    int[] answer = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      answer[i] = nums[nums[i]];
    }

    return answer;
  }
}
// @lc code=end
