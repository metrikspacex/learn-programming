/*
 * @lc app=leetcode id=1929 lang=typescript
 *
 * [1929] Concatenation of Array
 */
// @lc code=start
function getConcatenation(nums: number[]): number[] {
  return nums.concat(nums);
}
// @lc code=end
console.log(getConcatenation([1, 2, 1]));
