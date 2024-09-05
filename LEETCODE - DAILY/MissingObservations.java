import java.util.Arrays;

public class MissingObservations {

  public static void main(String[] args) {
    int[] rolls = { 3, 2, 4, 3 };
    int n = 2, mean = 4;
    int[] res = missingRolls(rolls, mean, n);
    System.out.println(Arrays.toString(res));

  }

  static int[] missingRolls(int[] rolls, int mean, int n) {
    int knownSum = Arrays.stream(rolls).sum();
    int total = (rolls.length + n) * mean;
    int missingSum = total - knownSum;

    if (missingSum < n || missingSum > n * 6) {
      return new int[0];
    }

    int[] res = new int[n];
    int quot = missingSum / n;
    int rem = missingSum % n;

    Arrays.fill(res, quot);
    for (int i = 0; i < rem; i++) {
      res[i]++;
    }
    return res;
  }
}
