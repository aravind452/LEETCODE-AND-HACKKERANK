import java.util.*;

public class MaxMin {

  public static void main(String[] args) {
    List<Integer> arr;
    arr = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);
    minMaxSum(arr);

  }

  static void minMaxSum(List<Integer> arr) {
    int max = arr.get(0);
    int min = arr.get(0);
    long sum = 0;
    for (int i = 0; i < arr.size(); i++) {
      sum += arr.get(i);
      if (arr.get(i) > max) {
        max = arr.get(i);
      }
      if (arr.get(i) < min) {
        min = arr.get(i);
      }

    }
    long minSum = sum - max;
    long maxSum = sum - min;

    System.out.println("Max Sum: " + minSum);
    System.out.println("Min Sum: " + maxSum);
  }

}
