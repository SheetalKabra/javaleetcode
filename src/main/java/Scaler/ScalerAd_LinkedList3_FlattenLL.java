package Scaler;

public class ScalerAd_LinkedList3_FlattenLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            val = data;
            next = null;
        }
    }
    static ListNode head = null;
    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        // @params pointerType: 1-next, 2-down
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
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
    public static ListNode partition(ListNode A, int B) {
        ListNode l = null;
        ListNode r = A;
        ListNode r_prev = null;
        ListNode head1 = null;
        ListNode templ = null;
        ListNode tempr = null;
        if(r.val < B){
            l = r;

        }
        while(r != null) {
            if (r.val < B) {
                System.out.println("if:rval:"+r.val+", lval:"+l.val);
                if(l == r){
//                    l=l.next;
                    r=r.next;
                    continue;
                }
                if (l == null ) {
                    r_prev = r.next;
                    head1 = r;
                    head1.next = A.next;
                    l = head1;
                    r = r.next;
                } else {
                    templ = l.next;
                    tempr = r.next;
                    r_prev.next = r.next;
                    r.next = templ;
                    l.next = r;
                    r = tempr;
                    l = l.next;
                    r = r.next;
                }
            } else {
                r_prev = r;
                r = r.next;
            }
        }
        ListNode temp = head1;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println("");
        return head1;
    }

    public static void main(String[] args) {
        insert_node(1,1);
        insert_node(2,4);
        insert_node(3,3);
        insert_node(4,2);
        insert_node(5,5);
        insert_node(6,2);
        print_ll();
        System.out.println(partition(head, 3));

    }

}
