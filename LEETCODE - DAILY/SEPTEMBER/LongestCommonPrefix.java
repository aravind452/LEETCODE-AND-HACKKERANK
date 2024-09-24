package SEPTEMBER;

import java.util.*;

public class LongestCommonPrefix {
  public static void main(String[] args) {

    int[] arr1 = { 1, 10, 100 };
    int[] arr2 = { 1000 };
    System.out.println(longestCommonPrefix(arr1, arr2));

  }

  // Brute Force Approach
  // static int longestCommonPrefix(int[] arr1, int[] arr2) {

  // int max = 0;
  // for (int i : arr1) {
  // for (int j : arr2) {
  // String x = Integer.toString(i);
  // String y = Integer.toString(j);
  // int common = getCommonPrefix(x, y);
  // max = Math.max(max, common);
  // }

  // }
  // return max;

  // }

  // static int getCommonPrefix(String x, String y) {
  // int count = 0;
  // int min = Math.min(x.length(), y.length());
  // for (int i = 0; i < min; i++) {
  // if (x.charAt(i) == y.charAt(i)) {
  // count++;
  // } else {
  // break;
  // }
  // }
  // return count;
  // }

  // Using Hashset

  static int longestCommonPrefix(int[] arr1, int[] arr2) {
    Set<Integer> set = new HashSet<>();
    for (int i : arr1) {
      generatePrefixes(i, set);
    }
    int max = 0;
    for (int j : arr2) {

      while (j > 0) {
        if (set.contains(j)) {
          max = Math.max(max, j);
          break;
        }
        j = j / 10;
      }
    }
    return max;
  }

  static void generatePrefixes(int i, Set<Integer> set) {

    while (i > 0) {
      set.add(i);
      i /= 10;
    }

  }
}
