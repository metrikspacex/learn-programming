/*
 * @lc app=leetcode id=1365 lang=java
 *
 * [1365] How Many Numbers Are Smaller Than the Current Number
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.smallerNumbersThanCurrent(new int[] {8, 1, 2, 2, 3});
    System.out.println(Arrays.toString(answer));
  }

  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] answer = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (i != j) {
          if (nums[i] > nums[j])
            count++;
        }
      }
      answer[i] = count;
    }

    return answer;
  }
}
// @lc code=end
