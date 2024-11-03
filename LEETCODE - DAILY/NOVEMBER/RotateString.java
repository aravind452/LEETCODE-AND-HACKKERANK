package NOVEMBER;

class RotateString {

  public static void main(String[] args) {
    String s = "abcde";
    String goal = "cdeab";
    System.out.println(rotateString(s, goal));

  }

  static boolean rotateString(String s, String goal) {

    if (s.length() != goal.length()) {
      return false;
    }

    String concatenated = s + s;

    return concatenated.contains(goal);
  }

}