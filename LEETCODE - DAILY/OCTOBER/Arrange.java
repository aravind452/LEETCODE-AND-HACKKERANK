package OCTOBER;

import java.util.*;
/*Given an array of integers arr of even length n and an integer k.

We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.

Return true If you can find a way to do that or false otherwise.

 

Example 1:

Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
Output: true
Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).
Example 2:

Input: arr = [1,2,3,4,5,6], k = 7
Output: true
Explanation: Pairs are (1,6),(2,5) and(3,4).
Example 3:

Input: arr = [1,2,3,4,5,6], k = 10
Output: false
Explanation: You can try all possible pairs to see that there is no way to divide arr into 3 pairs each with sum divisible by 10. */

// INTUITION

/*

First, calculate the remainders when each element of the array is divided by k.
For the array to be divisible into pairs with a sum divisible by k:
If a number has a remainder r, we need another number whose remainder is k - r so that the sum of their remainders is divisible by k.
Special case: If a number has a remainder of 0, it must be paired with another number that also has a remainder of 0.
We can count the occurrences of each remainder and check if we can form valid pairs based on the remainders.

 */

public class Arrange {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 7;
    System.out.println(canArrange(arr, k));

  }

  public static boolean canArrange(int[] arr, int k) {
    Map<Integer, Integer> rem = new HashMap<>();

    for (int num : arr) {
      int remainder = num % k;

      if (remainder < 0) {
        remainder += k;
      }
      rem.put(remainder, rem.getOrDefault(remainder, 0) + 1);
    }
    System.out.println(rem.keySet());
    System.out.println(rem.values());
    for (int r : rem.keySet()) {

      if (r == 0) {
        if (rem.get(r) % 2 != 0) {
          return false;
        }
      } else {

        int anotherRem = k - r;
        if (!rem.get(r).equals(rem.getOrDefault(anotherRem, 0))) {
          return false;
        }
      }
    }

    return true;

  }

}
