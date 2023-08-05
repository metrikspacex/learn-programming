/*
 * @lc app=leetcode id=1816 lang=java
 *
 * [1816] Truncate Sentence
 */

// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    String answer = s.truncateSentence("Hello how are you Contestant", 4);
    System.out.println(answer);
  }

  public String truncateSentence(String s, int k) {
    int counter = 0;
    String truncated = "";

    for (String split : s.split(" ")) {
      if (counter < k)
        truncated += split + " ";
      counter++;
    }

    return truncated.trim();
  }
}
// @lc code=end
