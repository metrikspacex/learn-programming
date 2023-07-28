public class ListNode {
  ListNode next;
  int val;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) {
    this.next = next;
    this.val = val;
  }
}
