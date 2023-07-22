/*
 * @lc app=leetcode id=1512 lang=java
 *
 * [1512] Number of Good Pairs
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3});
    System.out.println(answer);
  }
  public int numIdenticalPairs(int[] nums) {
    int answer = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i < j && nums[i] == nums[j])
          answer++;
      }
    }

    return answer;
  }
}
// @lc code=end
