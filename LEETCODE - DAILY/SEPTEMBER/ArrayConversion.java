package SEPTEMBER;
class ArrayConversion {
  public static void main(String[] args) {
    int array[] = { 1, 2, 3, 4 };

    int[][] res = construct2DArray(array, 2, 2);
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[i].length; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
    }

  }

  static int[][] construct2DArray(int[] arr, int m, int n) {
    if (arr.length != m * n) {
      return new int[0][0];
    }
    int[][] result = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        result[i][j] = arr[i * n + j];
      }
    }

    return result;

  }
}