public class IncreasingTripletSequence {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    System.out.println(increasingTriplet(nums));

  }

  static boolean increasingTriplet(int[] nums) {
    int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] <= first) {
        first = nums[i];
      } else if (nums[i] <= second) {
        second = nums[i];
      } else {
        return true;
      }
    }
    return false;
  }
}
