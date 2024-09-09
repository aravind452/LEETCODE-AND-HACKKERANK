import java.util.*;
public class MaxKSumPairs {

  public static void main(String args[]) {

    int arr[] = { 7, 4, 7, 0, 6, 3, 5, 5, 6 };
    int val = 11;
    Arrays.sort(arr);

    int l = 0, r = arr.length - 1, res = 0;

    while (l < r) {
      if (arr[l] + arr[r] < val) {
        l++;
      } else if (arr[l] + arr[r] > val) {
        r--;
      } else {
        l++;
        r--;
        res = res + 1;
      }
    }

    System.out.println(res);
  }

}
