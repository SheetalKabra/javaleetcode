import java.util.*;
import java.util.LinkedList;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
public class ScalerAd_Tree_LevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(9);
        root.right = new TreeNode(8);
        TreeNode templeft = root;
        TreeNode tempright = root;
        templeft = root.left;
        templeft.left = new TreeNode(10);
        tempright = root.right;
        tempright.left = new TreeNode(19);
        tempright.right = new TreeNode(4);
        System.out.println(levelOrder(root));
    }


    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        Deque<TreeNode> d = new LinkedList<>();
        ArrayList<ArrayList<Integer>> finalans = new ArrayList<>();
        d.add(A);
        while(!d.isEmpty()){
            int N = d.size();
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0; i<N; i++){
                TreeNode curr = d.peekFirst();
                ans.add(curr.val);
                d.pop();
                if(curr.left != null){
                    d.addLast(curr.left);
                }
                if(curr.right != null){
                    d.addLast(curr.right);
                }
            }
            finalans.add(ans);
        }

        return finalans;
    }
}
