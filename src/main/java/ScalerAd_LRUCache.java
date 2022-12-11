import java.util.HashMap;
import java.util.Map;

class NodeLRU{
    int key;
    int val;
    NodeLRU prev;
    NodeLRU next;
    NodeLRU(int key, int val){
        this.key = key;
        this.val = val;
        prev = null;
        next = null;
    }
}
public class ScalerAd_LRUCache {

    public NodeLRU head;
    public NodeLRU tail;
    public Map<Integer, NodeLRU> hm = new HashMap<>();
    public int cacheCapacity;

    public ScalerAd_LRUCache(int capacity) {
        cacheCapacity = capacity;
    }

    public static void main(String[] args) {
//        ScalerAd_LRUCache s = new ScalerAd_LRUCache(1); // 1 -1 2
//        s.set(2,1);
//        System.out.println(s.get(2));
//        s.set(3,2);
//        System.out.println(s.get(2));
//        System.out.println(s.get(3));

        //7 2
        // G 2
        // S 2 6
        // G 1
        // S 1 5
        // S 1 2
        // G 1
        // G 2
        ScalerAd_LRUCache s = new ScalerAd_LRUCache(2); //
        System.out.println(s.get(2));
        s.set(2,6);
        System.out.println(s.get(1));
        s.set(1,5);
        s.set(1,2);
        System.out.println(s.get(1));
        System.out.println(s.get(2));
    }

    public int get(int key){
        if(hm.containsKey(key)){
            int value = hm.get(key).val;
            update(key, value);
            return value;
        }
        return -1;
    }

    public void set(int key, int value){
        int size = hm.size();
        if(hm.containsKey(key)){
            update(key, value);
        }else{
            if(size < cacheCapacity){
                insert(key, value);
            }else{
                removeAtFirst();
                insert(key, value);
            }
        }
    }

    public void update(int key, int value){
        NodeLRU temp = hm.get(key);
        remove(key);
        temp = insert(key, value);
        hm.put(key, temp);
    }

    public NodeLRU insert(int key, int value){
        NodeLRU newnode = new NodeLRU(key, value);
        if(head == null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        hm.put(key, newnode);
        return newnode;
    }

    public void remove(int key){
        NodeLRU temp = hm.get(key);
        if(head == temp){
            head = head.next;
        }
        if(tail == temp){
            tail = tail.prev;
        }
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
        if(temp.prev != null){
            temp.prev.next = temp.next;
        }
        hm.remove(key);
    }

    public void removeAtFirst(){
        if(head != null){
            NodeLRU temp = head;
            head = head.next;
            if(head != null){
                head.prev = null;
            }
            temp.next = null;
            if(head == null){
                tail = head;
            }
            hm.remove(temp.key);
        }
    }

}
