/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    boolean answer = s.isAnagram("anagram", "nagaram");
    System.out.println(answer);
    answer = s.isAnagram("rat", "car");
    System.out.println(answer);
  }
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;

    int freq[] = new int[26];
    for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i) - 'a']++;
      freq[t.charAt(i) - 'a']--;
    }

    for (int i = 0; i < freq.length; i++) {
      if (freq[i] != 0)
        return false;
    }

    return true;
  }
}
// @lc code=end
