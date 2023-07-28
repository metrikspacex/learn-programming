/*
 * @lc app=leetcode id=2160 lang=java
 *
 * [2160] Minimum Sum of Four Digit Number After Splitting Digits
 */
import java.util.ArrayList;
import java.util.Collections;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.minimumSum(2932);
    System.out.println(answer);
  }
  public int minimumSum(int num) {
    ArrayList<Integer> digits = new ArrayList<Integer>();

    while (num > 0) {
      digits.add(num % 10);
      num /= 10;
    }
    Collections.sort(digits);

    return (digits.get(0) * 10 + digits.get(2)) +
        (digits.get(1) * 10 + digits.get(3));
  }
}
// @lc code=end
