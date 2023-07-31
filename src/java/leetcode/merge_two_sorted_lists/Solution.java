/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */
// @lc code=start
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    ListNode answer =
        s.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
                        new ListNode(1, new ListNode(3, new ListNode(4))));
    // [1,1,2,3,4,4]
    ListNode ptr = answer;
    System.out.print("[");
    while (ptr.next != null) {
      System.out.print(ptr.val + ", ");
      ptr = ptr.next;
    }
    System.out.print(ptr.val + "]");
  }
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null)
      return list2;
    if (list2 == null)
      return list1;

    if (list1.val < list2.val) {
      list1.next = mergeTwoLists(list1.next, list2);
      return list1;
    } else {
      list2.next = mergeTwoLists(list1, list2.next);
      return list2;
    }
  }
}
// @lc code=end
