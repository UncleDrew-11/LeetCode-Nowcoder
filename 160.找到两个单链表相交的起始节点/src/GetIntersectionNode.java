public class GetIntersectionNode {
    public int getLength(ListNode head) {
        int count = 0;
        for (ListNode i = head; i != null; i = i.next) {
            count++;
        }
        return  count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLen = getLength(headA);
        int bLen = getLength(headB);
        int diff = aLen - bLen;
        ListNode longger = headA;
        ListNode shorter = headB;
        if (aLen < bLen) {
            longger = headB;
            shorter = headA;
            diff = bLen -aLen;
        }
        for (int i = 0; i < diff; i++) {//同一起跑线
            longger = longger.next;
        }
        while (longger != shorter) {
            longger = longger.next;
            shorter = shorter.next;
        }
        return longger;
    }
}
