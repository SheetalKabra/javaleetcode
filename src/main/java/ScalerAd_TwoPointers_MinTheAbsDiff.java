import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_TwoPointers_MinTheAbsDiff {
    public static void main(String[] args) {
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1,4,5,8,10)), new ArrayList<>(Arrays.asList(6,9,15)), new ArrayList<>(Arrays.asList(2,3,6,6))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1,4,5,8,10)), new ArrayList<>(Arrays.asList(6,9,10)), new ArrayList<>(Arrays.asList(2,3,6,10))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(-1)), new ArrayList<>(Arrays.asList(-2)), new ArrayList<>(Arrays.asList(-3))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(-21, 4, 26, 30, 42, 88, 134, 182, 193, 197, 225, 271, 311, 324, 364, 404, 409, 414, 439, 446, 492, 498, 501, 530, 546, 571, 591, 595, 608, 618, 621, 652, 670, 671, 701, 708, 717, 722, 740, 744, 744, 769, 817, 831, 865, 900, 908, 945, 992, 1036, 1062, 1075, 1097, 1144, 1152, 1180, 1182, 1191, 1212, 1234, 1272, 1278, 1314, 1316, 1322, 1359, 1387, 1407)),
                new ArrayList<>(Arrays.asList(10, 24, 32, 53, 92, 97, 120, 150, 167, 172, 178, 186, 227, 274, 280, 294, 320, 369, 369, 399, 437, 481, 507, 545, 555, 595, 634, 678, 714, 747, 774, 782, 798, 812, 814, 815, 815, 862, 891, 920, 943, 977, 987, 1034, 1079, 1112, 1138, 1183, 1222, 1234, 1242, 1289, 1330, 1338, 1385, 1423, 1453)),
                new ArrayList<>(Arrays.asList(68, 111, 136, 160, 208, 252, 271, 320, 324, 367, 401, 411, 411, 459, 488, 505, 528, 556, 593, 630, 661, 707, 723, 732, 780, 807, 850, 897, 929, 938, 978, 978, 1027, 1042, 1064, 1088, 1100, 1146, 1179, 1217, 1240, 1262, 1271, 1285, 1319, 1333, 1381, 1424, 1452, 1495, 1515, 1525, 1534, 1573, 1618, 1624, 1650, 1677, 1722, 1766, 1809, 1824, 1836, 1882, 1906, 1911, 1958, 1999, 2011, 2053, 2083, 2084, 2102, 2144, 2172, 2202, 2228, 2244, 2280, 2303, 2317, 2339, 2369, 2370, 2379, 2413, 2419, 2437, 2457, 2481, 2514, 2557, 2578, 2605, 2623, 2651, 2668, 2692, 2720, 2740, 2753, 2757, 2761, 2806, 2814, 2827, 2835, 2859, 2872, 2896, 2922, 2926, 2947, 2982, 3001, 3046, 3092, 3133, 3164, 3168, 3199, 3212, 3242, 3280, 3283, 3325, 3366, 3376, 3391, 3418, 3441, 3448, 3448, 3460, 3478, 3526, 3550))));
    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int N = A.size();
        int M = B.size();
        int P = C.size();
        int a = 0;
        int b = 0;
        int c = 0;
        int ans = Integer.MAX_VALUE;
        if(N >= M && N >= P){
            for(int i=0; i<N; i++){
                b = getMin(B, A.get(i));
                c = getMin(C, A.get(i));
                a = A.get(i);
                System.out.println("a:"+a);
                System.out.println("b:"+b);
                System.out.println("c:"+c);
                System.out.println("================");

                if( ans == Integer.MAX_VALUE ){
                    ans = Math.max(a, Math.max(b,c)) - Math.min(a,Math.min(b,c));
                }else{
                    if(Math.max(a, Math.max(b,c)) - Math.min(a,Math.min(b,c)) < ans){
                        ans = Math.max(a, Math.max(b,c)) - Math.min(a,Math.min(b,c));
                    }
                }
                System.out.println("ans:"+ans);
                System.out.println("================");
            }
        }else if(M >= N && M >= P){
            for(int i=0; i<M; i++){
                a = getMin(A, B.get(i));
                c = getMin(C, B.get(i));
                b = B.get(i);
                System.out.println("a:"+a);
                System.out.println("b:"+b);
                System.out.println("c:"+c);
                System.out.println("================");
                if( ans == Integer.MAX_VALUE ){
                    ans = Math.max(a, Math.max(b,c)) - Math.min(a,Math.min(b,c));
                }else{
                    if(Math.max(a, Math.max(b,c)) - Math.min(a,Math.min(b,c)) < ans){
                        ans = Math.max(a, Math.max(b,c)) - Math.min(a,Math.min(b,c));
                    }
                }
                System.out.println("ans:"+ans);
                System.out.println("================");
            }
        }else if(P >= M && P >= N){
            for(int i=0; i<P; i++){
                a = getMin(A, C.get(i));
                b = getMin(B, C.get(i));
                c = C.get(i);
                System.out.println("a:"+a);
                System.out.println("b:"+b);
                System.out.println("c:"+c);
                System.out.println("================");
                if( ans == Integer.MAX_VALUE ){
                    ans = Math.max(a, Math.max(b,c)) - Math.min(a,Math.min(b,c));
                }else{
                    if(Math.max(a, Math.max(b,c)) - Math.min(a,Math.min(b,c)) < ans){
                        ans = Math.max(a, Math.max(b,c)) - Math.min(a,Math.min(b,c));
                    }
                }
                System.out.println("ans:"+ans);
                System.out.println("================");
            }
        }
        return ans;
    }
    public static int getMin(ArrayList<Integer> A, int num){
        if(A.size() == 1){
            return A.get(0);
        }
        int l=0;
        int r = A.size()-1;
        //int num = num;
        int ans1 = Integer.MAX_VALUE;
        int ans2 = 0;
        int mid = 0;
        int midans = 0;
        while(l<=r){
            mid = (l+r)/2;
            if(A.get(mid) == num){
                ans1 = A.get(mid);
                midans = mid;
                break;
            }else if(A.get(mid) > num){
                r=mid-1;
                if(ans1 == -1){
                    ans1 = Math.abs(A.get(mid) - num);
                    midans = mid;
                }else{
                    if(Math.abs(A.get(mid) - num) < ans1){
                        midans = mid;
                        ans1 = Math.abs(A.get(mid) - num);
                    }
                    //ans1 = Math.min(ans1, Math.abs(A.get(mid) - num));
                }

//                System.out.println("goto left:"+ans1);
//                System.out.println("mid:"+mid+", midans:"+midans);
            }else{
                l = mid+1;
                if(ans1 == -1){
                    ans1 = Math.abs(A.get(mid) - num);
                    midans = mid;
                }else{
                    if(Math.abs(A.get(mid) - num) < ans1){
                        midans = mid;
                        ans1 = Math.abs(A.get(mid) - num);
                    }
                    //ans1 = Math.min(ans1, Math.abs(A.get(mid) - num));
                }
//                System.out.println("goto right:"+ans1);
//                System.out.println("mid:"+mid+", midans:"+midans);
            }
        }
        return A.get(midans);
    }
}
