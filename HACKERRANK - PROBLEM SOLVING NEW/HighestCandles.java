import java.util.*;

public class HighestCandles {

  public static void main(String[] args) {
    List<Integer> candles;
    candles = Arrays.asList(3, 2, 1, 3);
    System.out.println(cakeCandles(candles));
  }

  static int cakeCandles(List<Integer> arr) {
    int max = Collections.max(arr);
    int count = 0;
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) == max) {
        count++;
      }
    }
    return count;
  }

}
