/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.runningSum(new int[] {1, 2, 3, 4});
    System.out.println(Arrays.toString(answer));
  }
  public int[] runningSum(int[] nums) {
    int[] answer = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      if (i == 0)
        answer[i] = nums[i];
      else
        answer[i] = nums[i] + answer[i - 1];
    }

    return answer;
  }
}
// @lc code=end
