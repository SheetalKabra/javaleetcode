import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ScalerAd_Tree_LeftViewOfBT {
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
           val = x;
           left=null;
           right=null;
      }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(15);
        root.right = new TreeNode(2);
        System.out.println(solve(root));
    }
    public static ArrayList<Integer> solve(TreeNode A) {
        Deque<TreeNode> d = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        d.addLast(A);
        while(!d.isEmpty()){
            int N = d.size();
            System.out.println("size:"+N);
            for(int i=0; i<N; i++){
                TreeNode node = d.peekFirst();
                d.pop();
                if(i==0){
                    result.add(node.val);
                }
                if(node.left != null){
                    System.out.println("val left:"+node.left.val);
                    d.addLast(node.left);
                }
                if(node.right != null){
                    System.out.println("val right:"+node.right.val);
                    d.addLast(node.right);
                }
                System.out.println("d inside while loop:"+d);
            }
        }

        return  result;
    }
}
