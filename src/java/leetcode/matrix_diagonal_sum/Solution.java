/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.diagonalSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    System.out.println(answer);
  }

  public int diagonalSum(int[][] mat) {
    int sum = 0;

    for (int i = 0; i < mat.length; i++) {
      sum += mat[i][i];
    }

    for (int i = 0; i < mat.length; i++) {
      if (i != mat.length - (i + 1))
        sum += mat[i][mat.length - (i + 1)];
    }

    return sum;
  }
}
// @lc code=end
