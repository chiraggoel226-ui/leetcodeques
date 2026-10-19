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
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }

        if(len<k) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode forw=null;

        for(int i=0;i<k;i++){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;


        }
         ListNode rechead=reverseKGroup( curr,  k);
         head.next=rechead;
         return prev;


        
    }
}