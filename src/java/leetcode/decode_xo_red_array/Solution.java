/*
 * @lc app=leetcode id=1720 lang=java
 *
 * [1720] Decode XORed Array
 */
import java.util.Arrays;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.decode(new int[] {1, 2, 3}, 1);
    System.out.println(Arrays.toString(answer));
  }
  public int[] decode(int[] encoded, int first) {
    int[] answer = new int[encoded.length + 1];
    answer[0] = first;

    for (int i = 0; i < encoded.length; i++) {
      answer[i + 1] = answer[i] ^ encoded[i];
    }

    return answer;
  }
}
// @lc code=end
