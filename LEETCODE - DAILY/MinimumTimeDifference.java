import java.util.*;

public class MinimumTimeDifference {

  public static void main(String[] args) {
    String[] timePoints = { "23:59", "00:00" };
    System.out.println(findMinDifference(timePoints));

  }

  static int findMinDifference(String[] str) {
    int[] res = new int[str.length];
    for (int i = 0; i < str.length; i++) {

      String splitArray[] = str[i].split(":");

      int hour = Integer.parseInt(splitArray[0]) * 60;
      int minute = Integer.parseInt(splitArray[1]);
      int time = hour + minute;

      res[i] = time;

    }
    Arrays.sort(res);
    int min = 1440;
    for (int i = 1; i < res.length; i++) {

      min = Math.min(min, res[i] - res[i - 1]);

    }
    int circularDiff = 1440 + (res[0] - res[res.length - 1]);
    min = Math.min(min, circularDiff);
    System.out.println(min);
    return min;
  }

}
