package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ScalerAd_Tree_DeserializeBinaryTree {
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

        printTree(solve(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1))));
        //System.out.println(solve(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1))));
    }

    public static TreeNode solve(ArrayList<Integer> A) {
        TreeNode root = null;
        Deque<Integer> d = new LinkedList<>();
        d.addLast(A.get(0));
        int i = 1;
        int N = A.size();
        while(i<N){
            root = new TreeNode(d.peekFirst());
            TreeNode node = root;
            TreeNode nodeleft = null;
            TreeNode noderight = null;
            if(A.get(i) == -1){
                node.left = null;
            }else{
                node.left = new TreeNode(A.get(i));
                d.addLast(A.get(i));
            }
            i++;
            if(A.get(i) == -1){
                node.right = null;
            }else{
                node.right = new TreeNode(A.get(i));
                d.addLast(A.get(i));
            }
            i++;
            d.pop();
        }
        return root;
    }

    public static void printTree(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.print(root.val+", ");
        }
        printTree(root.left);
        printTree(root.right);
    }
}
