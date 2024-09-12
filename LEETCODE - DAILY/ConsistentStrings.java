public class ConsistentStrings {

  public static void main(String[] args) {
    String s = "abc";
    String[] words = { "ad", "bd", "aaab", "baa", "badab" };

    int result = consistentStrings(s, words);
    System.out.println(result);
  }

  public static int consistentStrings(String s, String[] words) {
    int[] booleanArray = new int[26];
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      booleanArray[s.charAt(i) - 'a']++;
    }
    for (String word : words) {
      boolean flag = true;
      for (int i = 0; i < word.length(); i++) {
        if (booleanArray[word.charAt(i) - 'a'] == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        count++;
      }
    }

    return count;

  }

}
