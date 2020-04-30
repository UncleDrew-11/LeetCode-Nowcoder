
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode sHead = new ListNode(-1);
        ListNode bHead = new ListNode(-1);
        ListNode sTmp = sHead;
        ListNode bTmp = bHead;
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.val < x) {
                sTmp.next = new ListNode(cur.val);
                sTmp = sTmp.next;
            } else {
                bTmp.next = new ListNode(cur.val);
                bTmp = bTmp.next;
            }
            cur = cur.next;
        }
        sTmp.next = bHead.next;
        return sHead.next;
    }
}
