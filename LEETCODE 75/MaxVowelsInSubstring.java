import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxVowelsInSubstring {

  public int maxVowels(String s, int k) {
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    int maxVowels = countInitialVowels(s, vowels, k);
    int currVowels = maxVowels;

    for (int i = k; i < s.length(); i++) {
      char curr = s.charAt(i);
      char toRemove = s.charAt(i - k);

      if (vowels.contains(curr))
        currVowels++;
      if (vowels.contains(toRemove))
        currVowels--;

      maxVowels = Math.max(maxVowels, currVowels);
    }
    return maxVowels;
  }

  private int countInitialVowels(String s, Set<Character> vowels, int limit) {
    int vowelCount = 0;
    for (int i = 0; i < limit; i++) {
      char c = s.charAt(i);
      if (vowels.contains(c))
        vowelCount++;
    }
    return vowelCount;
  }
}


/*
 class Solution {
    public int maxVowels(String s, int k) {
        int currentVowelCount = 0, maxVowelCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) 
                currentVowelCount++;
            if (i >= k && isVowel(s.charAt(i - k))) 
                currentVowelCount--;
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
        }
        return maxVowelCount;
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
 */