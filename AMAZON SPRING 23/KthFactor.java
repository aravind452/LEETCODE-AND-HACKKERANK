

public class KthFactor {

  public static void main(String[] args) {
    System.out.println(kthFactor(4, 4));
  }

  static int kthFactor(int n, int k) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
        if (count == k) {
          return i;
        }
      }
    }
    return -1;
  }
}
