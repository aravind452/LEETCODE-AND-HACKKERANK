
public class LeftRotation {

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5 };
    int d = 4;
    int[] result = leftRotation(arr, d);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }

  static int[] leftRotation(int[] arr, int d) {
    int n = arr.length;
    int[] result = new int[n];
    for (int i = d; i < n; i++) {
      result[i - d] = arr[i];
    }
    for (int i = 0; i < d; i++) {
      result[n - d + i] = arr[i];
    }
    return result;
  }

}
