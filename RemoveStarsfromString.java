import java.util.*;

public class RemoveStarsfromString {

  public static void main(String[] args) {
    String str = "leet**cod*e";
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '*') {
        if(!stack.isEmpty()){
          stack.pop();
        }
        
      }

      else {
        stack.push(str.charAt(i));
      }
    }

    StringBuilder result = new StringBuilder();
    for (Character ch : stack) {
      result.append(ch);
    }

    System.out.println(result.toString());
  }

}
