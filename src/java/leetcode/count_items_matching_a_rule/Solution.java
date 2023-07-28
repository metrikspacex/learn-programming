/*
 * @lc app=leetcode id=1773 lang=java
 *
 * [1773] Count Items Matching a Rule
 */
import java.util.ArrayList;
import java.util.List;
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    int answer = s.countMatches(new ArrayList<List<String>>() {
      {
        add(new ArrayList<String>() {
          {
            add("computer");
            add("silver");
            add("lenovo");
          }
        });
        add(new ArrayList<String>() {
          {
            add("phone");
            add("gold");
            add("iphone");
          }
        });
      }
    }, "color", "silver");
    System.out.println(answer);
  }
  public int countMatches(List<List<String>> items, String ruleKey,
                          String ruleValue) {
    int answer = 0;

    for (List<String> item : items) {
      String type = item.get(0);
      String color = item.get(1);
      String name = item.get(2);

      switch (ruleKey) {
      case "type": {
        if (ruleValue.equals(type))
          answer++;
        break;
      }
      case "color": {
        if (ruleValue.equals(color))
          answer++;
        break;
      }
      case "name": {
        if (ruleValue.equals(name))
          answer++;
        break;
      }
      }
    }

    return answer;
  }
}
// @lc code=end
