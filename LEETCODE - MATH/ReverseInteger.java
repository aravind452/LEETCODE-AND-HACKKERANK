class ReverseInteger {

  public static void main(String[] args) {
    int num = -123454444;
    int reversed = reverse(num);
    System.out.println("Reversed number is: " + reversed);
  }

  static int reverse(int num) {
    long reversed = 0;
    while (num != 0) {
      int remainder = num % 10;
      reversed = reversed * 10 + remainder;
      num = num / 10;
    }
    if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
      return 0;
    }

    return (int) reversed;
  }

}
