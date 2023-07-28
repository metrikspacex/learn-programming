/*
 * @lc app=leetcode id=1688 lang=java
 *
 * [1688] Count of Matches in Tournament
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.numberOfMatches(7);
    System.out.println(answer);
  }

  public int numberOfMatches(int n) {
    int answer = 0;

    while (n != 1) {
      if (n % 2 == 0) {
        answer += n / 2;
        n /= 2;
      } else {
        answer += (n - 1) / 2 + 1;
        n = (n - 1) / 2;
      }
    }

    return answer;
  }
}
// @lc code=end
