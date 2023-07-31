/*
 * @lc app=leetcode id=1832 lang=java
 *
 * [1832] Check if the Sentence Is Pangram
 */
import java.util.HashMap;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    boolean answer = s.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
    System.out.println(answer);
  }
  public boolean checkIfPangram(String sentence) {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    for (char c : sentence.toCharArray()) {
      if (!map.containsKey(c))
        map.put(c, 1);
    }

    return map.keySet().size() == 26;
  }
}
// @lc code=end
