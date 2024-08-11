import java.util.*;
public class ReverseVowels {

  public static void main(String[] args){

    String str = "Hello";
    System.out.println(reverseVowels(str));

  }

  public static String reverseVowels(String str){

    char[] ch = str.toCharArray();

    String index = "aeiouAEIOU";

    Stack<Character> stack = new Stack<>();

    for(char c: ch){
      if(index.indexOf(c)!=-1){
        stack.push(c);
      }
    }

    for(int i=0;i<ch.length;i++){
      if(index.indexOf(ch[i])!=-1){
        ch[i] = stack.pop();
      }
    }

    return new String(ch);


  }
  
}
