/*
 * @lc app=leetcode id=2114 lang=java
 *
 * [2114] Maximum Number of Words Found in Sentences
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.mostWordsFound(
        new String[] {"alice and bob love leetcode", "i think so too",
                      "this is great thanks very much"});
    System.out.println(answer);
  }

  public int mostWordsFound(String[] sentences) {
    int max = 0;

    for (String sentence : sentences) {
      int length = sentence.split(" ").length;
      if (length > max)
        max = length;
    }

    return max;
  }
}
// @lc code=end
