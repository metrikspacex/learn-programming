/*
 * @lc app=leetcode id=2194 lang=typescript
 *
 * [2194] Cells in a Range on an Excel Sheet
 */
// @lc code=start
function cellsInRange(s: string): string[] {
  let listOfCells: string[] = [];
  let columnStart: number = s.charCodeAt(0);
  let columnEnd: number = s.charCodeAt(3);
  let rowStart: number = Number(s[1]);
  let rowEnd: number = Number(s[4]);

  for (let column = columnStart; column <= columnEnd; column++) {
    for (let row = rowStart; row <= rowEnd; row++) {
      listOfCells.push(String.fromCharCode(column) + row.toString());
    }
  }

  return listOfCells;
}
// @lc code=end
console.log(cellsInRange("K1:L2"));
