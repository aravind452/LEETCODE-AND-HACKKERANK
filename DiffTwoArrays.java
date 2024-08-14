import java.util.*;

public class DiffTwoArrays {

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 4, 5, 6, 7, 8 };

    List<List<Integer>> res = findDifference(arr1, arr2); 
    System.out.println(res);

  }

  public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> s1 = new HashSet<>();
    Set<Integer> s2 = new HashSet<>();
    List<List<Integer>> ans = new ArrayList<>();
    ans.add(new ArrayList<>());
    ans.add(new ArrayList<>());

    for (int i : nums1) {
      s1.add(i);
    }

    for (int i : nums2) {
      s2.add(i);
    }

    for (int i : s1) {
      if (!s2.contains(i)) {
        ans.get(0).add(i);
      }
    }

    for (int i : s2) {
      if (!s1.contains(i)) {
        ans.get(1).add(i);
      }
    }

    return ans;
  }

}
