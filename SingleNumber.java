import java.util.*;

public class SingleNumber {

  public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<>();

    int[] nums = { 2, 2, 1 };

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        System.out.println(entry.getValue());
      }
    }

  }

}

// public class SingleNumber {
// public static void main(String[] args){
// int[] nums = {2, 2, 1};
// int result = 0;
// for(int num: nums){
// result ^= num;
// }
// System.out.println(result);
// }
// }