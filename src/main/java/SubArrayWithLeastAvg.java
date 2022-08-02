import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithLeastAvg {
    public int solve1(ArrayList<Integer> A, int B) {
        int N = A.size();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int minStartIndex = 0;
        for(int s=0; s<N; s++){
            System.out.println("s:"+s);
            sum = 0;
            if(B+s <= N){
                for(int e=s; e<B+s; e++){
                    sum = sum + A.get(e);
                }
            }else{
                System.out.println("else");
                break;
            }
            if(sum < min){
                min = sum;
                minStartIndex = s;
            }
        }
        return minStartIndex;
    }

    public int solve2(ArrayList<Integer> A, int B) {
        int N = A.size();
        int sum = 0,s = 0, count =0, minStartIndex = 0;
        int min = Integer.MAX_VALUE;
        while(s < N) {
            sum = sum + A.get(s);
            count++;
            s++;
            //System.out.println("count:" + count + ", s:" + s);
            if (count == B) {
                //System.out.println("in if before count:" + count + ", s:" + s+", sum:"+sum);
                count = 0;
                s = s - (B-1);
                if (sum < min) {
                    min = sum;
                    minStartIndex = s-1;
                }
                sum = 0;
                //System.out.println("in if after count:" + count + ", s:" + s+", sum:"+sum);
                //System.out.println("in if s:"+s);
            }
            //System.out.println("min:"+min+", minStartIndex:"+minStartIndex);
        }
        //System.out.println("=====final====");
        //System.out.println("min:"+min+", minStartIndex:"+minStartIndex);
        return minStartIndex;
    }

    public int solve3(ArrayList<Integer> A, int B) {
        int N = A.size();
        int sum = 0, s = 0, count =0, minStartIndex = 0;
        int min = Integer.MAX_VALUE;
        while(s < N){
            sum = sum + A.get(s);
            count++;
            s++;
            if(count == B){
                count = 0;
                s = s-(B-1);
                if(sum < min){
                    min = sum;
                    minStartIndex = s-1;
                }
                sum = 0;
            }
        }
        return minStartIndex;
    }

    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int minStartIndex = 0, sum = 0;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> pf = new ArrayList<Integer>(N);
        pf.add(A.get(0));
        for(int i=1; i<N; i++){
            pf.add(pf.get(i-1) + A.get(i));
        }
//        for(int i=0; i<N; i++){
//            System.out.print(pf.get(i)+" ");
//        }
//        System.out.println("");
        for(int s=0; s<N-B+1; s++){
            //start = s-1, end = s+B-1
            if(s == 0){
                sum = pf.get(s+B-1);
            }else{
                sum = pf.get(s+B-1) - pf.get(s-1);
            }
//            System.out.println("sum:"+sum);
            if(sum < min){
                min = sum;
                minStartIndex = s;
//                System.out.println("min:"+min+", minStartIndex:"+minStartIndex);
            }
        }

        return minStartIndex;
    }

    public static void main(String[] args) {
        SubArrayWithLeastAvg s = new SubArrayWithLeastAvg();
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(3, 7, 90, 20, 10, 50, 40)), 3));
    }
}
