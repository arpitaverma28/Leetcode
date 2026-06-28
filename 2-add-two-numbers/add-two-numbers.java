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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        int sum =l1.val+l2.val;
        int nodeval =sum%10;
        int rem =sum/10;
        ListNode head = new ListNode(nodeval);
        ListNode curr = head;
        l1=l1.next;
        l2=l2.next;
        while(l1 !=null && l2 != null){
            sum=l1.val + l2.val +rem;
            nodeval = sum%10;
            rem =sum/10;
            curr.next= new ListNode(nodeval);
            curr = curr.next;
            l1=l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            sum=l1.val + rem;
            nodeval = sum%10;
            rem =sum/10;
            curr.next= new ListNode(nodeval);
            curr = curr.next;
            l1=l1.next;
           
        }
         while(l2 != null){
            sum=l2.val + rem;
            nodeval = sum%10;
            rem =sum/10;
            curr.next= new ListNode(nodeval);
            curr = curr.next;
            l2=l2.next;
           
        }
        if(rem !=0){
              curr.next= new ListNode(rem);
        }
        return head;
    }
}