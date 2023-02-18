class TreeNode12 {
    int val;
    TreeNode12 left;
    TreeNode12 right;

    TreeNode12(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Scalercontest_SmallestXOR {
    public static void main(String[] args) {
        TreeNode12 node = new TreeNode12(1);
        node.left = new TreeNode12(3);
        node.right = new TreeNode12(2);
        node.left.left = new TreeNode12(5);


        TreeNode12 node1 = new TreeNode12(1);
        node1.left = new TreeNode12(3);
        node1.right = new TreeNode12(2);
        node1.right.right = new TreeNode12(5);

        Scalercontest_SmallestXOR s = new Scalercontest_SmallestXOR();
        System.out.println(s.solve(node, node1));
    }

    public int solve(TreeNode12 A, TreeNode12 B) {
        if (A.val == B.val) {
            try {
                int result = ways(A, B);
                System.out.println(result);
                return result >= 0 ? result : -1;
            } catch (IllegalArgumentException ex) {
                return -1;
            }

        } else {
            return -1;
        }

    }

    public int ways(TreeNode12 A, TreeNode12 B) {
        if (A == null && B == null || (A.left == null && A.right == null && B.left == null && B.right == null)) {
            System.out.println("first condition");
            return 0;
        }
        if (A.left != null && A.right != null && B.left != null && B.right != null) {
            System.out.println(A.left.val+", "+A.right.val+", "+B.left.val+", "+B.right.val );
            if (A.left.val == B.left.val && A.right.val == B.right.val) {
                System.out.println("if");
                int ways = ways(A.left, B.left);
                int ways1 = ways(A.right, B.right);
                if(ways1 == Integer.MIN_VALUE  || ways == Integer.MIN_VALUE){
                    throw new IllegalArgumentException("Invalid value");
                }
                return ways + ways1;
            } else if (A.left.val == B.right.val && A.right.val == B.left.val) {
                System.out.println("else");
                int ways = ways(A.left, B.right);
                int ways1 = ways(A.right, B.left);
                if(ways1 == Integer.MIN_VALUE  || ways == Integer.MIN_VALUE){
                    throw new IllegalArgumentException("Invalid value");
                }
                return 1 + ways(A.left, B.right) + ways(A.right, B.left);
            } else {
                return Integer.MIN_VALUE;
            }
        } else {
            if(A.left == null && B.left == null && A.right != null && B.right != null && A.right.val == B.right.val){
                System.out.println("else first condition");
                return ways(A.right, B.right);
            }

            if(A.right == null && B.right == null && A.left != null && B.left != null && A.left.val == B.left.val){
                System.out.println("else sec condition");
                return ways(A.left, B.left);
            }

            if(A.left == null && B.right == null && A.right != null && B.left != null && A.right.val == B.left.val){
                System.out.println("else third condition");
                return 1+ways(A.right, B.left);
            }

            if(A.right == null && B.left == null && A.left != null && B.right != null && A.left.val == B.right.val){
                System.out.println("else forth condition");
                return 1+ways(A.left, B.right);
            }

        }
        System.out.println("hsdhasjd");
        return Integer.MIN_VALUE;

    }


}
