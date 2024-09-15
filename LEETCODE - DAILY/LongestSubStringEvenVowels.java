
import java.util.*;

public class LongestSubStringEvenVowels {

  public static void main(String[] args) {
    String str = "leetcodeisgreat";
    System.out.println(longestSubStringEvenVowels(str));

  }

  static int index(char ch) {
    switch (ch) {
      case 'a':
        return 0;
      case 'e':
        return 1;
      case 'i':
        return 2;
      case 'u':
        return 3;
      case 'o':
        return 4;
      default:
        return -1;

    }
  }

  static int longestSubStringEvenVowels(String s) {

    HashMap<String, Integer> map = new HashMap<>();
    map.put("00000", -1);

    int max = 0;
    int[] vowels = new int[5];

    for (int i = 0; i < s.length(); i++) {
      int vowelIndex = index(s.charAt(i));

      if (vowelIndex != -1) {
        vowels[vowelIndex] ^= 1;
      }
      StringBuilder str = new StringBuilder();
      for (int count : vowels) {
        str.append(count);
      }

      String key = str.toString();

      if (map.containsKey(key)) {
        max = Math.max(max, i - map.get(key));
      } else {
        map.put(key, i);
      }

    }

    return max;

  }
}

// Brute - force

// static boolean evenOrNot(int[] vowels) {
// for (int i : vowels) {
// if (i % 2 != 0) {
// return false;
// }
// }
// return true;
// }

// static int findTheLongestSubString(String n) {

// int max = 0;
// for (int i = 0; i < n.length(); i++) {
// int[] vowels = new int[5];
// for (int j = i; j < n.length(); j++) {
// char ch = n.charAt(j);
// if (ch == 'a')
// vowels[0]++;
// else if (ch == 'e')
// vowels[1]++;
// else if (ch == 'i')
// vowels[2]++;
// else if (ch == 'o')
// vowels[3]++;
// else if (ch == 'u')
// vowels[4]++;

// if (evenOrNot(vowels)) {
// max = Math.max(max, j - i + 1);

// }

// }

// }
// return max;
