public class HashDividedString {
  public static void main(String[] args) {
    String str = "abcd";
    int k = 2;
    System.out.println(hashDividedString(str, k));

  }

  static String hashDividedString(String s, int k) {

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < s.length(); i += k) {
      String tempSub = s.substring(i, i + k);
      int sum = 0;
      for (char c : tempSub.toCharArray()) {
        sum = sum + c - 'a';
      }
      int rem = sum % 26;
      char ch = (char) (rem + 'a');
      result.append(ch);

    }

    return result.toString();
  }

}
