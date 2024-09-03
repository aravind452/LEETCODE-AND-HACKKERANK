public class SumOfDigitsOfStringAfterConvert {

  public static void main(String[] args) {

    System.out.println(sumOfDigitsOfNumberAfterConvert("aaaa", 2));

  }

  static int sumOfDigitsOfNumberAfterConvert(String s, int k) {

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append((s.charAt(i) - 'a') + 1);
      System.out.println((s.charAt(i) - 'a') + 1);
    }
    String str = sb.toString();

    int res = 0;
    while (k > 0) {
      res = 0;
      for (int i = 0; i < str.length(); i++) {
        res = res + (str.charAt(i) - '0');
      }
      str = Integer.toString(res);
      k--;
    }
    return res;
  }

}