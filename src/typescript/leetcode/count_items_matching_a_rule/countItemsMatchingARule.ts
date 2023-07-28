/*
 * @lc app=leetcode id=1773 lang=typescript
 *
 * [1773] Count Items Matching a Rule
 */

// @lc code=start
function countMatches(
  items: string[][],
  ruleKey: string,
  ruleValue: string
): number {
  let count: number = 0;

  for (let item of items) {
    switch (ruleKey) {
      case "type": {
        if (item[0] === ruleValue) count++;
        break;
      }
      case "color": {
        if (item[1] === ruleValue) count++;
        break;
      }
      case "name": {
        if (item[2] === ruleValue) count++;
        break;
      }
    }
  }

  return count;
}
// @lc code=end
console.log(
  countMatches(
    [
      ["phone", "blue", "pixel"],
      ["computer", "silver", "lenovo"],
      ["phone", "gold", "iphone"],
    ],
    "color",
    "silver"
  )
);
