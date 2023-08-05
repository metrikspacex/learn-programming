/*
 * @lc app=leetcode id=2553 lang=java
 *
 * [2553] Separate the Digits in an Array
 */
import java.util.ArrayList;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.separateDigits(new int[] {13, 25, 83, 77});
    System.out.println();
  }
  public int[] separateDigits(int[] nums) {
    ArrayList<Integer> digits = new ArrayList<Integer>();
    for (int num : nums) {
      while (num != 0) {
        int digit = num % 10;
        digits.add(digit);
        num /= 10;
      }
    }
    System.out.println(digits);

    int[] seperated = new int[digits.size()];
    for (int i = 0; i < digits.size(); i++) {
      seperated[i] = digits.get(i);
    }

    return seperated;
  }
}
// @lc code=end
