public class PivotIndex {
  public static void main(String[] args) {
    int nums[] = { 1, 7, 3, 6, 5, 6 };
    int pivot = findPivot(nums);
    System.out.println("Pivot Index: " + pivot);
  }

  public static int findPivot(int[] nums) {
    int sum = 0;
    for (int i : nums)
      sum = sum + i;

    int left = 0, right = sum;

    for (int i = 0; i < nums.length; i++) {
      right = right - nums[i];
      if (left == right)
        return i;
      left = left + nums[i];
    }
    return -1;

  }
}
