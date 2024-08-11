import java.util.*;

class MininumPushes {
  public static int minimumPushes(String word) {
    int ans = 0;
    int[] freq = new int[26];

    for (char c : word.toCharArray())
      freq[c - 'a']++;

    for (int i = 0; i < freq.length; i++) {
      System.out.print(freq[i] + " ");
    }
    System.out.println();
    Arrays.sort(freq);

    for (int i = 0; i < freq.length; i++) {
      System.out.print(freq[i] + " ");
    }
    System.out.println();

    for (int i = 25; i >= 18; i--) {
      ans += freq[i] * 1;
    }
    for (int i = 17; i >= 10; i--) {
      ans += freq[i] * 2;
    }
    for (int i = 9; i >= 2; i--) {
      ans += freq[i] * 3;
    }
    for (int i = 1; i >= 0; i--) {
      ans += freq[i] * 4;
    }

    return ans;
  }

  public static void main(String[] args) {
    int ans = minimumPushes("aabccded");
    System.out.println(ans);
  }
}

/*
 * Calculate Key Presses: Sum the counts, multiplying by different weights based
 * on their rank:
 * Top 8 letters: 1 key press each.
 * Next 8 letters: 2 key presses each.
 * Next 8 letters: 3 key presses each.
 * Last 2 letters: 4 key presses each.
 */