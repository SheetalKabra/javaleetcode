package Scaler;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ScalerAd_Tree_SymmetricBinaryTree {
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
        ScalerAd_Tree_SymmetricBinaryTree s = new ScalerAd_Tree_SymmetricBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

//        Scaler.TreeNode root = new Scaler.TreeNode(1);
//        root.left = new Scaler.TreeNode(2);
//        root.right = new Scaler.TreeNode(2);
//
//        root.left.left = null;
//        root.left.right = new Scaler.TreeNode(3);
//
//        root.right.left = null;
//        root.right.right = new Scaler.TreeNode(3);

        System.out.println(s.isSymmetric(root));
    }
    public int isSymmetric(TreeNode A) {
        //using level order and deque
        Deque<TreeNode> d = new LinkedList<>();
        d.addLast(A);
        while(!d.isEmpty()){
            int N = d.size();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<N; i++){
                TreeNode node = d.peekFirst();
                d.pop();
                if(node != null){
                    arr.add(node.val);
                }else{
                    arr.add(-1);
                }
                if(node != null){
                    if(node.left != null){
                        d.addLast(node.left);
                    }else{
                        d.addLast(null);
                    }
                }
                if(node != null){
                    if(node.right != null){
                        d.addLast(node.right);
                    }else{
                        d.addLast(null);
                    }
                }

            }
            //now check arr is symmetric or not
            System.out.println("arr:"+arr);
            int s = 0;
            int e = arr.size()-1;
            while(s<arr.size() && e>=0 && arr.get(s).equals(arr.get(e))){
               s++;
               e--;
            }
            if(s < e){
                return 0;
            }
        }
        return 1;
    }
}
