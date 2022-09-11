public class Leetcode_PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(5));
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(7));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(9));
        System.out.println(isPowerOfTwo(10));
        System.out.println(isPowerOfTwo(64));

    }
    public static boolean isPowerOfTwo(int n) {
//        if(n==1){
//            return true;
//        }
//        int i=1;
//        while(true){
//            if(1<<i == n){
//                return true;
//            }else if((1<<i) > n){
//                return false;
//            }
//            i++;
//        }

        for(int i=0;i<32;i++){
            if(1<<i == n){
                return true;
            }else if((1<<i) > n){
                return false;
            }
        }
        return false;
    }
}
