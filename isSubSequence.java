class isSubSequence {
  public static void main(String[] args) {

    String s = "axc";
    String t = "abhgdc";

    int i = 0;

    for (int j = 0; j < t.length(); j++) {
      if (s.charAt(i) == t.charAt(j)) {
        i++;
      }
    }

    if (i == s.length()) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}