import java.util.Arrays;

public class XORQueriesOfArray {

  public static void main(String[] args) {
    int[] arr = { 1, 3, 4, 8 };
    int[][] queries = { { 0, 1 }, { 1, 2 }, { 0, 3 }, { 3, 3 } };
    int[] res = xorQueries(arr, queries);
    System.out.println(Arrays.toString(res));

  }

  static int[] xorQueries(int[] arr, int[][] queries) {
    int n = arr.length;
    int queryLen = queries.length;
    System.out.println(n);
    System.out.println(queryLen);
    int[] ans = new int[n];
    for (int i = 0; i < queries.length; i++) {

      int left = queries[i][0];
      int right = queries[i][1];
      int sum = 0;
      for (int j = left; j <= right; j++) {
        sum = sum ^ arr[j];

      }
      ans[i] = sum;

    }
    return ans;
  }

}
