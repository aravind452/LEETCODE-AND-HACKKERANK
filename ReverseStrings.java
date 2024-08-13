public class ReverseStrings {

  public static void main(String[] args) {
    String str = "a good  example";

    String[] reverse = str.trim().split("\\s+");

    String newStr = "";

    for (int i = reverse.length - 1; i >= 0; i--) {
      if(newStr.isEmpty()){
        newStr = reverse[i];
      }
      else {
        newStr = newStr + " " + reverse[i];
      }
     

    }

    System.out.println(newStr);
  }

}
