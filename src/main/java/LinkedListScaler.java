public class LinkedListScaler {
    static class Node{
        int value;
        Node pointer;
        public Node(int value){
            this.value = value;
            this.pointer = null;
        }
    }
    static int length = 0;
    static Node head = null;
    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        Node new_node = new Node(value);
        if(position == 1){
            if(head == null){
                head = new_node;
            }else{
                new_node.pointer = head;
                head = new_node;
            }
            length++;
        } else if(position <= length+1){
            Node temp = head;
            for(int i=0; i<position-2; i++){
                temp = temp.pointer;
            }
            new_node.pointer = temp.pointer;
            temp.pointer = new_node;
            length++;
        }
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(position == 1){
            head = head.pointer;
            length--;
        }else if(position<=length){
            Node temp = head;
            for(int i=0; i<position-2; i++){
                temp = temp.pointer;
            }
            temp.pointer = temp.pointer.pointer;
            length--;
        }
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node temp = head;
        while(temp.pointer != null){
            System.out.print(temp.value+" ");
            temp=temp.pointer;
        }
        System.out.print(temp.value);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        insert_node(1, 126);
        insert_node(2, 875);
        insert_node(3, 604);
        insert_node(4, 550);
        insert_node(5, 498);
        insert_node(6, 875);
        insert_node(7, 847);
        insert_node(8, 633);
        insert_node(9, 793);
        insert_node(10, 872);
        insert_node(11, 313);
        insert_node(12, 440);
        insert_node(13, 331);
        insert_node(14, 582);
        insert_node(15, 188);
        insert_node(16, 476);
        insert_node( 17, 722);
        insert_node( 18, 402);
        insert_node( 19, 890);
        insert_node( 20, 713);
        insert_node( 21, 421);
        insert_node( 22, 930);
        insert_node( 23, 579);
        insert_node( 24, 459);
        insert_node( 25, 278);
        insert_node( 26, 818);
        insert_node(  27, 320);
        insert_node(  28, 549);
        insert_node(  29, 240);
        insert_node(  30, 528);
        insert_node(  31, 367);
        insert_node(  32, 835);
        insert_node(  33, 20);
        insert_node(  34, 170);
        insert_node(  35, 903);
        insert_node(  36, 242);
        insert_node(  37, 943);
        insert_node(  38, 802);
        insert_node(  39, 145);
        insert_node(  40, 291);
        insert_node(  41, 224);
        insert_node(  42, 400);
        insert_node( 43, 43);
        insert_node( 44, 355);
        insert_node( 45, 83);
        insert_node( 46, 26);
        insert_node( 47, 816);
        insert_node( 48, 477);
        insert_node( 49, 425);
        insert_node( 50, 543);
        insert_node( 51, 211);
        insert_node( 52, 799);
        insert_node( 53, 185);
        insert_node( 54, 5);
        insert_node( 55, 184);
        insert_node( 56, 150);
        insert_node( 57, 572);
        insert_node( 58, 626);
        insert_node( 59, 109);
        insert_node( 60, 807);
        delete_node(25);
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        delete_node(53);
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        delete_node(12);
        delete_node(54);
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        delete_node(39);
        delete_node(42);
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        delete_node(47);
        delete_node(45);
        delete_node(35);
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        delete_node(13);
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        delete_node(18);
        delete_node(59);
        delete_node(47);
        delete_node(43);
        delete_node(38);
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        delete_node(8);
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        delete_node(8);
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        delete_node(39);
        delete_node(60);
        delete_node(16);
        System.out.println("=============");
        print_ll();
        System.out.println("=============");
        print_ll();
        System.out.println("=============");

    }

}
