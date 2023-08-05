/*
 * @lc app=leetcode id=2656 lang=java
 *
 * [2656] Maximum Sum With Exactly K Elements
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.maximizeSum(new int[] {1, 2, 3, 4, 5}, 3);
    System.out.println(answer);
    answer = s.maximizeSum(new int[] {5, 5, 5}, 2);
    System.out.println(answer);
  }

  public int maximizeSum(int[] nums, int k) {
    Arrays.sort(nums);
    int sum = nums[nums.length - 1];
    for (int i = 1; i < k; i++) {
      sum += nums[nums.length - 1] + i;
    }

    return sum;
  }
}
// @lc code=end
