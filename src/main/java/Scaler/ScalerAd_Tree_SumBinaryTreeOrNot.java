package Scaler;

public class ScalerAd_Tree_SumBinaryTreeOrNot {
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


    public int ans = 1;

    public static void main(String[] args) {
        ScalerAd_Tree_SumBinaryTreeOrNot s = new ScalerAd_Tree_SumBinaryTreeOrNot();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(2);

        System.out.println(s.solve(root));
    }

    public int solve(TreeNode A) {
        sum(A);
        return ans;
    }

    public int sum(TreeNode A){
        if(ans == 0){
            return 0;
        }
        if(A == null){
            return 0;
        }
        int l = sum(A.left);
        int r = sum(A.right);
//        System.out.println("l:"+l);
//        System.out.println("r:"+r);
//        System.out.println("A:"+A.val);
        if(l == 0 && r == 0){
            return A.val;
        }
        if(l+r == A.val){
            return l+r+A.val;
        }else{
            ans = 0;
            return 0;
        }
    }
}
