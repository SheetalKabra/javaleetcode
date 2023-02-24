import Scaler.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void linkedList_Empty(){
        LinkedList list = new LinkedList();
        String printList = list.print(list);
        assertEquals("Linked list is empty!!!", printList);
    }
    @Test
    void linkedListInsert_MultipleData() {
        LinkedList list = new LinkedList();
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);
        String printList = list.print(list);
        assertEquals("1 2 3 4 5 ", printList);
    }
    @Test
    void linkedListInsert_SingleData() {
        LinkedList list = new LinkedList();
        list = list.insert(list, 1);
        String printList = list.print(list);
        assertEquals("1 ", printList);
    }
    @Test
    void linkedListUpdate_Empty(){
        LinkedList list = new LinkedList();
        String updateList = list.update(list, 12, 18);
        assertEquals("List is empty to update anything!!!", updateList);
    }
    @Test
    void linkedListUpdate_DataNotExists(){
        LinkedList list = new LinkedList();
        list = list.insert(list,11);
        list = list.insert(list,12);
        list = list.insert(list,13);
        list = list.insert(list,14);
        String updateList = list.update(list, 15, 18);
        assertEquals("Data is not present in list, so no need to update!!!", updateList);
    }
    @Test
    void linkedListUpdate(){
        LinkedList list = new LinkedList();
        list = list.insert(list,11);
        list = list.insert(list,12);
        list = list.insert(list,13);
        list = list.insert(list,14);
        list = list.insert(list,15);
        list = list.insert(list,16);
        String updateList = list.update(list, 12, 18);
        assertEquals("List data is updated successfully!!!", updateList);
        String printList = list.print(list);
        assertEquals("11 18 13 14 15 16 ", printList);
    }
    @Test
    void linkedListRemove_Empty(){
        LinkedList list = new LinkedList();
        String removeList = list.remove(list, 12);
        assertEquals("List is empty to remove anything!!!", removeList);
    }
    @Test
    void linkedListRemove_DataNotExists(){
        LinkedList list = new LinkedList();
        list = list.insert(list, 22);
        list = list.insert(list, 24);
        list = list.insert(list, 26);
        list = list.insert(list, 28);
        String removeList = list.remove(list, 12);
        assertEquals("Data is not present in list, so no need to remove!!!", removeList);
    }
    @Test
    void linkedListRemove_headPosition(){
        LinkedList list = new LinkedList();
        list = list.insert(list, 22);
        list = list.insert(list, 24);
        list = list.insert(list, 26);
        list = list.insert(list, 28);
        String removeList = list.remove(list, 22);
        assertEquals("Data has been removed from list!!!", removeList);
        String printList = list.print(list);
        assertEquals("24 26 28 ", printList);
    }
    @Test
    void linkedListRemove_lastPosition(){
        LinkedList list = new LinkedList();
        list = list.insert(list, 22);
        list = list.insert(list, 24);
        list = list.insert(list, 26);
        list = list.insert(list, 28);
        String removeList = list.remove(list, 28);
        assertEquals("Data has been removed from list!!!", removeList);
        String printList = list.print(list);
        assertEquals("22 24 26 ", printList);
    }
    @Test
    void linkedListRemove_AnyPosition(){
        LinkedList list = new LinkedList();
        list = list.insert(list, 22);
        list = list.insert(list, 24);
        list = list.insert(list, 26);
        list = list.insert(list, 28);
        String removeList = list.remove(list, 26);
        assertEquals("Data has been removed from list!!!", removeList);
        String printList = list.print(list);
        assertEquals("22 24 28 ", printList);
    }
}