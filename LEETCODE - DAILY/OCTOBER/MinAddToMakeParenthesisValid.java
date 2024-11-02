/*
 921. Minimum Add to Make Parentheses Valid
Medium
Topics
Companies
A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

 

Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3
 */

package OCTOBER;

public class MinAddToMakeParenthesisValid {

  public static void main(String[] args) {

    System.out.println(minAddToMakeParenthesisValid("((("));

  }

  static int minAddToMakeParenthesisValid(String s) {

    int imbalance = 0;
    int count = 0;
    for (char c : s.toCharArray()) {
      if (c == '(') {
        count++;
      } else {
        if (count > 0) {
          count--;
        } else {
          imbalance++;
        }

      }
    }
    return imbalance + count;

  }

}