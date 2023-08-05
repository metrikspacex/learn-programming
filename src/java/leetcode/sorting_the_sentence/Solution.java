/*
 * @lc app=leetcode id=1859 lang=java
 *
 * [1859] Sorting the Sentence
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    String answer = s.sortSentence("is2 sentence4 This1 a3");
    System.out.println(answer);
  }

  public String sortSentence(String s) {
    String[] split = s.split(" ");
    String[] sorted = new String[split.length];
    String sentence = "";

    for (String word : split) {
      int place = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
      sorted[place] = word.substring(0, word.length() - 1);
    }

    for (String word : sorted) {
      sentence += word + " ";
    }

    return sentence.trim();
  }
}
// @lc code=end
