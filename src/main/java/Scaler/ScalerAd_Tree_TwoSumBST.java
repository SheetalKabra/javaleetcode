package Scaler;

import java.util.ArrayList;

public class ScalerAd_Tree_TwoSumBST {

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
        ScalerAd_Tree_TwoSumBST s = new ScalerAd_Tree_TwoSumBST();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(9);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(20);
        System.out.println(s.t2Sum(root, 9));
    }

    public int t2Sum(TreeNode A, int B) {
        ArrayList<Integer> inorderList = inorderTraversal(A);
        int l = 0;
        int r = inorderList.size()-1;

        while(l<r){
            int sum = inorderList.get(l)+inorderList.get(r);
            if(sum == B){
                return 1;
            }else if(sum > B){
                r--;
            }else if(sum < B){
                l++;
            }
        }
        return 0;

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
