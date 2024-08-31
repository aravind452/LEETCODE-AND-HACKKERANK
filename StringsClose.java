import java.util.*;

public class StringsClose {

  public static void main(String[] args) {

    String str1 = "cabbba";
    String str2 = "abbccc";

    boolean res = closeStrings(str1, str2);
    System.out.println(res);

  }

  public static boolean closeStrings(String a, String b) {

    if (a.length() != b.length()) {
      return false;
    }

    int[] freq1 = new int[26];
    int[] freq2 = new int[26];

    for (int i = 0; i < a.length(); i++) {
      freq1[a.charAt(i) - 'a']++;
    }
    for (int i = 0; i < b.length(); i++) {
      freq2[b.charAt(i) - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
      if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0))
        return false;
    }

    Arrays.sort(freq1);
    Arrays.sort(freq2);
    for (int i = 0; i < 26; i++) {
      if (freq1[i] != freq2[i]) {
        return false;
      }
    }
    return true;
  }

}
