import java.util.ArrayList;

public class ScalerAd_Tree_BSTNodesInARange {
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
        ScalerAd_Tree_BSTNodesInARange s = new ScalerAd_Tree_BSTNodesInARange();
        //32 25 46 17 27 40 49 9 -1 -1 -1 -1 -1 -1 -1 -1 -1
        TreeNode root = new TreeNode(32);
        root.left = new TreeNode(25);
        root.right = new TreeNode(46);

        root.left.left = new TreeNode(17);
        root.left.right = new TreeNode(27);

        root.left.left.left = new TreeNode(9);

        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(49);
        System.out.println(s.solve(root, 11, 26));

        //8
//        TreeNode root = new TreeNode(8);
//        System.out.println(s.solve(root, 19, 22));

        //19 11 33 6 18 29 34 -1 -1 -1 -1 -1 -1 -1 -1
//        TreeNode root = new TreeNode(19);
//        root.left = new TreeNode(11);
//        root.right = new TreeNode(33);
//
//        root.left.left = new TreeNode(6);
//        root.left.right = new TreeNode(18);
//
//        root.right.left = new TreeNode(29);
//        root.right.right = new TreeNode(34);
//        System.out.println(s.solve(root, 22, 48));

        //5 2 6
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(6);
//        System.out.println(s.solve(root, 20, 32));
    }
    public int solve(TreeNode A, int B, int C) {
        ArrayList<Integer> inorderList = inorderTraversal(A);
        int l = -1;
        int r = -1;
        for(int i=0; i<inorderList.size(); i++){
            if(inorderList.get(i) >= B){
                l = i;
                break;
            }
        }
        if(l == -1){
            return 0;
        }
        for(int i=inorderList.size()-1; i >= 0; i--){
            if(inorderList.get(i) <= C){
                r = i;
                break;
            }
        }
        System.out.println(l);
        System.out.println(r);
        return r-l+1;
    }

    public ArrayList<Integer> inorderTraversal(TreeNode A){
        ArrayList<Integer> result = inorder(A, new ArrayList<>());
        return result;
    }


    public ArrayList<Integer> inorder(TreeNode A, ArrayList<Integer> result){
        if(A == null){
            return new ArrayList<>();
        }
        inorder(A.left, result);
        result.add(A.val);
        inorder(A.right, result);
        return result;
    }
}
