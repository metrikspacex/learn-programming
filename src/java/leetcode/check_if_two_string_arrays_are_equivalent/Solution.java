/*
 * @lc app=leetcode id=1662 lang=java
 *
 * [1662] Check If Two String Arrays are Equivalent
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    boolean answer = s.arrayStringsAreEqual(new String[] {"ab", "c"},
                                            new String[] {"a", "bc"});
    System.out.println(answer);
  }
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String wordOne = "";
    String wordTwo = "";

    for (String word : word1) {
      wordOne += word;
    }

    for (String word : word2) {
      wordTwo += word;
    }

    return wordOne.equals(wordTwo);
  }
}
// @lc code=end
