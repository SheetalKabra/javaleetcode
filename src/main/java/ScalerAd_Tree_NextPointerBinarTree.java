import java.util.Deque;
import java.util.LinkedList;

public class ScalerAd_Tree_NextPointerBinarTree {
    static class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }
    public void connect(TreeLinkNode root) {
        Deque<TreeLinkNode> d = new LinkedList<>();
        d.addLast(root);
        while(!d.isEmpty()){
            int N = d.size();
            TreeLinkNode lastnode = null;
            for(int i=0; i<N; i++){
                TreeLinkNode node = d.peekFirst();
                if(lastnode != null){
                    lastnode.next = node;
                }
                d.pop();
                if(node.left != null){
                    d.addLast(node.left);
                }
                if(node.right != null){
                    d.addLast(node.right);
                }
                lastnode = node;
            }
            lastnode.next = null;
        }
    }
}
