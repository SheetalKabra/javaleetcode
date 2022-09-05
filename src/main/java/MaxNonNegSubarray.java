import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegSubarray {
    public static void main(String[] args) {

//        System.out.println(maxset(new ArrayList<>(Arrays.asList(1967513926 ,1540383426))));

//        System.out.println(maxset(new ArrayList<>(Arrays.asList(1, 2, 5, -7, 2, 3))));
//        System.out.println(maxset(new ArrayList<>(Arrays.asList(1, 2, 5, -7, 5, 1, 2))));
//        System.out.println(maxset(new ArrayList<>(Arrays.asList(1, 2, 5, 7, 5, 1, 2))));
//        System.out.println(maxset(new ArrayList<>(Arrays.asList(1, 2, 5, 7, 5, 1, -2))));
//        System.out.println(maxset(new ArrayList<>(Arrays.asList(-1, 2, 5, 7, 5, 1, -2))));
//        System.out.println(maxset(new ArrayList<>(Arrays.asList(-1, 2, 5, 7, 5, 1, 2))));
//        System.out.println(maxset(new ArrayList<>(Arrays.asList(-1, -2, -5, -7, -5, -1, 2))));
        //System.out.println(maxset(new ArrayList<>(Arrays.asList(-1, -2, -5, -7, -5, -1, -2))));
        int[] a = maxset1(new int[]{-1, -2, -5, -7, -5, -1, -2});
        System.out.println(a.length);
        for(int i=0;i<a.length; i++){
            System.out.println(a[i]);
        }
//        System.out.println(maxset(new ArrayList<>(Arrays.asList(-1, -1, -1, -1, -1))));
    }


    public static int[] maxset1(int[] A) {
        long maxSum = 0;
        long sum = 0;
        int temp = 0;
        int s=0;
        int e=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>=0){
                sum += (long)A[i];
                if(maxSum<sum){
                    maxSum = sum;
                    s = temp;
                    e = i;
                }
                else if(maxSum == sum){
                    if(i-temp+1 > e-s+1){
                        s = temp;
                        e = i;
                    }
                }
            }
            else{
                sum=0;
                temp = i+1;
            }
        }
        System.out.println("sum:"+sum);
        System.out.println("s:"+s);
        System.out.println("e:"+e);
        if(sum>0){
            int[] result = new int[e-s+1];
            int j=0;
            for(int i=s;i<=e;i++){
                result[j++] = A[i];
            }
            return result;
        }
        else
            return new int[] {};
        //System.out.println(s+" "+e);
        //return result;
    }
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> op = new ArrayList<>();
        int N = A.size();
        long sum = 0, max = -1;
        int maxs = 0, maxe = 0, e = 0, s = 0;
        for(int i=0; i<N; i++){
            if(A.get(i) < 0){
                if(sum > max){
                    max = sum;
                    maxs = s;
                    //maxe = e;
                    maxe = i-1;
                }else if(sum == max){
                    //if((e-s) > (maxe-maxs)){
                    if((i-1-s) > (maxe-maxs)){
                        maxs = s;
                        maxe = i-1;
                    }
                }
                s=i+1;
                sum=0;
            }else{
                //e = i;
                sum = sum + A.get(i);
                if(i == N-1){
                    if(sum>max){
                        max = sum;
                        maxe = i;
                        maxs = s;
                    }else if(max == sum){
                        if((e-s) > (maxe-maxs)){
                            maxe = e;
                            maxs = s;
                        }
                    }
                }
            }
        }
        for(int i=maxs; i<=maxe; i++){
            op.add(A.get(i));
        }
        return op;
    }

    public static ArrayList<Integer> maxset1(ArrayList<Integer> A) {
        ArrayList<Integer> op = new ArrayList<>();
        int N = A.size();
        int sum = 0, max = -1, maxs = 0, maxe = 0, e = 0, s = 0;
        for(int i=0; i<N; i++){
            if(A.get(i) < 0){
                if(sum > max){
                    max = sum;
                    maxs = s;
                    //maxe = e;
                    maxe = i-1;
//                    System.out.println("maxs:"+maxs);
//                    System.out.println("maxe:"+maxe);
                }else if(sum == max){
                    //if((e-s) > (maxe-maxs)){
                    if((i-1-s) > (maxe-maxs)){
                        maxs = s;
                        maxe = i-1;
                    }
                }
                s=i+1;
                sum=0;
            }else{
                //e = i;
                sum = sum + A.get(i);
                if(i == N-1){
                    if(sum>max){
                        max = sum;
                        maxe = i;
                        maxs = s;
                    }else if(max == sum){
                        if((e-s) > (maxe-maxs)){
                            maxe = e;
                            maxs = s;
                        }
                    }
                }
            }
        }
//        System.out.println(maxs);
//        System.out.println(maxe);
        for(int i=maxs; i<=maxe; i++){
            op.add(A.get(i));
        }
        return op;
    }
}
