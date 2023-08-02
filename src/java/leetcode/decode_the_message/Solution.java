/*
 * @lc app=leetcode id=2325 lang=java
 *
 * [2325] Decode the Message
 */
import java.util.HashMap;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    String answer = s.decodeMessage(
        "the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
    System.out.println(answer);
  }
  public String decodeMessage(String key, String message) {
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    String stripKey = key.replaceAll(" ", "");

    int atChar = 97;  // a
    int toChar = 122; // z
    int iter = 0;
    while (atChar <= toChar) {
      Character current = (char)atChar;
      if (!map.containsKey(stripKey.charAt(iter))) {
        map.put(stripKey.charAt(iter), current);
        atChar++;
        iter++;
      } else
        iter++;
    }

    String decoded = "";
    for (Character c : message.toCharArray()) {
      if (map.containsKey(c))
        decoded += map.get(c);
      else if (c == ' ')
        decoded += " ";
    }

    return decoded;
  }
}
// @lc code=end
