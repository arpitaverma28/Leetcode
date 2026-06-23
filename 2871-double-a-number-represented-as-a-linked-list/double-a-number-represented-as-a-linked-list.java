/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode curr){
        ListNode pre =null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr= next;
        }
        return pre;
    }
    public ListNode doubleIt(ListNode head) {
       head = reverse(head);
        int rem =0;
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null){
            int val =2*curr.val+rem;
            curr.val =val%10;
            rem = val/10;
            pre=curr;
            curr=curr.next;
        }
        if(rem !=0){
            ListNode node =new ListNode(rem);
            pre.next =node;
        
        }
         return reverse(head);
    }
}