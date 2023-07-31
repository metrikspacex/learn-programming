/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
// @lc code=start
class Solution {
  /*
   * Algorithm Inorder(tree)
   * Traverse the left subtree, i.e., call Inorder(left->subtree)
   * Visit the root.
   * Traverse the right subtree, i.e., call Inorder(right->subtree)
   */
  public static void main(String[] args) {
    Solution s = new Solution();
    List<Integer> answer = s.inorderTraversal(new TreeNode(
        1, null, new TreeNode(2, null, new TreeNode(3, null, null))));
    System.out.println(answer);
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();

    TreeNode current = root;
    while (current != null || !stack.empty()) {
      while (current != null) {
        stack.add(current);
        current = current.left;
      }
      current = stack.pop();
      list.add(current.val);
      current = current.right;
    }

    return list;
  }
}
// @lc code=end
