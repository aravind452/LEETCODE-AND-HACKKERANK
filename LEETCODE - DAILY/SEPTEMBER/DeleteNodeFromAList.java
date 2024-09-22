package SEPTEMBER;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class DeleteNodeFromAList {
//     public ListNode modifiedList(int[] nums, ListNode head) {

//         ListNode temp = new ListNode(0,head);
        
//         Set<Integer> set = IntStream.of(nums)
//                 .boxed()
//                 .collect(Collectors.toSet());
//         for (ListNode curr = temp; curr.next != null;) {
//             if (set.contains(curr.next.val))
//                 curr.next = curr.next.next;
//             else
//                 curr = curr.next;
//         }

//         return temp.next;

//     }
// }