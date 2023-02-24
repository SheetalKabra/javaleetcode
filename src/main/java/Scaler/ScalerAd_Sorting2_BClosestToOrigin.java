package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ScalerAd_Sorting2_BClosestToOrigin {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList();
//        A.add(new ArrayList<>(Arrays.asList(26, 41)));
//        A.add(new ArrayList<>(Arrays.asList(40, 47)));
//        A.add(new ArrayList<>(Arrays.asList(47, 7)));
//        A.add(new ArrayList<>(Arrays.asList(50, 34)));
//        A.add(new ArrayList<>(Arrays.asList(18, 28)));
//        System.out.println(solve(A,5));

//        A.add(new ArrayList<>(Arrays.asList(48, 18)));
//        A.add(new ArrayList<>(Arrays.asList(46, 34)));
//        A.add(new ArrayList<>(Arrays.asList(47, 30)));
//        A.add(new ArrayList<>(Arrays.asList(19, 9)));
//        A.add(new ArrayList<>(Arrays.asList(1, 39)));
//        A.add(new ArrayList<>(Arrays.asList(95, 77)));
//        A.add(new ArrayList<>(Arrays.asList(95, 106)));
//        A.add(new ArrayList<>(Arrays.asList(78, 75)));
//        A.add(new ArrayList<>(Arrays.asList(92, 108)));
//        A.add(new ArrayList<>(Arrays.asList(89, 83)));
//        A.add(new ArrayList<>(Arrays.asList(80, 76)));
//        System.out.println(solve(A,5));


        A.add(new ArrayList<>(Arrays.asList(-762, 643)));
        A.add(new ArrayList<>(Arrays.asList(693, -1004)));
        A.add(new ArrayList<>(Arrays.asList(-1026, 680)));
        A.add(new ArrayList<>(Arrays.asList(722, -1092)));
        A.add(new ArrayList<>(Arrays.asList(-875, 630)));
        A.add(new ArrayList<>(Arrays.asList(787, -860)));
        A.add(new ArrayList<>(Arrays.asList(-807, 999)));
        A.add(new ArrayList<>(Arrays.asList(1015, -788)));
        A.add(new ArrayList<>(Arrays.asList(-760, 889)));
          A.add(new ArrayList<>(Arrays.asList(990, -642)));
          A.add(new ArrayList<>(Arrays.asList(-1098, 1044)));
          A.add(new ArrayList<>(Arrays.asList(863, -614)));
          A.add(new ArrayList<>(Arrays.asList(-744, 651)));
          A.add(new ArrayList<>(Arrays.asList(959, -898)));
          A.add(new ArrayList<>(Arrays.asList(-905, 926)));
          A.add(new ArrayList<>(Arrays.asList(808, -725)));
          A.add(new ArrayList<>(Arrays.asList(-730, 809)));
          A.add(new ArrayList<>(Arrays.asList(871, -908)));
          A.add(new ArrayList<>(Arrays.asList(-993, 957)));
          A.add(new ArrayList<>(Arrays.asList(658, -924)));
          A.add(new ArrayList<>(Arrays.asList(-927, 872)));
          A.add(new ArrayList<>(Arrays.asList(735, -821)));
          A.add(new ArrayList<>(Arrays.asList(-1069, 1018)));
          A.add(new ArrayList<>(Arrays.asList(839, -777)));
          A.add(new ArrayList<>(Arrays.asList(-957, 786)));
          A.add(new ArrayList<>(Arrays.asList(853, -942)));
          A.add(new ArrayList<>(Arrays.asList(-865, 955)));
          A.add(new ArrayList<>(Arrays.asList(705, -1072)));
          A.add(new ArrayList<>(Arrays.asList(-717, 940)));
          A.add(new ArrayList<>(Arrays.asList(922, -618)));
          A.add(new ArrayList<>(Arrays.asList(-1013, 802)));
          A.add(new ArrayList<>(Arrays.asList(1065, -884)));
          A.add(new ArrayList<>(Arrays.asList(-638, 1063)));
          A.add(new ArrayList<>(Arrays.asList(654, -882)));
          A.add(new ArrayList<>(Arrays.asList(-722, 718)));
          A.add(new ArrayList<>(Arrays.asList(703, -870)));
          A.add(new ArrayList<>(Arrays.asList(-837, 1059)));
          A.add(new ArrayList<>(Arrays.asList(723, -747)));
          A.add(new ArrayList<>(Arrays.asList(-869, 620)));
          A.add(new ArrayList<>(Arrays.asList(951, -625)));
          A.add(new ArrayList<>(Arrays.asList(-890, 693)));
          A.add(new ArrayList<>(Arrays.asList(1043, -927)));
          A.add(new ArrayList<>(Arrays.asList(-745, 636)));
          A.add(new ArrayList<>(Arrays.asList(976, -951)));
          A.add(new ArrayList<>(Arrays.asList(-1055, 711)));
          A.add(new ArrayList<>(Arrays.asList(658, -867)));
          A.add(new ArrayList<>(Arrays.asList(-1011, 1049)));
          A.add(new ArrayList<>(Arrays.asList(867, -624)));
          A.add(new ArrayList<>(Arrays.asList(-685, 1018)));
          A.add(new ArrayList<>(Arrays.asList(1018, -962)));
          A.add(new ArrayList<>(Arrays.asList(-1070, 885)));
          A.add(new ArrayList<>(Arrays.asList(954, -798)));
          A.add(new ArrayList<>(Arrays.asList(-1005, 1095)));
          A.add(new ArrayList<>(Arrays.asList(-370, 81)));
          A.add(new ArrayList<>(Arrays.asList(156, -484)));
          A.add(new ArrayList<>(Arrays.asList(-286, 228)));
          A.add(new ArrayList<>(Arrays.asList(476, -87)));
          A.add(new ArrayList<>(Arrays.asList(-450, 114)));
          A.add(new ArrayList<>(Arrays.asList(86, -315)));
          A.add(new ArrayList<>(Arrays.asList(-89, 466)));
          A.add(new ArrayList<>(Arrays.asList(383, -447)));
          //System.out.println(solve(A,8));//[-450 114 ] [-370 81 ] [-286 228 ] [-89 466 ] [86 -315 ] [156 -484 ] [383 -447 ] [476 -87 ]
    }
    //merge sort will not work here

    public static int[][] solve(int[][] A, int B) {
        int[][] result = new int[B][2];
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int a1 = o1[0]*o1[0] + o1[1]*o1[1];
                int a2 = o2[0]*o2[0] + o2[1]*o2[1];
                return a1-a2;
            }
        });
        for(int i=0; i<B; i++){
            result[i] = new int[]{A[i][0], A[i][1]};
        }
        return  result;
    }

}
