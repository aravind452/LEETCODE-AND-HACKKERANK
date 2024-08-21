import java.util.List;

public class DiagonalDifference {

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int primaryDiagonalSum = 0;
    int secondaryDiagonalSum = 0;

    for (int i = 0; i < matrix.length - 1; i++) {
      primaryDiagonalSum += matrix[i][i];
      secondaryDiagonalSum += matrix[i][matrix.length - 1 - i];
    }

    int difference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);

    System.out.println(difference);

  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    

    int primaryDiagonalSum = 0;
    int secondaryDiagonalSum = 0;

    for (int i = 0; i < arr.size(); i++) {
      primaryDiagonalSum += arr.get(i).get(i);
      secondaryDiagonalSum += arr.get(i).get(arr.size() - 1 - i);
    }

    int difference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);

    return difference;

  }
}
