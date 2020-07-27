
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
//双引用
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(0);
        ListNode head = cur;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            //最后在进行移动cur
            cur = cur.next;
        }
        if (l1 == null) {
            cur.next = l2;
        } else if (l2 == null){
            cur.next = l1;
        }
        return head.next;
    }
}