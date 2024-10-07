import java.util.*;

class PlusOne {
  public static int[] plusOne(int[] digits) {
    int i = digits.length - 1;
    while (i >= 0) {
      digits[i]++;
      if (digits[i] <= 9) {
        return digits;

      }

      digits[i] = 0;
      i--;

    }
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
  }

  public static void main(String[] args) {

    int[] res = plusOne(new int[] { 9, 9, 9, 9 });
    System.out.println(Arrays.toString(res));

  }
}