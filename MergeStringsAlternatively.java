public class MergeStringsAlternatively {
  
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "pqrs";


    int length1 = s1.length();
    int length2 = s2.length();

    int maxLength = Math.max(length1,length2);

    String result = "";

    for(int i=0;i<maxLength;i++){
      if(i<length1){
        result += s1.charAt(i);
      }
      if(i<length2){
        result += s2.charAt(i);
      }
    }
    System.out.println(result);
  }
}
