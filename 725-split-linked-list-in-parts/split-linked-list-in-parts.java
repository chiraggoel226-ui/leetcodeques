class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        ListNode temp = head;
        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int baselen = len / k;
        int xtra = len % k;

        ListNode curr = head;

        for (int idx = 0; idx < k; idx++) {
            ans[idx] = curr;

            int width = baselen + (idx < xtra ? 1 : 0);

            for (int i = 1; i < width; i++) {
                curr = curr.next;
            }

            if (curr != null) {
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        }

        return ans;
    }
}