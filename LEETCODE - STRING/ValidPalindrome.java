public class ValidPalindrome {

  public static void main(String[] args) {
    System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
  }

  public static boolean isValidPalindrome(String str) {
    StringBuilder clean = new StringBuilder();

    for (char c : str.toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        clean.append(Character.toLowerCase(c));
      }
    }

    String cleanedStr = clean.toString();
    String reversedStr = clean.reverse().toString();

    return cleanedStr.equals(reversedStr);
  }

}
