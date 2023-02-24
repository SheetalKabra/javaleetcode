package Scaler;

import java.util.Stack;

public class Leetcode_Interview1 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
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
        //5, 2, 13, 3, 8
        Leetcode_Interview1 l = new Leetcode_Interview1();
        insert_node(1, 5);
        insert_node(2, 2);
        insert_node(3, 13);
        insert_node(4, 3);
        insert_node(5, 8);
        print_ll(l.removeNodes(head));
    }
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> s = new Stack<>();
        //as soon as i will get the greater element, i will remove all the smaller element from stack
        ListNode tmp = head;
        while(tmp != null){
            if(s.isEmpty()){
                //simply push
                s.push(tmp.val);
            }else{
                //is stack is not empty
                while(!s.isEmpty() && tmp.val > s.peek()){
                    s.pop();
                }
                s.push(tmp.val);
            }
            tmp = tmp.next;
        }
        System.out.println("s:"+s);
        //now, create a linked list from stack elements
        ListNode root = new ListNode(s.peek());
        s.pop();
        ListNode tmproot = root;
        while(!s.isEmpty()){
            tmproot.next = new ListNode(s.peek());
            tmproot = tmproot.next;
            s.pop();
        }
        //now, I will reverse the LL
        return reverseList(root);
    }

    public ListNode reverseList(ListNode A) {
        ListNode prev = A;
        ListNode temp = A;
        ListNode cur = A.next;

        while(cur != null) {
            ListNode nextN = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextN;
        }
        temp.next = null;
        return prev;


    }
}
