/*
 * @lc app=leetcode id=1470 lang=java
 *
 * [1470] Shuffle the Array
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.shuffle(new int[] {2, 5, 1, 3, 4, 7}, 3);
    System.out.println(Arrays.toString(answer));
  }
  public int[] shuffle(int[] nums, int n) {
    int[] answer = new int[n * 2];

    for (int i = 0; i < n; i++) {
      answer[2 * i] = nums[i];
      answer[2 * i + 1] = nums[i + n];
    }

    return answer;
  }
}
// @lc code=end
