package Scaler;

class NodeBst{
    int data;
    NodeBst left;
    NodeBst right;
}

class BST{
 public NodeBst insert(NodeBst node, int data){
    if(node == null){
        return createNewNode(data);
    }
    if(node.data > data){
        //insert into left
        node.left = insert(node, data);
    }else{
        //insert into right
        node.right = insert(node, data);
    }
    return node;
 }

 public NodeBst createNewNode(int data){
     NodeBst n = new NodeBst();
     n.data = data;
     n.left = null;
     n.right = null;
     return n;
 }

}

public class BinarySearchTree {
    public static void main(String[] args) {
        BST bst = new BST();
        NodeBst root = null;
        //8, 3, 6, 10, 4, 7, 1, 14, 13
        root = bst.insert(root, 8);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 10);
        root = bst.insert(root, 4);
        root = bst.insert(root, 7);
        root = bst.insert(root, 1);
        root = bst.insert(root, 14);
        root = bst.insert(root, 13);
    }
}