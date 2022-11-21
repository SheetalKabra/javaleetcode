public class ScalerAd_LikedList1_ReverseLinkedListII {
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
    public static ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode p1 = A;
        ListNode p2 = null;
        ListNode p3 = null;
        ListNode temp = A;
        int count = 1;
        while(count < B){
            p1 = temp;
            temp = temp.next;
            count++;
        }
        p3 = temp;
        while(count < C){
            temp = temp.next;
            count++;
        }
        p2 = temp.next;
        temp.next = null;
        ListNode p = reverse(p3);
        if(B == 1){
            p1 = p;
        }else{
            p1.next = p;
        }
        ListNode tempp = p1;
        while(tempp.next != null){
            tempp = tempp.next;
        }

        tempp.next = p2;
        return B == 1 ? p1 : A;
    }

    public static ListNode reverse(ListNode p){
        ListNode prev = null;
        ListNode curr = p;
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
        insert_node(1, 1);
        insert_node(2, 2);
        insert_node(3, 3);
        insert_node(4, 4);
        insert_node(5, 5);
        print_ll();
        ListNode op = reverseBetween(head, 2, 4);
        ListNode temp = op;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
