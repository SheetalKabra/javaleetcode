import java.util.*;
import java.util.LinkedList;

public class ScalerAd_Tree_VerticalOrderTraversal {
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
//        TreeNode root = new TreeNode(6);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(7);
//        root.left.left = new TreeNode(2);
//        root.left.right = new TreeNode(5);
//        root.right.right = new TreeNode(9);

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(7);
//        root.left.left = new TreeNode(2);
//        root.right.right = new TreeNode(9);

        TreeNode root = new TreeNode(3709);
        root.left = new TreeNode(4465);
        root.right = new TreeNode(2668);

        //43 460 3871 4698 8399 504 4421 7515 -1 4167 5727 -1 -1 3096 434 7389 2667 5661 1969 7815 4292 3006 9750 6693 -1 6906 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
        ScalerAd_Tree_VerticalOrderTraversal s = new ScalerAd_Tree_VerticalOrderTraversal();
        System.out.println(s.verticalOrderTraversal(root));
    }
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int minLevel = Integer.MAX_VALUE;
        Deque<TreeNode> nodeDeque = new LinkedList<>();
        Deque<Integer> levelDeque = new LinkedList<>();

        nodeDeque.addLast(A);
        levelDeque.addLast(0);
        while(!nodeDeque.isEmpty()){
            TreeNode node = nodeDeque.peekFirst();
            int level = levelDeque.peekFirst();
            minLevel = Math.min(level, minLevel);
            nodeDeque.pop();
            levelDeque.pop();
            if(hm.containsKey(level)){
                ArrayList<Integer> ans = hm.get(level);
                ans.add(node.val);
                hm.put(level, ans);
            }else{
                hm.put(level, new ArrayList<>(Arrays.asList(node.val)));
            }
            if(node.left != null){
                nodeDeque.addLast(node.left);
                levelDeque.addLast(level-1);
            }
            if(node.right != null){
                nodeDeque.addLast(node.right);
                levelDeque.addLast(level+1);
            }
        }

        int N = hm.size();
        int i = minLevel;

        while(N > 0){
            result.add(hm.get(i));
            i++;
            N--;
        }
        return result;
    }

//    public Map<Integer, ArrayList<Integer>> hm = new HashMap<>();
//    public int minLevel = Integer.MAX_VALUE;
//    public static void main(String[] args) {
////        TreeNode root = new TreeNode(6);
////        root.left = new TreeNode(3);
////        root.right = new TreeNode(7);
////        root.left.left = new TreeNode(2);
////        root.left.right = new TreeNode(5);
////        root.right.right = new TreeNode(9);
//
////        TreeNode root = new TreeNode(1);
////        root.left = new TreeNode(3);
////        root.right = new TreeNode(7);
////        root.left.left = new TreeNode(2);
////        root.right.right = new TreeNode(9);
//
//        TreeNode root = new TreeNode(3709);
//        root.left = new TreeNode(4465);
//        root.right = new TreeNode(2668);
//
//        //43 460 3871 4698 8399 504 4421 7515 -1 4167 5727 -1 -1 3096 434 7389 2667 5661 1969 7815 4292 3006 9750 6693 -1 6906 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
//        ScalerAd_Tree_VerticalOrderTraversal s = new ScalerAd_Tree_VerticalOrderTraversal();
//        System.out.println(s.verticalOrderTraversal(root));
//    }
//    public  ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        preorder(A, 0);
//        int i = minLevel;
//        int N = hm.size();
//        while(N > 0){
//            ArrayList<Integer> ans = hm.get(i);
//            result.add(ans);
//            i++;
//            N--;
//        }
//        return  result;
//    }
//
//    public void preorder(TreeNode root, int level){
//        if(root == null){
//            return;
//        }
//        if(hm.containsKey(level)){
//            ArrayList<Integer> arr = hm.get(level);
//            arr.add(root.val);
//            hm.put(level, arr);
//        }else{
//            hm.put(level, new ArrayList<>(Arrays.asList(root.val)));
//        }
//        minLevel = Math.min(minLevel, level);
//        preorder(root.left, level-1);
//        preorder(root.right, level+1);
//    }
}
