public class SquareRootOfNumber {
    public int solve(int A) {

        long start = 1, end = A, sq = (start+end)/2;
        //System.out.println("iff start:"+start+", end:"+end+", sq:"+sq);
        while(start != end){
            if(sq*sq > A){
                end = sq-1 > start ? sq-1 : start;
                sq = (start+end)/2;
                //System.out.println("iff start:"+start+", end:"+end+", sq:"+sq);
            }else if(sq*sq < A){
                start = sq+1 < end ? sq+1 : end;
                sq = (start+end)/2;
                //System.out.println("else start:"+start+", end:"+end+", sq:"+sq);
            }else if(sq*sq == A){
                return (int)sq;
            }
        }
        if(start == end && sq*sq == A){
            return (int)sq;
        }
        return -1;
    }

    public static void main(String[] args) {
        SquareRootOfNumber sqrt = new SquareRootOfNumber();
        System.out.println("1065024 => "+sqrt.solve(1065024));
        System.out.println("2 => "+sqrt.solve(2));
        System.out.println("3 => "+sqrt.solve(3));
        System.out.println("4 => "+sqrt.solve(4));
        System.out.println("5 => "+sqrt.solve(5));
        System.out.println("6 => "+sqrt.solve(6));
        System.out.println("7 => "+sqrt.solve(7));
        System.out.println("8 => "+sqrt.solve(8));
        System.out.println("9 => "+sqrt.solve(9));
        System.out.println("10 => "+sqrt.solve(10));
        System.out.println("11 => "+sqrt.solve(11));
        System.out.println("12 => "+sqrt.solve(12));
        System.out.println("13 => "+sqrt.solve(13));
        System.out.println("14 => "+sqrt.solve(14));
        System.out.println("15 => "+sqrt.solve(15));
        System.out.println("16 => "+sqrt.solve(16));
        System.out.println("17 => "+sqrt.solve(17));
        System.out.println("18 => "+sqrt.solve(18));
        System.out.println("19 => "+sqrt.solve(19));
        System.out.println("20 => "+sqrt.solve(20));
        System.out.println("25 => "+sqrt.solve(25));
        System.out.println("30 => "+sqrt.solve(30));
        System.out.println("35 => "+sqrt.solve(35));
        System.out.println("36 => "+sqrt.solve(36));
        System.out.println("49 => "+sqrt.solve(49));
        System.out.println("50 => "+sqrt.solve(50));
        System.out.println("64 => "+sqrt.solve(64));
        System.out.println("81 => "+sqrt.solve(81));
        System.out.println("100 => "+sqrt.solve(100));
        System.out.println("110 => "+sqrt.solve(110));
        System.out.println("144 => "+sqrt.solve(144));
        System.out.println("196 => "+sqrt.solve(196));
        System.out.println("169 => "+sqrt.solve(169));
        System.out.println("100 => "+sqrt.solve(100));
        System.out.println("1001 => "+sqrt.solve(1001));
        System.out.println("676 => "+sqrt.solve(676));
        System.out.println("729 => "+sqrt.solve(729));
        System.out.println("784 => "+sqrt.solve(784));
        System.out.println("361 => "+sqrt.solve(361));
        System.out.println("362 => "+sqrt.solve(362));



    }
}
