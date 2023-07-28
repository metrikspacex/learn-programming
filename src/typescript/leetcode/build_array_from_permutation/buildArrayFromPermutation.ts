/*
 * @lc app=leetcode id=1920 lang=typescript
 *
 * [1920] Build Array from Permutation
 */
// @lc code=start
function buildArray(nums: number[]): number[] {
  let built: number[] = [];

  for (let i = 0; i < nums.length; i++) built.push(nums[nums[i]]);

  return built;
}
// @lc code=end
console.log(buildArray([0, 2, 1, 5, 3, 4]));
