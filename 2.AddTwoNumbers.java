/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode res = pre;
        int sum = 0;
        
        while (l1!=null || l2!=null || sum!=0) {
            sum = (l1==null? 0: l1.val) + (l2==null? 0: l2.val) + sum;
            pre.next = new ListNode(sum % 10);
            pre = pre.next;
            l1 = l1==null? l1: l1.next;
            l2 = l2==null? l2: l2.next;
            sum /= 10;
        }
        return res.next;
    }
}
