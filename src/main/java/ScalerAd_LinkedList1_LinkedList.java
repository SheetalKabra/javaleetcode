import java.util.HashMap;
import java.util.Map;

public class ScalerAd_LinkedList1_LinkedList {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            data = val;
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

    public static void print_ll() {
        // Output each element followed by a space
        if(head != null){
            ListNode temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static ListNode solve(ListNode A) {
        ListNode ptr_slow = A;
        ListNode ptr_fast = A;
        ListNode ptr_slow_prev = null;
        while (ptr_fast != null && ptr_fast.next != null) {
            ptr_slow_prev = ptr_slow;
            ptr_slow = ptr_slow.next;
            ptr_fast = ptr_fast.next.next;
        }
        System.out.println("ptr_slow_prev data:"+ptr_slow_prev.data);
        System.out.println("ptr_slow data:"+ptr_slow.data);
        ptr_slow_prev.next = ptr_slow_prev.next.next;
        return A;
    }

    public static ListNode deleteDuplicates(ListNode A) {
        Map<Integer, ListNode> hm = new HashMap<>();
        ListNode ptr = A;
        ListNode head = null;
        while(ptr != null){
            hm.put(ptr.data, ptr.next);
            ptr = ptr.next;
        }
        System.out.println("hm:"+hm);
        for(Integer val : hm.keySet()){
            // here hmkey = val, hmval = hm.get(val)
            ListNode new_node = new ListNode(val);
            if(head == null){
                head = new_node;
            }else{
                ListNode temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new_node;
            }
        }

        return head;
    }

    public static ListNode sortList(ListNode A) {
        print_ll();
        if(A == null || A.next == null){
            return A;
        }
        ListNode mid = middle(A);
        System.out.println("mid:"+mid.data);
        ListNode B = mid.next;
        mid.next = null;
        ListNode h1 = sortList(A);
        System.out.println("h1:"+h1);
        ListNode h2 = sortList(B);
        return merge(h1, h2);
    }

    public static ListNode merge(ListNode A, ListNode B){
        ListNode h3 = null;
        if(A.data > B.data){
            h3 = B;
            B = B.next;
        }else{
            h3 = A;
            A = A.next;
        }
        ListNode temp = h3;
        while(A != null && B != null){
            if(A.data > B.data){
                temp.next = B;
                B = B.next;
            }else{
                temp.next = A;
                A = A.next;
            }
            temp = temp.next;
        }
        if(A != null){
            temp.next = A;
        }
        if(B != null){
            temp.next = B;
        }
        return h3;
    }

    public static ListNode middle(ListNode A){
        ListNode slow = A;
        ListNode fast = A;
        ListNode slow_prev = null;
        while(fast != null && fast.next != null){
            slow_prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow_prev;
    }

//    public static ListNode reorderList(ListNode A) {
//        ListNode p1 = A;
//        if(p1.next == null){
//            System.out.println("final:");
//            ListNode tempp31 = p1;
//            while(tempp31 != null){
//                System.out.print(tempp31.data+" ");
//                tempp31 = tempp31.next;
//            }
//            System.out.println("");
//            return p1;
//        }
////        ListNode tempp1 = p1;
////        while(tempp1 != null){
////            System.out.print(tempp1.data+" ");
////            tempp1 = tempp1.next;
////        }
//        ListNode mid  = mid(A);
////        System.out.println("mid:"+mid.data);
//        ListNode p2 = reverseList(mid.next);
////        ListNode tempp2 = p2;
////        while(tempp2 != null){
////            System.out.print(tempp2.data+" ");
////            tempp2 = tempp2.next;
////        }
////        System.out.println("");
//        mid.next = null;
////        System.out.println("after mid is null: ");
////        ListNode tempp11 = p1;
////        while(tempp11 != null){
////            System.out.print(tempp11.data+" ");
////            tempp11 = tempp11.next;
////        }
////        System.out.println("");
////
////        System.out.println("p2: after mid is null:");
////        ListNode tempp21 = p2;
////        while(tempp21 != null){
////            System.out.print(tempp21.data+" ");
////            tempp21 = tempp21.next;
////        }
////        System.out.println("");
//
//
//        ListNode p3 = null;
//        p3 = p1;
//        p1 = p1.next;
//        ListNode temp = p3;
////        if(p1 == null){
////            return p3;
////        }
////        ListNode tempp3 = p3;
////        while(tempp3 != null){
////            System.out.print(tempp3.data+" ");
////            tempp3 = tempp3.next;
////        }
////        System.out.println("");
//        temp.next = p2;
////        ListNode tempp31 = p3;
////        while(tempp31 != null){
////            System.out.print(tempp31.data+" ");
////            tempp31 = tempp31.next;
////        }
////        System.out.println("");
//        p2 = p2.next;
//        temp = temp.next;
//
////        System.out.println("p1:"+p1.data);
////        System.out.println("p2:"+p2.data);
//        while(p1 != null){
//            temp.next = p1;
//            temp = temp.next;
//            p1 = p1.next;
//            temp.next = p2;
//            temp = temp.next;
//            p2 = p2.next;
//        }
//
//        System.out.println("final:");
//        ListNode tempp31 = p3;
//        while(tempp31 != null){
//            System.out.print(tempp31.data+" ");
//            tempp31 = tempp31.next;
//        }
//        System.out.println("");
//        return p3;
//    }
//
//    public static ListNode mid(ListNode A){
//        ListNode slow = A;
//        ListNode fast = A;
//        ListNode slow_prev = null;
//        while(fast != null && fast.next != null){
//            slow_prev = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow_prev;
//    }
//
//    public static ListNode reverseList(ListNode A){
//        ListNode prev = null;
//        ListNode curr = A;
//        ListNode curr_next = null;
//        while(curr != null){
//            curr_next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = curr_next;
//        }
//        return prev;
//    }


    public static ListNode removeLoopFromLinkedList(ListNode A) {
        ListNode p1 = meetingPoint(A);
        ListNode p2 = A;
        ListNode p1_prev = null;
        while(p1 != p2){
            p1_prev = p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = null;
        return p1;
    }

    public static ListNode meetingPoint(ListNode A){
        ListNode slow = A;
        ListNode fast = A;
        while(fast != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }

    public static int lPalin(ListNode A) {
        ListNode mid = middlepalin(A);

        if(mid == null){
            return 1;
        }
        //==============================================
        ListNode temp = A;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
        //==============================================

        System.out.println("mid:"+mid.data);
        ListNode p2 = reverse(mid.next);
        //==============================================
        ListNode temp1 = p2;
        while(temp1 != null){
            System.out.print(temp1.data+" ");
            temp1 = temp1.next;
        }
        System.out.println("");
        //==============================================
        mid.next = null;
        while(A!= null && p2 != null){
            if(A.data != p2.data){
                return 0;
            }
            A = A.next;
            p2 = p2.next;
        }
        return 1;
    }

    public static ListNode middlepalin(ListNode A){
        ListNode slow = A;
        ListNode fast = A;
        ListNode slow_prev = null;
        while(fast != null && fast.next != null){
            slow_prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow_prev;
    }

    public static ListNode reverse(ListNode A){
        ListNode prev = null;
        ListNode curr = A;
        ListNode curr_next = null;
        while(curr != null){
            curr_next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr_next;
        }
        return prev;
    }

        public static void main(String[] args) {
            insert_node(1,1);
//            insert_node(2,3);
//            insert_node(3,3);
//            insert_node(4,4);
//            insert_node(3,1);
            System.out.println("op:"+lPalin(head));


//            25 -> 51 -> 45 -> 29 -> 55 -> 63 -> 48 -> 27 -> 72 -> 10 -> 36 -> 68 -> 16 -> 20 -> 31 -> 7 -> 95 ->
//            70 -> 89 -> 23 -> 22 -> 9 -> 74 -> 71 -> 35 -> 5 -> 80 -> 11 -> 49 -> 92 -> 69 -> 6 -> 37 -> 84 -> 78 -> 28 ->
//            43 -> 64 -> 96 -> 57 -> 83 -> 13 -> 73 -> 97 -> 75 -> 59 -> 53 -> 52 -> 19 -> 18 -> 98 -> 12 -> 81 -> 24 ->
//            15 -> 60 -> 79 -> 34 -> 1 -> 54 -> 93 -> 65 -> 44 -> 4 -> 87 -> 14 -> 67 -> 26 -> 30 ->
//            77 -> 58 -> 85 -> 33 -> 21 -> 46 -> 82 -> 76 -> 88 -> 66 -> 101 -> 61 -> 47 -> 8
//        insert_node(1,90);insert_node(2,94);insert_node(3,25);
//        insert_node(4,51);insert_node(5,45);insert_node(6,29);
//        insert_node(7,55);insert_node(8,63);insert_node(9,48);
//        insert_node(10,27);insert_node(11,72);insert_node(12,10);
//        insert_node(13,36);insert_node(14,68);insert_node(15,16);
//        insert_node(16,20);insert_node(17,31);insert_node(18,7);
//        insert_node(19,95);insert_node(20,70);insert_node(21,89);
//        insert_node(22,23);insert_node(23,22);insert_node(24,9);
//        insert_node(25,74);insert_node(26,71);
//            insert_node(1, 1);insert_node(2, 2);insert_node(3, 3);
//            insert_node(4, 4);insert_node(5, 5);insert_node(6, 6);
            insert_node(1, 1);insert_node(2, 2);insert_node(3, 3);
            insert_node(4, 4);insert_node(5, 5);
//            insert_node(1, 1);
//            insert_node(2, 2);

        //reorderList(head);
//        insert_node(2,1);
//        insert_node(3,10);
//        insert_node(4,8);
//        insert_node(5,5);
//        System.out.println(sortList(head));
//        print_ll();
//        print_ll();
        //solve(head);


//        insert_node(1, 226);
//        insert_node(2, 875);
//        insert_node(3, 604);
//        insert_node(4, 550);
//        insert_node(5, 498);
//        insert_node(6, 875);
//        insert_node(7, 847);
//        insert_node(8, 633);
//        insert_node(9, 793);
//        insert_node(10, 872);
//        insert_node(11, 313);
//        insert_node(12, 440);
//        insert_node(13, 331);
//        insert_node(13, 331);


    }

}
