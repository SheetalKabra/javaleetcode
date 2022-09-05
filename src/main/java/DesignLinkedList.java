import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Definition for singly-linked list.

public class DesignLinkedList {

    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
    //static ListNode head = null;
    //static ListNode list = null;
    static int length = 0;
    public ListNode solve(ArrayList<ArrayList<Integer>> A) {
        ListNode head = null;
        int row = A.size();
        for(int i=0; i<row; i++){
            //Add a node of value x before the first element of the linked list
            if(A.get(i).get(0) == 0 && A.get(i).get(2) == -1){
               head = insert_node_at_first(head, A.get(i).get(1));
            }
            //Append a node of value x to the last element of the linked list.
            if(A.get(i).get(0) == 1 && A.get(i).get(2) == -1){
                head = insert_node_at_last(head, A.get(i).get(1));
            }
            //Add a node of value x before the indexth node in the linked list.
            if(A.get(i).get(0) == 2){
                head = insert_node_at_index(head,A.get(i).get(2), A.get(i).get(1));
            }
            //Delete the indexth node in the linked list, if the index is valid.
            if(A.get(i).get(0) == 3 && A.get(i).get(2) == -1){
                head = delete_node(head, A.get(i).get(1));
            }
        }
        return head;
    }

    public ListNode delete_node(ListNode head, int index){
        if(index <= length){
            if(index == 0){
                head = head.next;
            }else{
                ListNode temp = head;
                for(int i=0; i<index-1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            length--;
            return head;
        }
        return head;

    }
    public ListNode insert_node_at_first(ListNode head, int value){
        ListNode new_node = new ListNode(value);
        if(head == null){
            head = new_node;
        }else{
            new_node.next = head;
            head = new_node;
        }
        length++;
        return head;
    }
    public ListNode insert_node_at_last(ListNode head, int value){
        ListNode new_node = new ListNode(value);
        if(head == null){
            head = new_node;
        }else{
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            //new_node.next = temp.next;
            temp.next = new_node;
        }
        length++;
        return head;
    }
    public ListNode insert_node_at_index(ListNode head, int index, int value){
        ListNode new_node = new ListNode(value);
//        if(index == length){
//            return insert_node_at_last(head, value);
//        }

        if(head == null){
            if(index == length){
                head = new_node;
            }

        }else if(index <= length){
            if(index == 0){
                new_node.next = head;
                head = new_node;
            }else if(index == length){
                ListNode temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new_node;
            }else{
                //System.out.println("else");
                ListNode temp = head;
                //System.out.println("index"+index);
                for(int i=0; i<index-2; i++){
                    temp = temp.next;
                }
                //System.out.println(temp.val+", "+temp.next.val);
                new_node.next = temp.next;
                temp.next = new_node;
            }
        }
        length++;
        return head;
    }

    public void printll(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DesignLinkedList d = new DesignLinkedList();
//        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
//        ArrayList<Integer> col = new ArrayList<>();
//        col.add(0);
//        col.add(1);
//        col.add(-1);
//        a.add(col);
//        ArrayList<Integer> col1 = new ArrayList<>();
//        col1.add(1);
//        col1.add(2);
//        col1.add(-1);
//        a.add(col1);
//        ArrayList<Integer> col2 = new ArrayList<>();
//        col2.add(2);
//        col2.add(3);
//        col2.add(-1);
//        a.add(col2);


        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>(Arrays.asList(1,13,-1)));
        a.add(new ArrayList<>(Arrays.asList(3,0,-1)));
        a.add(new ArrayList<>(Arrays.asList(3,1,-1)));
        a.add(new ArrayList<>(Arrays.asList(2,15,0)));
        a.add(new ArrayList<>(Arrays.asList(3,0,-1)));
        a.add(new ArrayList<>(Arrays.asList(1,12,-1)));
        a.add(new ArrayList<>(Arrays.asList(3,0,-1)));
        a.add(new ArrayList<>(Arrays.asList(1,19,-1)));
        a.add(new ArrayList<>(Arrays.asList(1,13,-1)));
        a.add(new ArrayList<>(Arrays.asList(3, 0, -1)));
        a.add(new ArrayList<>(Arrays.asList(0, 12, -1)));
        a.add(new ArrayList<>(Arrays.asList(1, 13, -1)));
        a.add(new ArrayList<>(Arrays.asList(3, 2, -1)));


//        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
//        b.add(new ArrayList<>(Arrays.asList(2,18,0)));
//        b.add(new ArrayList<>(Arrays.asList(2, 5, 1)));
//        b.add(new ArrayList<>(Arrays.asList(2,8,0)));
//        b.add(new ArrayList<>(Arrays.asList(1, 7, -1)));
//        b.add(new ArrayList<>(Arrays.asList(1, 5, -1)));

//        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
//        b.add(new ArrayList<>(Arrays.asList(3, 1, -1)));
//        b.add(new ArrayList<>(Arrays.asList(3, 1, -1)));
//        b.add(new ArrayList<>(Arrays.asList(1, 18, -1)));
//        b.add(new ArrayList<>(Arrays.asList(2, 12, 1)));
//        b.add(new ArrayList<>(Arrays.asList(1, 17, -1)));
//        b.add(new ArrayList<>(Arrays.asList(2, 11, 3)));
//        b.add(new ArrayList<>(Arrays.asList(1, 19, -1)));
//        b.add(new ArrayList<>(Arrays.asList(3, 0, -1)));
//        b.add(new ArrayList<>(Arrays.asList(0, 12, -1)));

        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        b.add(new ArrayList<>(Arrays.asList(2, 6, 0)));
        b.add(new ArrayList<>(Arrays.asList(1, 17, -1)));
        b.add(new ArrayList<>(Arrays.asList(1, 19, -1)));
        b.add(new ArrayList<>(Arrays.asList(2, 16, 1)));

        b.add(new ArrayList<>(Arrays.asList(1, 13, -1)));

        b.add(new ArrayList<>(Arrays.asList(3, 3, -1)));

        b.add(new ArrayList<>(Arrays.asList(1, 19, -1)));
        System.out.println(b);
        ListNode head = d.solve(b);
        d.printll(head);



    }
}
