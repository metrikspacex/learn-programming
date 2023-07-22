/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */
import java.util.ArrayList;
import java.util.List;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    List<Boolean> answer = s.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3);
    System.out.println(answer);
  }
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    ArrayList<Boolean> answer = new ArrayList<Boolean>();
    int max = 0;

    for (int candie : candies) {
      if (candie > max)
        max = candie;
    }

    for (int candie : candies) {
      if (candie + extraCandies >= max)
        answer.add(true);
      else
        answer.add(false);
    }

    return answer;
  }
}
// @lc code=end
