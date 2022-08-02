public class ConcatenateThreeNumbers {

    public static void main(String[] args) {
        ConcatenateThreeNumbers c = new ConcatenateThreeNumbers();
        System.out.println(c.solve(10,20,30));
        System.out.println(c.solve(20,30,25));
        System.out.println(c.solve(47,43,50));
        System.out.println(c.solve(55,43,47));
        System.out.println(c.solve(43,90,10));
        System.out.println(c.solve(55,43,20));
        System.out.println(c.solve(55,55,55));
        System.out.println(c.solve(55,43,43));
        System.out.println(c.solve(10,43,43));
        System.out.println(c.solve(55,30,55));
        System.out.println(c.solve(55,90,55));
        System.out.println(c.solve(10,10,55));
        System.out.println(c.solve(44,44,10));

    }

    public int solve(int A, int B, int C) {
        //find the 1st and 2nd min from A, B and C
        if(A <= B && A <= C){
            if(B <= C){
                //then number will be concatenat in the format: ABC
                return (A*10000)+(B*100)+C;
            }else{
                //then number will be concatenat in the format: ACB
                return (A*10000)+(C*100)+B;
            }
        }else if(B <= A && B <= C){
            if(A <= C){
                //then number will be concatenat in the format: BAC
                return (B*10000)+(A*100)+C;
            }else{
                //then number will be concatenat in the format: BCA
                return (B*10000)+(C*100)+A;
            }
        }else{
            if(A <= B){
                //then number will be concatenat in the format: CAB
                return (C*10000)+(A*100)+B;
            }else{
                //then number will be concatenat in the format: CBA
                return (C*10000)+(B*100)+A;
            }
        }
    }
}
