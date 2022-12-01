import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ScalerAd_Tree_SerializeBinaryTree {
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
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.println(solve(root));
    }

    public static ArrayList<Integer> solve(TreeNode A) {
        Deque<TreeNode> d = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        d.addLast(A);
        ans.add(A.val);
        while(!d.isEmpty()){
            TreeNode node = d.peekFirst();
            d.pop();
            if(node.left != null){
                d.addLast(node.left);
                ans.add(node.left.val);
            }else{
                ans.add(-1);
            }

            if(node.right != null){
                d.addLast(node.right);
                ans.add(node.right.val);
            }else{
                ans.add(-1);
            }

        }
        return ans;
    }
}
