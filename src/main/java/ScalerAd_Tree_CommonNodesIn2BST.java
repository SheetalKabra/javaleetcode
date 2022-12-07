import java.util.HashSet;
import java.util.Set;

public class ScalerAd_Tree_CommonNodesIn2BST {
    public int solve(TreeNode A, TreeNode B) {
        HashSet<Integer> AnodesSet = inorder(A, new HashSet<>());
        HashSet<Integer> BnodesSet = inorder(B, new HashSet<>());
        //now do the sum of all nodes
        long sum = 0;
        int m = 1000000007;
        for(int ele: AnodesSet){
            if(BnodesSet.contains(ele)){
                sum = (sum%m + ele%m)%m;
            }
        }
        return (int)sum;
    }

    public HashSet<Integer> inorder(TreeNode A, HashSet<Integer> result){
        if(A == null){
            return new HashSet<>();
        }
        inorder(A.left, result);
        result.add(A.val);
        inorder(A.right, result);
        return result;
    }
}
