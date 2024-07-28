public class largestAltitude {
  public static void main(String args[]) {
    int[] gain = { 4, 3, 4, 1, 3, 2, 5 };
    int sum = 0;
    int maxsum = 0;
    for (int i = 0; i < gain.length; i++) {
      sum = gain[i] + sum;
      maxsum = Math.max(maxsum, sum);
    }
    System.out.println(maxsum);
  }
}

