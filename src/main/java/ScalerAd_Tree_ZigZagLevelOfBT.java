import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class ScalerAd_Tree_ZigZagLevelOfBT {
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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        System.out.println(zigzagLevelOrder(root));
    }
    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        Deque<TreeNode> d = new LinkedList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        d.addLast(A);
        int level = 1;
        while(!d.isEmpty()){
            int N = d.size();
            ArrayList<Integer> levelnode = new ArrayList<>();
            for(int i=0; i<N; i++){
                TreeNode node = d.peekFirst();
                levelnode.add(node.val);
                d.pop();
                if(node.left != null){
                    d.addLast(node.left);
                }
                if(node.right != null){
                    d.addLast(node.right);
                }
            }
            if(level % 2 == 0){
                Collections.reverse(levelnode);
            }
            result.add(levelnode);
            level++;

        }

        return result;
    }
}
