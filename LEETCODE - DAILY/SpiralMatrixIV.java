// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  * int val;
//  * ListNode next;
//  * ListNode() {}
//  * ListNode(int val) { this.val = val; }
//  * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//   public int[][] spiralMatrix(int m, int n, ListNode head) {

//       int[][] result = new int[m][n];
//       int left = 0, right = n - 1, top = 0, bottom = m - 1;
//       for (int i = 0; i < m; i++) {
//           for (int j = 0; j < n; j++) {
//               result[i][j] = -1;
//           }
//       }

//       ListNode curr = head;

//       while (top <= bottom && left <= right) {
//           for (int i = left; i <= right && curr != null; i++) {
//               result[top][i] = curr.val;
//               curr = curr.next;
//           }
//           top++;

//           for (int i = top; i <= bottom && curr != null; i++) {
//               result[i][right] = curr.val;
//               curr = curr.next;
//           }
//           right--;
//           if (top <= bottom) {
//               for (int i = right; i >= left && curr != null; i--) {
//                   result[bottom][i] = curr.val;
//                   curr = curr.next;
//               }
//           }
//           bottom--;
//           if (left <= right) {
//               for (int i = bottom; i >= top && curr != null; i--) {
//                   result[i][left] = curr.val;
//                   curr = curr.next;
//               }
//           }
//           left++;
//       }
//       return result;
//   }
