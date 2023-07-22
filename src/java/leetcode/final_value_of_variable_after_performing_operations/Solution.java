/*
 * @lc app=leetcode id=2011 lang=java
 *
 * [2011] Final Value of Variable After Performing Operations
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer =
        s.finalValueAfterOperations(new String[] {"--X", "X++", "X++"});
    System.out.println(answer);
  }
  public int finalValueAfterOperations(String[] operations) {
    int answer = 0;

    for (String operation : operations) {
      if (operation.charAt(1) == '+')
        answer++;
      else if (operation.charAt(1) == '-')
        answer--;
    }

    return answer;
  }
}
// @lc code=end
