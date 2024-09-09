public class Tribonacci {

  public static void main(String[] args) {

    int n = 25;

    int zero = 0;
    int one = 1;
    int two = 1;
    int sum = 0;
    if (n == 1) {
      System.out.println(1);
    }

    if (n == 2) {
      System.out.println(zero + one);
    }

    for (int i = 3; i <= n; i++) {

      sum = zero + one + two;
      zero = one;
      one = two;
      two = sum;

    }

    System.out.println(sum);
  }

}
