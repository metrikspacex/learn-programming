/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */
import java.util.Arrays;
import java.util.HashMap;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.twoSum(new int[] {2, 7, 11, 15}, 9);
    System.out.println(Arrays.toString(answer));
  }

  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> differenceMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (differenceMap.containsKey(nums[i]))
        return new int[] {differenceMap.get(nums[i]), i};
      else
        differenceMap.put(diff, i);
    }

    return new int[] {};
  }
}
// @lc code=end
