package SEPTEMBER;
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
//   public ListNode insertGreatestCommonDivisors(ListNode head) {

//       ListNode temp = head, prev = null;
//       while (temp != null) {
//           if (prev != null) {
//               int val = gcd(prev.val, temp.val);
//               ListNode newnode = new ListNode(val, temp);
//               prev.next = newnode;
//           }
//           prev = temp;
//           temp = temp.next;
//       }
//       return head;

//   }

//   public int gcd(int a, int b) {
//       if (b == 0) {
//           return a;
//       } else {
//           return gcd(b, a % b);
//       }
//   }
// }