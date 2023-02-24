package Scaler;

public class ScalerAd_Tree_DiameterOfBinaryTree {
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
        //7 1 15 2 -1 -1 -1 -1
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(15);
        root.right = new TreeNode(2);
        ScalerAd_Tree_DiameterOfBinaryTree s = new ScalerAd_Tree_DiameterOfBinaryTree();
        System.out.println(s.solve(root));
    }

    public int diameter = 0;

    public int solve(TreeNode A) {
        height(A);
        return diameter;
    }

    public int height(TreeNode A) {
        if (A == null) {
            return 0;
        }
        int hl = height(A.left);
        int hr = height(A.right);
        diameter = Math.max(diameter, (hl + hr + 2));
        return Math.max(hl, hr) + 1;
    }
}