public class IsMagic {
    public int solve(int A) {

        if(((int)Math.log10(A)+1) == 1){
           return A == 1 ? 1 : 0;
       }
//        int sum =0, rem=0;
//        while(A>0) {
//            rem = A % 10;
//            A = A / 10;
//            sum = sum + rem;
//        }
        int sum = sumOfDigits(A);
        //System.out.println(sum);
        return  solve(sum);
    }

    public int sumOfDigits(int A){
        if(A == 0){
            return 0;
        }
        int rem;
        rem = A % 10;
        A = A / 10;
        return rem + sumOfDigits(A);
    }

    public static void main(String[] args) {
        //System.out.println((int)Math.log10(990)+1);
        IsMagic i = new IsMagic();
        System.out.println(i.solve(1));
        System.out.println(i.solve(92));
        System.out.println(i.solve(83557));
        System.out.println(i.solve(1291));
    }
}
