class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode rev = prev;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while (rev != null) {
            int sum = rev.val * 2 + carry;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carry = sum / 10;
            rev = rev.next;
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        ListNode ans = null;
        curr = dummy.next;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = ans;
            ans = curr;
            curr = next;
        }

        return ans;
    }
}