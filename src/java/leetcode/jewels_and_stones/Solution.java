/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.numJewelsInStones("aA", "aAAbbbb");
    System.out.println(answer);
  }
  public int numJewelsInStones(String jewels, String stones) {
    int answer = 0;

    for (Character jewel : jewels.toCharArray()) {
      for (Character stone : stones.toCharArray()) {
        if (jewel == stone)
          answer++;
      }
    }

    return answer;
  }
}
// @lc code=end
