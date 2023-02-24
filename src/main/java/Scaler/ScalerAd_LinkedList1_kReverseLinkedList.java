package Scaler;

public class ScalerAd_LinkedList1_kReverseLinkedList {

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

    public static void print_ll(ListNode A) {
        // Output each element followed by a space
        if(A != null){
            ListNode temp = A;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
    
    public static ListNode reverseList(ListNode A, int B) {
        ListNode p1 = A;
        ListNode tmp = null;
        ListNode op = null;
        while(p1 != null){
            ListNode tmpp1 = p1;
            int count = 1;
            while(count < B){
                p1 = p1.next;
                count++;
            }
            ListNode p2 = p1.next;
            p1.next = null;
//            System.out.println("tmpp1:");
//            print_ll(tmpp1);
            if(tmp == null){
                tmp = reverse(tmpp1);
                op = tmp;
//                System.out.println("tmp if after reverse:");
//                print_ll(tmp);
//                System.out.println("before tmp:"+tmp.data);
                while(tmp.next !=null){
                    tmp = tmp.next;
                }
                //System.out.println("after tmp:"+tmp.data);
            }else{
                //System.out.println("tmp:"+tmp.data);
                tmp.next = reverse(tmpp1);
                //System.out.println("tmp else after reverse:");
                //print_ll(tmp);
                while(tmp.next !=null){
                    tmp = tmp.next;
                }
            }
            p1 = p2;
        }
        return op;
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
        insert_node(2,2);
        insert_node(3,3);
        insert_node(4,4);
        insert_node(5,5);
        insert_node(6,6);
        print_ll(head);
        ListNode op = reverseList(head, 6);
        System.out.println("op:");
        print_ll(op);
    }
}
