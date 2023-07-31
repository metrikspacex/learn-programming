/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.missingNumber(new int[] {3, 0, 1});
    System.out.println(answer);
  }
  public int missingNumber(int[] nums) {
    int missing = 0;
    int[] map = new int[nums.length + 1];

    for (int num : nums) {
      map[num]++;
    }

    for (int i = 0; i < map.length; i++) {
      if (map[i] == 0)
        missing = i;
    }

    return missing;
  }
}
// @lc code=end
