package Scaler;

import java.util.ArrayList;


public class InorderTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> arr = new ArrayList<>();
        return traverse(A, arr);
    }

    public ArrayList<Integer> traverse(TreeNode A, ArrayList<Integer> arr) {
        if(A == null){
            return arr;
        }
        arr.add(A.val);
        traverse(A.left, arr);
        traverse(A.right, arr);
        return arr;
    }

    public static void main(String[] args) {
        InorderTraversal i = new InorderTraversal();
        TreeNode A = null;
        TreeNode root = new TreeNode(1);
//        Scaler.TreeNode left = new Scaler.TreeNode(6);
//        Scaler.TreeNode right = new Scaler.TreeNode(2);
        root.left = new TreeNode(6);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(9);

        System.out.println(i.inorderTraversal(root));
    }
}
