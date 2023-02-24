package Scaler;

public class ScalerAd_Tree_BalancedBinaryTree {
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


    public int isBalanced(TreeNode A) {
        if(isHeightBalanced(A) > 0){
            return 1;
        }else{
            return 0;
        }
    }

    public int isHeightBalanced(TreeNode A){
        if(A == null){
            return 0;
        }
        int leftHeight = isHeightBalanced(A.left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = isHeightBalanced(A.right);
        if(rightHeight == -1){
            return -1;
        }
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        return Math.max(leftHeight, rightHeight) +1;
    }

}
