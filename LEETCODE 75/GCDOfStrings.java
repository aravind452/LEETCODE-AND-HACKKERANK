public class GCDOfStrings {

  public static void main(String args[]) {
    String str1 = "ABCABC";
    String str2 = "ABC";
    String s = gcd(str1,str2);
    System.out.println("GCD of strings is: "+s);
     
  }


  public static String gcd(String str1, String str2){
    if(!(str1+str2).equals(str2+str1)){
      return "";
    }

    int cal = gcd(str1.length(), str2.length());
    return str1.substring(0, cal);

  }

  static int gcd(int a,int b){
    return b == 0 ? a : gcd(b, a%b);
  }

}
