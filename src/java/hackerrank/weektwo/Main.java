import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Main.marsExploration("SOSSPSSQSSOR");
  }

  public static List<Integer> countingSort(List<Integer> arr) {
    ArrayList<Integer> freq =
        new ArrayList<Integer>(Collections.nCopies(100, 0));

    for (int item : arr) {
      freq.set(item, freq.get(item) + 1);
    }

    return freq;
  }

  public static int countingValleys(int steps, String path) {
    int count = 0;
    int step = 0;

    for (char c : path.toCharArray()) {
      if (c == 'U')
        step += 1;
      else
        step -= 1;

      if (step == 0 && c == 'U')
        count += 1;
    }

    return count;
  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    int firstDiagonal = 0;
    int secondDiagonal = 0;

    for (int i = 0; i < arr.size(); i++) {
      firstDiagonal += arr.get(i).get(i);
    }

    for (int i = 0; i < arr.size(); i++) {
      secondDiagonal += arr.get(i).get(arr.size() - (i + 1));
    }

    System.out.println(Math.abs(firstDiagonal - secondDiagonal));
    return Math.abs(firstDiagonal - secondDiagonal);
  }

  public static long flippingBits(long n) { return ~n; }

  public static List<Integer> gradingStudents(List<Integer> grades) {
    for (int i = 0; i < grades.size(); i++) {
      int nextMultiple = (Math.floorDiv(grades.get(i), 5) * 5 + 5);
      int diff = nextMultiple - grades.get(i);
      if (diff < 3 && grades.get(i) >= 38) {
        grades.set(i, nextMultiple);
      }
    }
    return grades;
  }

  public static int lonelyinteger(List<Integer> a) {
    int answer = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (Integer item : a) {
      if (!map.containsKey(item))
        map.put(item, 0);
      else
        map.put(item, map.get(item) + 1);
    }

    for (int key : map.keySet()) {
      int val = map.get(key);
      if (val == 0) {
        answer = key;
      }
    }

    return answer;
  }

  public static int marsExploration(String s) {
    int count = 0;
    String _s = s.toLowerCase();

    for (int i = 0; i < _s.length(); i += 3) {
      char first = _s.charAt(i);
      char second = _s.charAt(i + 1);
      char third = _s.charAt(i + 2);

      if (first != 's')
        count++;
      if (second != 'o')
        count++;
      if (third != 's')
        count++;
    }

    return count;
  }

  public static String pangrams(String s) {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    String _s = s.toLowerCase().replaceAll(" ", "");

    for (char c : _s.toCharArray()) {
      if (!map.containsKey(c))
        map.put(c, 1);
    }

    if (map.size() == 26)
      return "pangram";
    else
      return "not pangram";
  }
}
