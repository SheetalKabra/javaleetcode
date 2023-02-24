package Scaler;

public class ScalerAd_LinkedList3_PArtitionList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            val = data;
            next = null;
        }
    }
    static ListNode head = null;
    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        ListNode newnode = new ListNode(value);
        if(head == null){
            head = newnode;
        }else if(position == 1){
            ListNode new_node = new ListNode(value);
            ListNode temp = head;
            head = new_node;
            new_node.next = temp;
        }else{
            ListNode ptr = head;
            for(int i=0; i<position-2; i++){
                ptr = ptr.next;
            }
            ListNode new_node = new ListNode(value);
            new_node.next = ptr.next;
            ptr.next = new_node;
        }
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(head != null){
            if(position == 1){
                head = head.next;
            }else{
                ListNode ptr = head;
                for(int i=0; i<position-2; i++){
                    ptr = ptr.next;
                }
                ptr.next = ptr.next.next;
            }
        }
    }

    public static void print_ll(ListNode A) {
        // Output each element followed by a space
        if(A != null){
            ListNode temp = A;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //31 -> 384 -> 183 -> 463
//        insert_node(1,31);
//        insert_node(2,384);
//        insert_node(3,183);
//        insert_node(4,463);
//        print_ll(partition(head, 77));

//        A : [ 401 -> 143 -> 654 -> 910 -> 559 -> 582 -> 332 -> 26 -> 914 -> 611 -> 13 -> 160 -> 883 ->
//        212 -> 100 -> 341 -> 999 -> 436 -> 95 -> 969 -> 210 -> 181 -> 318 -> 330 -> 753 -> 422 -> 180 ->
//        271 -> 127 -> 299 -> 10 ]
//        B : 88
        insert_node(1, 401);
        insert_node(2, 401);
        insert_node(3,143);
        insert_node(4,654);
        insert_node(5,910);
        insert_node(6,559);
        insert_node(7,582);
        insert_node(8,332);
        insert_node(9,26);
        insert_node(10,914);
        insert_node(11,611);
        insert_node(12,13);
        insert_node(13,160);
        insert_node(14,883);
        insert_node(15,212);
        insert_node(16,100);
        insert_node(17, 341);
        insert_node(18, 999);
        insert_node(19, 436);
        insert_node(20, 95);
        insert_node(21,969);
        insert_node(22,210);
        insert_node(23,181);
        insert_node(24,318);
        insert_node(25,330);
        insert_node(26,753);
        insert_node(27,422);
        insert_node(28,180);
        insert_node(29,271);
        insert_node(29,127);
        insert_node(30,299);
        insert_node(31, 10);
        print_ll(partition(head, 88));

    }

    public static ListNode partition(ListNode A, int B) {
        ListNode l1_head = null;
        ListNode l1_tail = null;
        ListNode l2_head = null;
        ListNode l2_tail = null;
        ListNode curr = A;
        while(curr != null){
            if(curr.val < B){
                //assign into L1
                if(l1_head == null){
                    l1_head = curr;
                    l1_tail = curr;
                }else{
                    l1_tail.next = curr;
                    l1_tail = l1_tail.next;
                }
                //l1_tail.next = null;
            }else{
                //assign into L2
                if(l2_head == null){
                    l2_head = curr;
                    l2_tail = curr;
                }else{
                    l2_tail.next = curr;
                    l2_tail = l2_tail.next;
                }
                //l2_tail.next = null;
            }
            curr = curr.next;
        }
        if(l1_head == null){
            return l2_head;
        }else if(l2_head == null){
            return l1_head;
        }
        l1_tail.next = l2_head;
        return l1_head;
    }
}
