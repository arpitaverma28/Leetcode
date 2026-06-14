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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode pre = null;
        while(slow != null){
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        int ans =0;
        ListNode a = head;
        ListNode b = pre;
        while(b != null){
            ans = Math.max(ans,a.val + b.val);
            a= a.next;
            b = b.next;
        }
        return ans;
    }
}