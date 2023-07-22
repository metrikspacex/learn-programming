import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {}

  public static int divisibleSumPairs(int n, int k, List<Integer> arr) {
    int answer = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        boolean result = (arr.get(i) + arr.get(j)) % k == 0;
        if (i < j && result)
          answer++;
      }
    }

    return answer;
  }

  public static List<Integer> breakingRecords(List<Integer> scores) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    int max = scores.get(0);
    int maxCount = 0;
    int min = scores.get(0);
    int minCount = 0;

    for (int i = 0; i < scores.size(); i++) {
      if (min > scores.get(i)) {
        min = scores.get(i);
        minCount++;
      } else if (max < scores.get(i)) {
        max = scores.get(i);
        maxCount++;
      }
    }

    answer.add(maxCount);
    answer.add(minCount);
    return answer;
  }

  public static void miniMaxSum(List<Integer> arr) {
    Long minimum = 0L;
    Long maximum = 0L;
    Collections.sort(arr);

    for (int i = 0; i < arr.size() - 1; i++) {
      minimum += arr.get(i);
      maximum += arr.get(arr.size() - i - 1);
    }

    System.out.println(minimum + " " + maximum);
  }

  public static void mockTest() {}

  public static void plusMinus(List<Integer> arr) {
    float positive = 0;
    float negative = 0;
    float zero = 0;
    float length = arr.size();

    for (int item : arr) {
      if (item > 0)
        positive++;
      else if (item < 0)
        negative++;
      else
        zero++;
    }

    System.out.printf("%.6f\n", positive / length);
    System.out.printf("%.6f\n", negative / length);
    System.out.printf("%.6f\n", zero / length);
  }

  public static List<Integer> matchingStrings(List<String> strings,
                                              List<String> queries) {
    List<Integer> answer = new ArrayList<Integer>();

    for (String query : queries) {
      int count = 0;
      for (String string : strings) {
        if (query.equals(string)) {
          count++;
        }
      }
      answer.add(count);
    }

    return answer;
  }

  public static String timeConversion(String s) {
    String answer = "";
    String hourOfDay = s.substring(0, 2);
    String minuteOfDay = s.substring(3, 5);
    String secondOfDay = s.substring(6, 8);
    String timeOfDay = s.substring(8, 10);

    if (timeOfDay.equals("AM")) {
      if (hourOfDay.equals("12"))
        hourOfDay = String.valueOf(Integer.valueOf(hourOfDay) - 12) + "0";
      answer += hourOfDay + ":" + minuteOfDay + ":" + secondOfDay;
    } else if (timeOfDay.equals("PM")) {
      if (!hourOfDay.equals("12"))
        hourOfDay = String.valueOf(Integer.valueOf(hourOfDay) + 12);
      answer += hourOfDay + ":" + minuteOfDay + ":" + secondOfDay;
    }

    return answer;
  }
}
