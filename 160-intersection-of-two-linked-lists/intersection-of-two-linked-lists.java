/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int a =0;
        int b =0;
        ListNode curr = headA;
        while(curr != null){
            a++;
            curr = curr.next;
        }
        curr = headB;
        while(curr != null){
            b++;
            curr = curr.next;
        }
        int diff = Math.abs(a-b);
        ListNode c1 = headA;
        ListNode c2 = headB;
        if(a>b){
           for(int i =0;i<diff;i++){
            c1 = c1.next;
           }
        }
        if(b>a){
            for(int i =0;i<diff;i++){
                c2 = c2.next;
            }
        }
        while(c1 != null){
            if(c1 == c2) return c1;
            c1 = c1.next;
            c2 = c2.next;
        }
        return null;
    }
}