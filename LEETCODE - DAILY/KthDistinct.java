import java.util.*;

public class KthDistinct {

  public static void main(String[] args) {

    String[] arr = { "d", "b", "c", "b", "c", "a" };
    int k = 3;

    HashMap<String, Integer> map = new HashMap<>();

    for (String str : arr) {
      map.put(str, map.getOrDefault(str, 0) + 1);
    }

    ArrayList<String> list = new ArrayList<>();

    for (String str : arr) {
      if (map.get(str) == 1) {
        if (!list.contains(str)) {
          list.add(str);
        }
      }
    }

    if (k <= list.size()) {
      System.out.print(list.get(k - 1));
    } else {
      System.out.println("nothing");
    }

  }

}
