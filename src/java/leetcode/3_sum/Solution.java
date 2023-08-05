/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    List<List<Integer>> answer = s.threeSum(new int[] {-1, 0, 1, 2, -1, -4});
    System.out.println(answer);
  }
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> answer = new ArrayList<List<Integer>>();
    Arrays.sort(nums); // [-4, -1, -1, 0, 1, 2]
    return answer;
  }
}
// @lc code=end
