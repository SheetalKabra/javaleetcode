import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ScalerAd_Tree_IdenticalBinaryTrees {

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

    public int isSameTree(TreeNode A, TreeNode B) {
        ArrayList<Integer> AList = converTreeIntoList(A);
        ArrayList<Integer> BList = converTreeIntoList(B);
        if(AList.equals(BList)){
            return  1;
        }
        return 0;
    }

    public ArrayList<Integer> converTreeIntoList(TreeNode A){
        Deque<TreeNode> d = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        d.add(A);
        while(!d.isEmpty()){
            TreeNode node = d.peekFirst();
            d.pop();
            result.add(node.val);
            if(node.left != null){
                d.addLast(node.left);
            }else{
                result.add(-1);
            }
            if(node.right != null){
                d.addLast(node.right);
            }else{
                result.add(-1);
            }
        }
        return result;
    }
}
