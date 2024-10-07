public class Sqrt {

  public static void main(String[] args) {
    System.out.println(sqrt(9));
  }

  static int sqrt(int x) {

    int i = 1;
    long res = 1;
    while (res <= x) {
      i++;
      res = (long) i * i;
    }
    return i - 1;

  }

}
