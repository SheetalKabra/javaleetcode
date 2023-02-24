package Scaler;

public class ScalerAd_Tree_ValidBST {
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
        ScalerAd_Tree_ValidBST s = new ScalerAd_Tree_ValidBST();
        //3,2,4,1,3
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(s.isValidBST(root));
    }
    public int isValidBST(TreeNode A) {
        if(A.left == null && A.right == null){
            return 1;
        }
        if(checkValidBST(A, Integer.MIN_VALUE, Integer.MAX_VALUE)){
            return 1;
        }else{
            return 0;
        }
    }

    public boolean checkValidBST(TreeNode A, int l, int r){
        if(A == null){
            return true;
        }
        if(A.val < l || r < A.val){
            return false;
        }
        boolean isleft = checkValidBST(A.left, l, A.val);
        boolean isright = checkValidBST(A.right, A.val+1, r);
        return isleft && isright;
    }
}
