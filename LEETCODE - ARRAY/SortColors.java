public class SortColors {
  public static void main(String[] args) {
    int[] nums = { 2,0,1};
    int zeros = 0, ones = 0, twos = 0;

    for(int i=0;i<nums.length;i++){
      if(nums[i] == 0){
        zeros++;
      }
      if(nums[i] == 1){
        ones++;
      }
      if(nums[i] == 2){
        twos++;
      }
    }

    for(int i=0;i<zeros;i++){
      nums[i] = 0;
    }
    for(int i=zeros;i<zeros+ones;i++){
      nums[i] = 1;
    }
    for(int i=zeros+ones;i<nums.length;i++){
      nums[i] = 2;
    }


    for(int i=0;i<nums.length;i++){
      System.out.println(nums[i]);
    }
    System.out.println(twos);
  }

}
