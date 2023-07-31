/*
 * @lc app=leetcode id=1656 lang=java
 *
 * [1656] Design an Ordered Stream
 */
import java.util.List;
// @lc code=start
class OrderedStream {
  public static void main(String[] args) {
    OrderedStream os = new OrderedStream(5);
    System.out.println(os.insert(3, "ccccc"));
    System.out.println(os.insert(1, "aaaaa"));
    System.out.println(os.insert(2, "bbbbb"));
    System.out.println(os.insert(5, "eeeee"));
    System.out.println(os.insert(4, "ddddd"));
  }
  public OrderedStream(int n) {}
  public List<String> insert(int idKey, String value) { return null; }
}
// @lc code=end
