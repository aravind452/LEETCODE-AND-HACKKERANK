import java.util.*;

public class UncommonWordsFromTwoSentences {

  public static void main(String[] args) {

    String s1 = "this apple is sweet";
    String s2 = "this apple is sour";

    String[] array = uncommonWords(s1, s2);
    System.out.println(Arrays.toString(array));

  }

  // static String[] uncommonWords(String s1, String s2) {

  // ArrayList<String> list = new ArrayList<>();

  // HashMap<String, Integer> map1 = new HashMap<>();
  // HashMap<String, Integer> map2 = new HashMap<>();
  // String[] words1 = s1.split(" ");
  // String[] words2 = s2.split(" ");
  // for (String word : words1) {
  // map1.put(word, map1.getOrDefault(word, 0) + 1);
  // }
  // for (String word : words2) {
  // map2.put(word, map2.getOrDefault(word, 0) + 1);
  // }
  // for (String word : words1) {
  // if (map1.get(word) == 1 && map2.getOrDefault(word, 0) == 0) {
  // list.add(word);
  // }
  // }
  // for (String word : words2) {
  // if (map2.get(word) == 1 && map1.getOrDefault(word, 0) == 0) {
  // list.add(word);
  // }
  // }

  // return list.toArray(new String[0]);

  // }

  // Reduced Space Complexity
  static String[] uncommonWords(String s1, String s2) {

    String combined = s1 + " " + s2;

    String[] words = combined.split(" ");

    HashMap<String, Integer> map = new HashMap<>();
    for (String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    ArrayList<String> list = new ArrayList<>();
    for (String word : map.keySet()) {
      if (map.get(word) == 1) {
        list.add(word);
      }
    }

    return list.toArray(new String[0]);

  }

}
