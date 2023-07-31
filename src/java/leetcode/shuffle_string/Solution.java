/*
 * @lc app=leetcode id=1528 lang=java
 *
 * [1528] Shuffle String
 */
import java.util.HashMap;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    String answer =
        s.restoreString("codeleet", new int[] {4, 5, 6, 7, 0, 2, 1, 3});
    System.out.println(answer);
  }

  public String restoreString(String s, int[] indices) {
    HashMap<Integer, Character> restoreMap = new HashMap<Integer, Character>();
    for (int i = 0; i < indices.length; i++) {
      Integer key = indices[i];
      Character value = s.charAt(i);
      restoreMap.put(key, value);
    }

    String restored = "";
    for (Integer key : restoreMap.keySet()) {
      restored += restoreMap.get(key);
    }

    return restored;
  }
}
// @lc code=end
