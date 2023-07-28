/*
 * @lc app=leetcode id=1832 lang=typescript
 *
 * [1832] Check if the Sentence Is Pangram
 */
// @lc code=start
function checkIfPangram(sentence: string): boolean {
  let frequencyMap: Map<string, number> = new Map<string, number>();

  for (let letter of sentence) {
    if (!frequencyMap.has(letter)) frequencyMap.set(letter, 1);
  }

  if (frequencyMap.size === 26) return true;
  return false;
}
// @lc code=end
console.log(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
