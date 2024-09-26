import java.util.*;

public class OptimalPartitionOfString {

  public static void main(String[] args) {

    String s = "ssssss";
    System.out.println(partitionString(s));

  }

  static int partitionString(String s) {

    HashSet<Character> set = new HashSet<>();
    int count = 1;
    for (int i = 0; i < s.length(); i++) {
      if (set.contains(s.charAt(i))) {
        count++;
        set.clear();
        set.add(s.charAt(i));
      } else {
        set.add(s.charAt(i));
      }
    }
    return count;
  }

}
