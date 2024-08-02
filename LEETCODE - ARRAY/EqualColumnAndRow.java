public class EqualColumnAndRow {
  public static void main(String[] args) {
    int[][] arr = { { 3, 1,2,2 }, { 1, 4,4,5 }, { 2, 4,2,2 } ,{ 2, 4,2,2 } };
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        int count = 1;
        for (int k = 0; k < arr.length; k++) {
          if (arr[k][i] != arr[j][k]) {
            count = 0;
            break;
          }
        }
        ans = ans + count;
      }
    }

    System.out.println(ans);
  }

}
