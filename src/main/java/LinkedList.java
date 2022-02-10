import java.util.List;

public class LinkedList{
    Node head;
    static class Node{
        Node next;
        int data;
        public Node(int d){
            data = d;
        }
    }

    public LinkedList insert(LinkedList list, int data){
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        }else{
            //traverse till last node
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public String update(LinkedList list, int data, int replaceWith){
        if(list.head == null){
            return "List is empty to update anything!!!";
        }else{
            Node currList = list.head;
            while(currList != null){
                if(currList.data == data){
                    currList.data = replaceWith;
                    return "List data is updated successfully!!!";
                }
                currList = currList.next;
            }
            return "Data is not present in list, so no need to update!!!";
        }
    }

    public String remove(LinkedList list, int data){
        if(list.head == null){
            return "List is empty to remove anything!!!";
        }else{
            Node currList = list.head;
            Node lastList = currList;
            while(currList != null){
                if(currList.data == data){
                    if(currList == list.head){
                        list.head = currList.next;
                    }
                    lastList.next = currList.next;
                    return "Data has been removed from list!!!";
                }else{
                    lastList = currList;
                }
                currList = currList.next;
            }
            return "Data is not present in list, so no need to remove!!!";
        }
    }

    public String print(LinkedList list){
        if(list.head == null){
            //System.out.println();
            return "Linked list is empty!!!";
        }else{
            Node currList = list.head;
            String listString = "";
            while(currList != null){
                //System.out.print(currList.data+" ");
                listString += currList.data+" ";
                currList = currList.next;
            }
            return listString;
        }

    }

//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list = insert(list, 1);
//        list = insert(list, 2);
//        list = insert(list, 3);
//        list = insert(list, 4);
//        list = insert(list, 5);
//        list = insert(list, 6);
//        list = insert(list, 7);
//        print(list);
//        remove(list, 2);
//        System.out.println("");
//        print(list);
//
//        update(list, 3, 2);
//        System.out.println("");
//        print(list);
//
//        update(list, 1, 11);
//        System.out.println("");
//        print(list);
//
//        update(list, 7, 77);
//        System.out.println("");
//        print(list);
//
//
////        remove(list, 5);
////        System.out.println("");
////        print(list);
////
////        remove(list, 4);
////        System.out.println("");
////        print(list);
////
////        remove(list, 1);
////        System.out.println("");
////        print(list);
//
////        remove(list, 7);
////        System.out.println("");
////        print(list);
////
////        remove(list, 6);
////        System.out.println("");
////        print(list);
////
////        remove(list, 3);
////        System.out.println("");
////        print(list);
////
////        remove(list, 3);
////        System.out.println("");
////        print(list);
//    }
}