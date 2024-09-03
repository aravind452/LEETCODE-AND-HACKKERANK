public class RemoveDuplicates {

  public static void main(String[] args) {

    int[] nums = { 1, 1, 2 };
    int result = removeDuplicates(nums);
    System.out.println(result);

  }

  static int removeDuplicates(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int j = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        arr[j++] = arr[i];
      }
    }

    arr[j++] = arr[arr.length - 1];
    return j;

  }

}
