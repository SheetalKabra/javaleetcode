public class ScalerAd_Tree_DistBwNodesOfBST {
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
        ScalerAd_Tree_DistBwNodesOfBST a = new ScalerAd_Tree_DistBwNodesOfBST();
        TreeNode root = new TreeNode(19);
        root.left = new TreeNode(7);
        root.right = new TreeNode(26);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(15);

        root.left.left.left = new TreeNode(2);

        root.right.left = new TreeNode(24);
        root.right.right = new TreeNode(36);
        System.out.println(a.solve(root, 15, 19));

    }
    public int solve(TreeNode A, int B, int C) {
        TreeNode lca = findLCA(A, B, C);
        System.out.println("lca:"+lca.val);
        int pathB = countPath(lca, B);
        System.out.println("pathB: "+pathB);
        int pathC = countPath(lca, C);
        System.out.println("pathC: "+pathC);
        return pathB + pathC;
    }

    public TreeNode findLCA(TreeNode A, int B, int C){
//        System.out.println("start:"+A.val);
        if((B <= A.val && C >= A.val) || (B >= A.val && C <= A.val)){
//            System.out.println("found:"+", "+B+", "+C+", =>"+A.val);
            return A;
        }
        if(B > A.val && C > A.val){
//            System.out.println("right:"+", "+B+", "+C+", =>"+A.val);
            return findLCA(A.right, B, C);
        }else if(B < A.val && C < A.val){
//            System.out.println("left:"+", "+B+", "+C+", =>"+A.val);
//            System.out.println("left:"+A.left.val);
            return findLCA(A.left, B, C);
        }
        return null;
    }

    public int countPath(TreeNode A, int elem){
        int count = 0;
        while(A.val != elem){
            if(A.val > elem){
                A = A.left;
            }else{
                A = A.right;
            }
            count++;
        }
        return count;
    }
}
