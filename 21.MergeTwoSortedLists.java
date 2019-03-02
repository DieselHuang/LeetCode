/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        
        /*
        ListNode post = new ListNode(l1.val<l2.val? l1.val: l2.val);
        if(l1.val<l2.val) {
            l1 = l1.next;
        } else {
            l2 = l2.next;
        }
        ListNode res = post;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                post.next = l1;
                l1 = l1.next;                    
            } else {
                post.next = l2;
                l2 = l2.next;                    
            }
            post = post.next;
        }
        while(l1 != null) {
            post.next = l1;
            post = post.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            post.next = l2;
            post = post.next;
            l2 = l2.next;
        }
        return res;
        */
        
        //recursion
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}