package Scaler;

public class IdenticalBinaryTrees {
    static class TreeNode{
        int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) {
           val = x;
           left=null;
           right=null;
        }
    }

    public int isSameTree(TreeNode A, TreeNode B) {
        if(A == null && B == null){
            return 1;
        }
        if(A != null && B != null){
            if(A.val == B.val){
                if(isSameTree(A.left, B.left)==1 && isSameTree(A.right, B.right) == 1){
                    return 1;
                }
            }
        }
        return 0;
    }
    public class Solution {
        public int solve(TreeNode A) {
            int max=A.val;
            return nodeCount(A,max)+1;
        }
        int nodeCount(TreeNode root,int max){
            if(root==null) return 0;
            if(root.val>max){
                return 1+nodeCount(root.left,root.val)+nodeCount(root.right,root.val);
            }else{
                return nodeCount(root.left,max)+nodeCount(root.right,max);
            }
        }
    }
    public class Solution1 {
        public int solve(TreeNode A) {
            int max=A.val;
            return nodeCount(A,max)+1;
        }
        int nodeCount(TreeNode root,int max){
            if(root==null) return 0;
            if(root.val>max){
                max=Math.max(max,root.val);
                int leftCount=nodeCount(root.left,max);
                int rightCount=nodeCount(root.right,max);
                return leftCount+rightCount+1;
            } else{
                max=Math.max(max,root.val);
                int leftCount=nodeCount(root.left,max);
                int rightCount=nodeCount(root.right,max);
                return leftCount+rightCount;
            }
        }
    }
//
//    public int isSameTree(Scaler.TreeNode A, Scaler.TreeNode B) {
//        ArrayList<Integer> arrA = new ArrayList<>();
//        ArrayList<Integer> arrB = new ArrayList<>();
//        arrA = traverseq(A, arrA);
//        arrB = traverseq(B, arrB);
//        System.out.println(arrA);
//        System.out.println(arrB);
//        if(arrA.size() == arrB.size()){
//            for(int i=0; i<arrA.size(); i++){
//                if(arrA.get(i) != arrB.get(i)){
//                    return 0;
//                }
//            }
//        }else{
//            return 0;
//        }
//        return 1;
//    }
//
//    public ArrayList<Integer> traverseq(Scaler.TreeNode node, ArrayList<Integer> arr){
//        if(node == null){
//            return arr;
//        }
//        traverseq(node.left, arr);
//        traverseq(node.right, arr);
//        arr.add(node.val);
//        return arr;
//    }

    public static void main(String[] args) {
        IdenticalBinaryTrees i = new IdenticalBinaryTrees();
        IdenticalBinaryTrees.TreeNode A = null;
        IdenticalBinaryTrees.TreeNode root = new IdenticalBinaryTrees.TreeNode(1);
        root.left = new IdenticalBinaryTrees.TreeNode(6);
        root.right = new IdenticalBinaryTrees.TreeNode(2);
        root.left.left = new IdenticalBinaryTrees.TreeNode(9);


        IdenticalBinaryTrees.TreeNode rootB = new IdenticalBinaryTrees.TreeNode(1);
        rootB.left = new IdenticalBinaryTrees.TreeNode(6);
        rootB.right = new IdenticalBinaryTrees.TreeNode(1);
        rootB.left.left = new IdenticalBinaryTrees.TreeNode(9);

        System.out.println(i.isSameTree(root, rootB));
    }
}
