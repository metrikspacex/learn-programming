import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Main.sockMerchant(7, new ArrayList<Integer>() {
      {
        add(1);
        add(2);
        add(1);
        add(2);
        add(1);
        add(3);
        add(2);
      }
    });
  }

  public static int birthday(List<Integer> s, int d, int m) {
    int answer = 0;

    for (int i = 0; i <= s.size() - m; i++) {
      List<Integer> window = s.subList(i, i + m);
      int sum = 0;

      for (int j = 0; j < window.size(); j++) {
        sum += window.get(j);
      }

      if (sum == d)
        answer++;
    }

    return answer;
  }

  public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
    return sticks;
  }

  public static int migratoryBirds(List<Integer> arr) {
    int answer = 0;

    return answer;
  }

  public static int sockMerchant(int n, List<Integer> ar) {
    int pairs = 0;
    HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

    for (int i = 0; i < ar.size(); i++) {
      if (!freq.containsKey(ar.get(i)))
        freq.put(ar.get(i), 1);
      else
        freq.put(ar.get(i), freq.get(ar.get(i)) + 1);
    }

    for (int key : freq.keySet()) {
      pairs += Math.floorDiv(freq.get(key), 2);
    }

    return pairs;
  }

  public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    Collections.sort(A, Collections.reverseOrder());
    Collections.sort(B);

    for (int i = 0; i < A.size(); i++) {
      if (A.get(i) + B.get(i) < k)
        return "NO";
    }

    return "YES";
  }
}
