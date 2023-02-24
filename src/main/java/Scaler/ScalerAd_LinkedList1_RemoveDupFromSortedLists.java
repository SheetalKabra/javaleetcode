package Scaler;

public class ScalerAd_LinkedList1_RemoveDupFromSortedLists {
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

    public  static ListNode removeDupFromSortedLists(ListNode A){
        ListNode p1 = A;
        ListNode head1 = p1;
        ListNode p2 = p1.next;
        while(p2 != null){
            if(p1.data == p2.data){
                p1.next = p2.next;
                p2 = p2.next;
            }else{
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return head1;
    }

    public static void main(String[] args) {
//        insert_node(1,1);
//        insert_node(2,1);
//        insert_node(3,1);
//        insert_node(4,2);
//        insert_node(5,2);
//        insert_node(6,3);
//        insert_node(7,4);
//        insert_node(8,4);
//        insert_node(9,5);
//        insert_node(1,1);
//        insert_node(2,1);
//        insert_node(3,2);
        insert_node(1,1);
        insert_node(2,1);
        insert_node(3,2);
        insert_node(4,3);
        insert_node(5,3);
        print_ll();
        ListNode head1 = removeDupFromSortedLists(head);
        ListNode temp = head1;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
