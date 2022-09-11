public class Leetcode_MinOpToMakeAnArrEqual {
    public static void main(String[] args) {
        System.out.println(minOperations(2));
        System.out.println(minOperations(3));
        System.out.println(minOperations(4));
        System.out.println(minOperations(5));
        System.out.println(minOperations(6));
        System.out.println(minOperations(7));
        System.out.println(minOperations(8));
    }
    public static int minOperations(int n) {
        int count = 0;
        int reachedElement = n;
        n = (n-1)*2+1;
        while (n>reachedElement) {
            count = count + n-reachedElement;
            n=n-2;
        }
        return count;
    }
}
