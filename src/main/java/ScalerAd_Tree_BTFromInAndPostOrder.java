import java.util.ArrayList;
import java.util.Arrays;


public class ScalerAd_Tree_BTFromInAndPostOrder {
    public static void main(String[] args) {
        System.out.println(buildTree(new ArrayList<>(Arrays.asList(2,1,3)), new ArrayList<>(Arrays.asList(2,3,1)), "root"));
//        System.out.println(buildTree(new ArrayList<>(Arrays.asList(10,17,9,15,14,19,25,8,4,20)), new ArrayList<>(Arrays.asList(15,9,10,17,8,19,14,25,4,20))));
    }
    public static TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B, String s) {
        //A = inorder
        //B = postorder
        if(A.size() <= 0){
            return null;
        }
        int N = A.size();
        int M = B.size();
        TreeNode root = new TreeNode(B.get(M-1));
        System.out.println(s+", elem:"+B.get(M-1));
        int i = getRootPositionInInorder(A, B.get(M-1));
        System.out.println("i:"+i);
        //l_in = [0, i-1]
        //r_in = [i+1, N-1]
        //l_post = [0, i-1]
        //r_post = [i, M-2]
        ArrayList<Integer> l_in = new ArrayList<>(A.subList(0, i));
        ArrayList<Integer> r_in = new ArrayList<>(A.subList(i+1, N));

        ArrayList<Integer> l_post = new ArrayList<>(B.subList(0, i));
        ArrayList<Integer> r_post = new ArrayList<>(B.subList(i, M-1));
        root.left = buildTree(l_in, l_post, "left");
        root.right = buildTree(r_in, r_post, "right");
        return root;
    }

    public static int getRootPositionInInorder(ArrayList<Integer> A, int elem){
        for(int i=0; i<A.size(); i++){
            if(A.get(i) == elem){
                return i;
            }
        }
        return -1;
    }
}
