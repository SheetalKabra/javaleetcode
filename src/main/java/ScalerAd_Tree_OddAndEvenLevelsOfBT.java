import java.util.Deque;
import java.util.LinkedList;

public class ScalerAd_Tree_OddAndEvenLevelsOfBT {
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
    public int solve(TreeNode A) {
        Deque<TreeNode> d = new LinkedList<>();
        int level = 1;
        int oddLevelSum = 0;
        int evenLevelSum = 0;
        d.push(A);
        while(!d.isEmpty()){
            int N = d.size();
            for(int i=0; i<N; i++){
                TreeNode node = d.peekFirst();
                d.pop();
                if(level % 2 == 0){
                    evenLevelSum += node.val;
                }else{
                    oddLevelSum += node.val;
                }
                if(node.left != null){
                    d.addLast(node.left);
                }
                if(node.right != null){
                    d.addLast(node.right);
                }
            }
            level++;
        }

        return oddLevelSum - evenLevelSum;
    }
}
