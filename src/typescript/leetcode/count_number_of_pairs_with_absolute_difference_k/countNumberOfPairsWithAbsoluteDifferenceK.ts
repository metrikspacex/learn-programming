/*
 * @lc app=leetcode id=2006 lang=typescript
 *
 * [2006] Count Number of Pairs With Absolute Difference K
 */
// @lc code=start
function countKDifference(nums: number[], k: number): number {
  let count: number = 0;
  const counts: Record<number, number> = {};

  for (const num of nums) {
    counts[num] = !counts[num] ? 1 : counts[num] + 1;
  }

  for (const num of nums) {
    if (counts[num - k]) count += counts[num - k];
    if (counts[num + k]) count += counts[num + k];
  }

  return count / 2;
}
// @lc code=end
console.log(countKDifference([1, 2, 2, 1], 1));
