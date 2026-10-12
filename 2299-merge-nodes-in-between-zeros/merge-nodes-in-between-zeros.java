class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode temp = head.next;
        int sum = 0;

        while (temp != null) {
            if (temp.val == 0) {
                curr = curr.next;
                curr.val = sum;
                sum = 0;
            } else {
                sum += temp.val;
            }
            temp = temp.next;
        }

        curr.next = null;
        return head.next;
    }
}