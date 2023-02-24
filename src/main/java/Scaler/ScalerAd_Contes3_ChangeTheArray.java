package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScalerAd_Contes3_ChangeTheArray {
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int N = A.size();
        System.out.println(N);
        int M = B.size();
        int P = C.size();
        Collections.sort(A);
        int aind = N-1;



        while(true){
            ArrayList<Integer> minValueOfCIndex = minValueOfCIndex(C);
            System.out.println("minValueOfCIndex:");
            System.out.println(minValueOfCIndex);
            int cindex = minValueOfCIndex.get(0);
            int cvalue = minValueOfCIndex.get(1);
            if(minValueOfCIndex.get(1) > Collections.max(A)){
                break;
            }else{
                System.out.println("B index:"+B.get(cindex));
                for(int i=0; i<B.get(cindex); i++){
                    if(A.get(aind) > cvalue){
                        A.set(aind, cvalue);
                        aind--;
                        if(aind == 0){
                            break;
                        }

                    }
                }
                B.set(cindex, -1);
                if(aind == 0 || Collections.max(B) == -1){
                    break;
                }
                C.set(cindex, Integer.MAX_VALUE);
                System.out.println("A:");
                System.out.println(A);
            }
        }
        int result = 0;
        for(int i=0; i<N; i++){
            result = result+A.get(i);
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        return result;
        //C ki min value hi A ki max value se greater h toh simply return A.sum();
    }

    public static ArrayList<Integer> minValueOfCIndex(ArrayList<Integer> C){
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0; i<C.size(); i++){
            if(C.get(i) < min){
                index = i;
                min = C.get(i);
            }
        }

        return new ArrayList(Arrays.asList(index, min));
    }

    public static void main(String[] args) {
        ArrayList<Integer> A= new ArrayList<>(Arrays.asList(269,434,387,207,436,475,397,407,445,341,230,324,458,207,390,260,476,408,281,370,393,303,343,533,279,220,301,379,288,468,317,327,222,308,362,442,158,441,170,417,240,383,387,374,364,335,246,244,421,386,337,329,470,303,378,381,342,405,353,394,335,287,379,128,437,451,443,428,535,419,351,461,558,403,353,344,353,452,423,439,251,587,162,484,491,230,264,418,188,390,482,290,341,412,460,208,512,396,277,536,340,395,470,274,407,291,365,450,265,473,280,590,269,257,430,567,346,360,304,382,332,220,383,285,343,552,482,533,269,312,264,419,292,411,382,463,344,234,267,350,452,148,328,296,346,128,417,321,482,249,412,191,468,384,246,339,409,372,302,291,556,431,408,317,131,268,309,399,237,288,293,407,344,458,242));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(30,25,21,27,35,33,30,22,38,20,22,29,18,21,23,19,15,21,23,22,20,32,19,19,18,26,34,15,24,22,23,19,15,21,13,34,36,34,35,31,21,27,15,17,31,19,18,13,32,34,37,38,19,15,26,23,17,35,31,15,19,18,11,30,38,23,30,23,35,27,23,25,29,19,12,26,28,30,34,22,16,34,20,34,18,25,19,23,22,32,28,23,29,28,23,24,28,22,23,19,16,34,18,27,20,21,25,27,18,24,22,29,22,22,27,30,21,22,37,25,18,25,16,31,22,30,16,27,16,23,34,32,23,24,22,14,15,19,22,27,23,24,24,29,24,29,34,27,25,26,25,25,25,16,19,27,19,32,15,26,26,15,17,20,21,38,26,25,27,27,33,32,32,18,30,31,28,22,23,17,27,25,29,34,31,25,32,21,30,26,29,15,21,27,36,22,25,23,33,29,26,21,23,25,35,12,35,37,14,12,19,35,14,12,23,25,17,29,28,20,27,17,17,32,28));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(247,551,216,402,308,185,294,190,210,259,392,169,179,353,178,320,430,335,419,48,363,302,328,346,351,245,397,190,349,387,161,223,274,336,382,282,85,228,213,395,411,144,319,318,89,155,335,99,208,401,181,271,310,163,451,458,194,233,87,297,263,260,303,172,282,153,86,335,150,101,268,491,256,177,63,405,396,466,379,280,311,349,359,265,134,321,130,457,227,310,327,299,263,100,362,568,365,270,399,341,310,263,388,336,406,319,266,192,301,308,526,361,238,401,307,215,305,89,236,279,325,332,406,193,491,368,324,123,253,374,257,334,404,320,461,424,344,198,286,160,245,387,475,334,319,413,268,401,344,208,300,300,390,301,380,180,168,132,242,289,111,196,437,183,114,294,441,334,132,291,201,307,143,370,304,274,331,359,253,224,346,175,274,101,321,135,413,350,274,479,322,212,101,348,315,277,135,354,313,282,355,229,218,286,240,249,474,328,333,432,390,314,142,105,262,348,302,229,233));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(8,15,16,3,10)), new ArrayList<>(Arrays.asList(2,1,1)), new ArrayList<>(Arrays.asList(2,3,1))));
        System.out.println(solve(A, B, C));

    }
}
