/*
 * @lc app=leetcode id=804 lang=java
 *
 * [804] Unique Morse Code Words
 */

// @lc code=start

import java.util.HashMap;

class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer =
        s.uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"});
    System.out.println(answer);
  }
  public int uniqueMorseRepresentations(String[] words) {
    HashMap<Character, String> representation =
        new HashMap<Character, String>() {
          {
            put('a', ".-");
            put('b', "-...");
            put('c', "-.-.");
            put('d', "-..");
            put('e', ".");
            put('f', "..-.");
            put('g', "--.");
            put('h', "....");
            put('i', "..");
            put('j', ".---");
            put('k', "-.-");
            put('l', ".-..");
            put('m', "--");
            put('n', "-.");
            put('o', "---");
            put('p', ".--.");
            put('q', "--.-");
            put('r', ".-.");
            put('s', "...");
            put('t', "-");
            put('u', "..-");
            put('v', "...-");
            put('w', ".--");
            put('x', "-..-");
            put('y', "-.--");
            put('z', "--..");
          }
        };

    for (String word : words) {
      String decoded = "";
      for (Character c : word.toCharArray()) {
        decoded += representation.get(c);
      }
      System.out.println(decoded);
    }

    return 0;
  }
}
// @lc code=end
