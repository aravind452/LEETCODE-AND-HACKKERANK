package OCTOBER;

import java.util.Arrays;

public class MinStringLength {

  public static void main(String[] args) {
    String s = "ABFCACDB";
    System.out.println(minLength(s));
  }

  static int minLength(String s) {

    char[] ch = new char[s.length()];
    int i = -1;

    for (char c : ch) {

      if (i >= 0 && ((ch[i] == 'A' && c == 'B') || (ch[i] == 'C' && c == 'D'))) {
        i--;
      } else {
        ch[++i] = c;
      }

    }
    System.out.println(Arrays.toString(ch));
    return i + 1;

  }

}
