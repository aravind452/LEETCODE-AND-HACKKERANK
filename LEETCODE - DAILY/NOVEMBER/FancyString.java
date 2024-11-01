package NOVEMBER;

/*
1957. Delete Characters to Make Fancy String
Easy
Topics
Companies
Hint
A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

 

Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".

A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".
 */

public class FancyString {

  public static void main(String[] args) {
    System.out.println(makeStringFancy("aaabaaaa"));

  }

  static String makeStringFancy(String s) {
    char prev = s.charAt(0);
    int freq = 1;
    StringBuilder res = new StringBuilder();
    res.append(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == prev)
        freq++;
      else {
        prev = s.charAt(i);
        freq = 1;
      }
      if (freq < 3)
        res.append(s.charAt(i));
    }
    return res.toString();

  }

}
