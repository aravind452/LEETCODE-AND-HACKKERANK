public class MedianTwoSortedArrays {

  public static void main(String[] args) {
    int[] nums1 = { 1, 3 };
    int[] nums2 = { 2 };
    System.out.println(median(nums1, nums2));

  }

  public static double median(int[] nums1, int[] nums2){
    int i = 0, j = 0, k = 0;

    int[] ans = new int[nums1.length + nums2.length];

    while (i<nums1.length && j<nums2.length){
      if(nums1[i]<nums2[j]){
        ans[k++] = nums1[i++];
      }
      else {
        ans[k++] = nums2[j++];
      }
    }

    while (i<nums1.length){
      ans[k++] = nums1[i++];
    }
    while (j<nums2.length){
      ans[k++] = nums2[j++];
    }

    if((nums1.length + nums2.length) % 2 == 0){
      System.out.println("first");
      return (ans[(nums1.length + nums2.length) / 2 - 1] +  
      ans[(nums1.length + nums2.length) / 2]) / 2.0;
    }

    else {
      System.out.println("second");
      return (double)ans[(nums1.length + nums2.length) / 2];
    }

  }

}
