import java.util.*;
import java.text.DecimalFormat;

public class PlusMinus {

  public static void main(String[] args) {
    List<Integer> list;
    list = Arrays.asList(-4, 3, -9, 0, 4, 1);
    plusMinus(list);

  }

  static void plusMinus(List<Integer> list) {
    DecimalFormat df = new DecimalFormat("0.000000");
    int plus = 0, minus = 0, zero = 0;
    for (Integer i : list) {
      if (i > 0) {
        plus++;
      } else if (i < 0) {
        minus++;
      } else {
        zero++;
      }
    }
    int length = list.size();
    double plusDiv = (double) plus / length;
    String plusResult = df.format((double) plusDiv);
    double minusDiv = (double) minus / length;
    String minusResult = df.format((double) minusDiv);
    double zeroDiv = (double) zero / length;
    String zeroResult = df.format((double) zeroDiv);
    System.out.println(plusResult);
    System.out.println(minusResult);
    System.out.println(zeroResult);

  }

}
