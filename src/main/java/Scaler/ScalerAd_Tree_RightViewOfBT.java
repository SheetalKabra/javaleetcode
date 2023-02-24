package Scaler;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ScalerAd_Tree_RightViewOfBT {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }
    }
    public ArrayList<Integer> solve(TreeNode A) {
        Deque<TreeNode> d = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        d.addLast(A);
        while(!d.isEmpty()){
            int N = d.size();
            for(int i=0; i<N; i++){
                TreeNode node = d.peekFirst();
                d.pop();
                if(i==N-1){
                    result.add(node.val);
                }
                if(node.left != null){
                    d.addLast(node.left);
                }
                if(node.right != null){
                    d.addLast(node.right);
                }
            }
        }
        return result;
    }
}
