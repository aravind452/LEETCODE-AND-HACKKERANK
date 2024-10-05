/*
 Given two strings s1 and s2, return true if s2 contains a 
permutation
 of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 */
package OCTOBER;

import java.util.*;

class PermutationInString {
  public static boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length())
      return false;
    int[] s1Count = new int[26];
    int[] s2Count = new int[26];
    int j;
    for (int i = 0; i < s1.length(); i++) {
      s1Count[s1.charAt(i) - 'a']++;
    }
    for (j = 0; j < s1.length(); j++) {
      s2Count[s2.charAt(j) - 'a']++;
    }
    while (j < s2.length()) {
      if (Arrays.equals(s1Count, s2Count)) {
        return true;
      }
      s2Count[s2.charAt(j) - 'a']++;
      s2Count[s2.charAt(j - s1.length()) - 'a']--;
      j++;

    }
    return Arrays.equals(s1Count, s2Count);
  }

  public static void main(String[] args) {
    String s1 = "ab";
    String s2 = "eidbaooo";
    System.out.println(checkInclusion(s1, s2));
  }

}