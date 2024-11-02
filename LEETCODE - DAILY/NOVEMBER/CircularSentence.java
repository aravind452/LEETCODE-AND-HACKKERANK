package NOVEMBER;



public class CircularSentence {

  public static void main(String[] args) {
    String str = "Leetcode eisc cool";
    String[] arr = str.split(" ");

    System.out.println(isCircular(arr));

  }

  static boolean isCircular(String[] words) {

    for (int i = 0; i < words.length; i++) {
      char lastChar = words[i].charAt(words[i].length() - 1);
      char firstChar = words[(i + 1) % words.length].charAt(0);
      if (lastChar != firstChar) {
        return false;
      }
    }

    return true;

  }

}
