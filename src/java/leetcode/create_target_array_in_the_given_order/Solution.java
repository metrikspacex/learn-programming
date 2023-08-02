/*
 * @lc app=leetcode id=1389 lang=java
 *
 * [1389] Create Target Array in the Given Order
 */
import java.util.ArrayList;
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.createTargetArray(new int[] {0, 1, 2, 3, 4},
                                       new int[] {0, 1, 2, 2, 1});
    System.out.println(Arrays.toString(answer));
  }

  public int[] createTargetArray(int[] nums, int[] index) {
    ArrayList<Integer> target = new ArrayList<Integer>();

    for (int i = 0; i < index.length; i++) {
      int at = index[i];
      int value = nums[i];

      if (target.indexOf(at) == -1) {
        target.add(at, value);
      } else {
        for (int shift = at; i < target.size(); shift++) {
          int temp = target.get(shift);
          target.add(shift, temp);
        }
        target.add(at, value);
      }
    }

    return target.stream().mapToInt(i -> i).toArray();
  }
}
// @lc code=end
