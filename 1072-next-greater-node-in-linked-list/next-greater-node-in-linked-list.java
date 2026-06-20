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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> s = new Stack<>();
        int size =0;
        ListNode curr = head;
        ListNode pre = null;
        ListNode next;
        while(curr != null){
            size++;
            next = curr.next;
            curr.next = pre;
            pre= curr;
            curr = next;
        }
        int ans[] = new int[size];
        int i = size-1;
        curr = pre;
        while(curr != null){
        int num = curr.val;
        while(!s.isEmpty() && s.peek()<=num){
            s.pop();
        }
        if(s.isEmpty()){
            ans[i--] = 0;
        }else{
            ans[i--] = s.peek();
        }
         curr = curr.next;
         s.push(num);
        }
       return ans;
    }
}