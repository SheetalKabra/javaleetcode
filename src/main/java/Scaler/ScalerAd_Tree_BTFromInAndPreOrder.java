package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
public class ScalerAd_Tree_BTFromInAndPreOrder {
    public static void main(String[] args) {
//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(a.getClass());
//        ArrayList<Integer> b = new ArrayList<>(a.subList(1,4));
//        System.out.println(b.getClass());
//        System.out.println(a.subList(1,4).getClass());
        System.out.println(buildTree1(new ArrayList<>(Arrays.asList(1,2,4,3,5,7,8,6)), new ArrayList<>(Arrays.asList(4,2,1,7,5,8,3,6))));
    }

    public static HashMap<Integer,Integer> hm = new HashMap<>();
    public static TreeNode buildTree1(ArrayList<Integer> B, ArrayList<Integer> A) {


        for(int i=0;i<A.size();i++){
            hm.put(A.get(i),i);
        }

        TreeNode root = null;

        root = convertBinaryTree(root,A,B,0,A.size()-1,0,B.size()-1, "root");

        return root;

    }

    public static TreeNode convertBinaryTree(TreeNode root, ArrayList<Integer> inorder, ArrayList<Integer> preorder, int in_start, int in_end, int pre_start, int pre_end, String val){

        if(in_start > in_end || pre_start > pre_end){
            return null;
        }

        root = new TreeNode(preorder.get(pre_start));

        int index = hm.get(root.val);
        System.out.println(val+", index:"+index+", for val:"+root.val);
        System.out.print("Left: in_start:"+in_start+", in_end:"+(index-1)+", pre_start:"+(pre_start+1)+", pre_end:"+index);
        System.out.println("");
        System.out.print("Right: in_start:"+(index+1)+", in_end:"+in_end+", pre_start:"+(index+1)+", pre_end:"+pre_end);
        System.out.println("");


        root.left = convertBinaryTree(root,inorder,preorder,in_start,index-1,pre_start+1,index, "left");

        root.right = convertBinaryTree(root,inorder,preorder,index+1,in_end,index+1,pre_end, "right");


        return root;


    }






    public TreeNode1 buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        int M = B.size();
        if(B.size() == 0){
            return null;
        }
        int root_val = A.get(0);
        TreeNode1 root = new TreeNode1(root_val);
        int i = pos(B, root_val);
        //l_in = inorder[0:i-1];
        //r_in = inorder[i+1:n-1];
        //l_pre = pre[1:i];
        //r_pre = pre[i+1:n-1];
        ArrayList<Integer> l_pre = new ArrayList<>(A.subList(1, i+1));
        ArrayList<Integer> r_pre = new ArrayList<>(A.subList(i+1, M));

        ArrayList<Integer> l_in = new ArrayList<>(B.subList(0, i));
        ArrayList<Integer> r_in = new ArrayList<>(B.subList(i+1, N));

        root.left = buildTree((ArrayList<Integer>) A.subList(1, i+1), (ArrayList<Integer>)B.subList(0, i));
        root.right = buildTree((ArrayList<Integer>) A.subList(i+1, M), (ArrayList<Integer>) B.subList(i+1, N));
        return root;
    }

    public static int pos(ArrayList<Integer> B, int element){
        for(int i=0; i<B.size(); i++){
            if(B.get(i) == element){
                return i;
            }
        }
        return -1;
    }
}
