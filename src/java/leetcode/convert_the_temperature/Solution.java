/*
 * @lc app=leetcode id=2469 lang=java
 *
 * [2469] Convert the Temperature
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    double[] answer = s.convertTemperature(36.5);
    System.out.println(Arrays.toString(answer));
  }
  public double[] convertTemperature(double celsius) {
    return new double[] {celsius + 273.15, celsius * 1.8 + 32.00};
  }
}
// @lc code=end
