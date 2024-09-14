class MinimumFlips {

  public static void main(String[] args) {

    int start = 7;
    int goal = 10;
    int xor = start ^ goal;
    // System.out.println(xor);
    int result = Integer.bitCount(xor);
    System.out.println(result);
  }

}

// class Solution {
//   public int minBitFlips(int start, int goal) {
//     int xor = start ^ goal;
//     int count = 0;
//     while (xor != 0) {
//       count += xor & 1;
//       xor >>= 1;
//     }
//     return count;

//   }

// }