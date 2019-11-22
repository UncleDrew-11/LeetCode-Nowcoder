public class DeleteDuplication {
    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode prev = new ListNode();
        ListNode fake = prev;
        prev.next = pHead;
        ListNode cur = pHead;
        ListNode next = pHead.next;
        while (next != null) {
            if (cur.val != next.val) {
                prev = prev.next;
                cur = cur.next;
                next = next.next;
            } else {
                if (next != null && cur.val == next.val) {
                    next = next.next;
                }
                prev.next = next;
                cur = next;
                if (next != null) {
                    next = next.next;
                }
            }
        }
        return fake.next;
    }
}
