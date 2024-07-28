import java.util.Arrays;

public class ProductArrayExceptItself {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int[] result = productExceptSelf(arr);
    for(int i=0;i<result.length;i++){
      System.out.print(result[i]+" ");
    }
  }

  public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    Arrays.fill(result, 1);
    int i, leftProduct = 1;
    for (i = 0; i < n; i++) {
      result[i] = leftProduct;
      leftProduct = leftProduct * nums[i];
    }

    int rightProduct = 1;
    for(i=n-1;i>=0;i--){
      result[i] = result[i]*rightProduct;
      rightProduct = rightProduct * nums[i];
    }

    return result;

  }

}
