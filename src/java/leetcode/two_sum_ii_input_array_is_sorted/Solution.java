/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.twoSum(new int[] {2, 7, 11, 15}, 9);
    System.out.println(Arrays.toString(answer));
    answer = s.twoSum(new int[] {2, 3, 4}, 6);
    System.out.println(Arrays.toString(answer));
    answer = s.twoSum(new int[] {3, 24, 50, 79, 88, 150, 345}, 200);
    System.out.println(Arrays.toString(answer));
  }

  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (right != left) {
      if (numbers[left] + numbers[right] == target)
        return new int[] {left + 1, right + 1};
      else if (numbers[left] + numbers[right] > target)
        right -= 1;
      else
        left += 1;
    }

    return new int[] {};
  }
}
// @lc code=end
