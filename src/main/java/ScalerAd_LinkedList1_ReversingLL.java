public class ScalerAd_LinkedList1_ReversingLL {
    class ListNode {
          public int val;
          public ListNode next;
          ListNode(int x) { val = x; next = null; }
    }
    public static ListNode reverseList(ListNode A) {
        ListNode prev = A;
        prev.next = null;
        ListNode curr = A.next;
        while(curr != null){
            ListNode tempnext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempnext;
        }
        return prev;
    }

}
