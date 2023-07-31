/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashMap;

class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    boolean answer = s.containsDuplicate(new int[] {1, 2, 3, 1});
    System.out.println(answer);
  }

  public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

    for (int num : nums) {
      if (!frequencyMap.containsKey(num))
        frequencyMap.put(num, 1);
      else
        frequencyMap.put(num, frequencyMap.get(num) + 1);
    }

    for (int key : frequencyMap.keySet()) {
      if (frequencyMap.get(key) >= 2)
        return true;
    }

    return false;
  }
}
// @lc code=end
