public class ScalerAd_Tree_PathSum {
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
        System.out.println(25 - 55 + (85 + 65));
        ScalerAd_Tree_PathSum s = new ScalerAd_Tree_PathSum();
        TreeNode root = new TreeNode(1000);
        root.left = new TreeNode(200);
        System.out.println(s.hasPathSum(root, 1000));
    }
    public int hasPathSum(TreeNode A, int B) {
        //System.out.println(", B:"+B);
        if(A == null){
            //System.out.println("A.val:"+A.val+", B:"+B);
            return (B==0) ? 1 : 0;
        }
        System.out.println("left:"+hasPathSum(A.left, B - A.val));
        if(hasPathSum(A.left, B - A.val) == 1){
            return 1;
        }
        System.out.println("right:"+hasPathSum(A.right, B-A.val));
        if(hasPathSum(A.right, B-A.val) == 1){
            return 1;
        }
        return 0;
    }
}
