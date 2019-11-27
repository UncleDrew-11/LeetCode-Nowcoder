public class MergeTwoLists {
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode c1 = l1;
            ListNode c2 = l2;
            ListNode nHead = new ListNode(1);
            ListNode nLast = nHead;
            if (c1 == null) {
                return c2;
            }
            if (c2 == null) {
                return c1;
            }
            while (true) {
                if (c1.val <= c2.val) {
                    nLast.next = c1;
                    nLast = c1;
                    c1 = c1.next;
                    if (c1 == null) {
                        break;
                    }
                } else {
                    nLast.next = c2;
                    nLast = c2;
                    c2 = c2.next;
                    if (c2 == null) {
                        break;
                    }
                }
            }
            if (c1 == null) {
                nLast.next = c2;
            }
            if (c2 == null) {
                nLast.next = c1;
            }
            return nHead.next;
        }
    }
}
