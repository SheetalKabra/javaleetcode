package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class ScalerAd_TwoPointers_PairsWithGivenSumII {
    public static void main(String[] args) {
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1,1,1)), 2));//3
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1,1)), 2));//1
//        System.out.println(solve(new ArrayList<>(Arrays.asList(2, 2, 3, 4, 4, 5, 6, 7, 10)), 8));//4
        //3403
        System.out.println(solve(new ArrayList<>(Arrays.asList(4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666, 4629666)), 9259332));
//        System.out.println(solve(new ArrayList<>(Arrays.asList( 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190, 194190)), 388380));
//        System.out.println(solve(new ArrayList<>(Arrays.asList( 2, 3, 3, 5, 7, 7, 8, 9, 9, 10, 10)), 11)); //4
//        System.out.println(solve(new ArrayList<>(Arrays.asList( 2, 4, 4, 5, 6, 8, 10)), 6)); //2
//        System.out.println(countDuplicates(new ArrayList<>(Arrays.asList(2, 4, 4, 5, 6, 8, 10)), 2));
//        System.out.println(countDuplicates(new ArrayList<>(Arrays.asList(2, 4, 4, 5, 6, 8, 10)), 101));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(2, 2, 3, 4, 4, 5, 6, 7, 10)), 8));//4
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 2, 6, 6, 7, 9, 9)), 13));//2
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int m = 1000000007;
        int l = 0;
        int r = A.size()-1;
        int ans = 0;
        while(l<=r){
            System.out.println("l:"+l+", r:"+r);
            int sum = A.get(l) + A.get(r);
            if(sum == B){
//                System.out.println("iff");
                int count = 0, prev = r;
                while(prev>l && (Objects.equals(A.get(r), A.get(prev)))){
                    System.out.println("while");
                    System.out.println("count:"+count);
                    count++;
                    prev--;
                }
                ans = (ans + count)%m;
                System.out.println("ans:"+ans);
                l++;
            }else if(sum > B){
                r--;
            }else if(sum < B){
                l++;
            }
        }
        return ans;
    }
    public static int solve1(ArrayList<Integer> A, int B) {
        int N = A.size();
//        System.out.println(N);
        long count = 0;
        int m = 1000000007;
        int i = 0;
        //for(int i=0; i<N; i++){
        while(i < N){
            if(A.get(i) >= B){
                i++;
                break;

            }
            //int sum = B - A.get(i);
            //System.out.println("i:"+i);
            int l = i+1;
            int r = N-1;
            while(l<=r){
                int mid = (r-l)/2 + l;
                //System.out.println("mid:"+mid);
                if(A.get(mid)+A.get(i) == B){
                    int countdup = countDuplicates(A, A.get(mid));
//                    if(countdup > 1){
//                        count += (countdup-1)*(countdup)/2;
//                    }else{
//                        count += countdup;
//                    }

//                    System.out.println("mid val:"+A.get(mid)+", i valL:"+A.get(i));
                    if(Objects.equals(A.get(mid), A.get(i))){
//                        System.out.println("ifff");
                        i = i + countdup-1;
                        count += (countdup-1)*(countdup)/2;
//                        System.out.println("i::::"+i);
                    }else{
                        //i++;
                        count += countdup;
                    }

//                    System.out.println(A.get(mid)+", countduplicates:"+countDuplicates(A, A.get(mid))+", count:"+count);
                    //System.out.println("count:"+count);
                    break;
                    //r = mid - 1;
                }else if(A.get(mid)+A.get(i) > B){
                    r = mid - 1;
                }else if(A.get(mid)+A.get(i) < B){
                    l = mid + 1;
                }
            }
            i++;
//            break;
//            System.out.println(A.get(i)+", count:"+count);
        }
        return (int)(count%m);
    }

    public static int countDuplicates(ArrayList<Integer> A, int val){
        int l = 0;
        int r = A.size()-1;
        int leftmostIndex = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(A.get(mid) == val){
                //case1: goto left
                r = mid -1;
                leftmostIndex = mid;
            }else if(A.get(mid) > val) {
                r = mid -1;
            }else if(A.get(mid) < val){
                l = mid+1;
            }
        }
        int rightmostindex = -1;
        l = 0;
        r = A.size()-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(A.get(mid) == val){
                //case2: goto right
                l = mid + 1;
                rightmostindex = mid;
            }else if(A.get(mid) > val) {
                r = mid -1;
            }else if(A.get(mid) < val){
                l = mid+1;
            }
        }
//        System.out.println("leftmostindex:"+leftmostIndex+", rightmostindex:"+rightmostindex);
        return rightmostindex - leftmostIndex +1;
    }
}
