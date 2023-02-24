package Scaler;

import java.util.*;
import java.util.LinkedList;

public class ScalerAd_Tree_TopViewOfBT {
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

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.left.left = new TreeNode(8);
        System.out.println(solve(root));
    }
    public static ArrayList<Integer> solve(TreeNode A) {
        Deque<TreeNode> nodeDeque = new LinkedList<>();
        Deque<Integer> levelDeque = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        nodeDeque.addLast(A);
        levelDeque.addLast(0);
        int minLevel = Integer.MAX_VALUE;
        int maxLevel = Integer.MIN_VALUE;
        while(!nodeDeque.isEmpty()){
            TreeNode node = nodeDeque.peekFirst();
            int level = levelDeque.peekFirst();
            minLevel = Math.min(level, minLevel);
            maxLevel = Math.max(level, maxLevel);
            nodeDeque.pop();
            levelDeque.pop();
            if(!hm.containsKey(level)){
                hm.put(level, node.val);
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
        int i = 0;
        while(i >= minLevel){
            result.add(hm.get(i));
            i--;
        }
        i = 1;
        while(i <= maxLevel){
            result.add(hm.get(i));
            i++;
        }
        return result;
    }
}
