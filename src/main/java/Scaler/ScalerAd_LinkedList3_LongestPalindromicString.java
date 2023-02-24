package Scaler;

public class ScalerAd_LinkedList3_LongestPalindromicString {
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
    
    public static int solve(ListNode A) {
        int max = Integer.MIN_VALUE;
        int N = lengthOfLL(A);
        ListNode freshlist = A;
        for(int i=2; i<=N; i++){
            ListNode tmp = A;
            int count = 1;
            while(count < i){
                tmp = tmp.next;
                count++;
            }
            ListNode p2 = tmp.next;
            tmp.next = null;
            ListNode B = tmp;
            if(isPalindrome(B)){
                max = Math.max(i, max);
            }
            System.out.print("A:");print_ll(A);
            //here I again want to assign the A.next = p2.
            //that I am not able to do it

        }

        return max;

    }

    public static int lengthOfLL(ListNode A){
        int count = 1;
        ListNode tmp = A;
        while(tmp.next != null){
            tmp = tmp.next;
            count++;
        }
        return count;
    }

    public static boolean isPalindrome(ListNode A){
        System.out.println("in palindrom:");
        print_ll(A);
        ListNode mid = middle(A);
        if(mid == null){
            return true;
        }
        ListNode p2 = reverse(mid.next);
        mid.next = null;
        while(A != null && p2 != null){
            if(A.val != p2.val){
                return false;
            }
            A = A.next;
            p2 = p2.next;
        }
        return true;
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
        insert_node(1,2);
        insert_node(2,1);
        insert_node(3,2);
        insert_node(4,1);
        insert_node(5,2);
        insert_node(6,2);
        insert_node(7,1);
        insert_node(8,3);
        insert_node(9,2);
        insert_node(10,2);
        print_ll(head);
        System.out.println("op:"+solve(head));
    }
}
