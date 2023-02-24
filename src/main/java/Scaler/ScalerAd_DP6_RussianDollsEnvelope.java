package Scaler;

import java.util.*;

public class ScalerAd_DP6_RussianDollsEnvelope {

    public static void main(String[] args) {
        ScalerAd_DP6_RussianDollsEnvelope s = new ScalerAd_DP6_RussianDollsEnvelope();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//        A.add(new ArrayList<>(Arrays.asList(5,4)));
//        A.add(new ArrayList<>(Arrays.asList(6,4)));
//        A.add(new ArrayList<>(Arrays.asList(6,7)));
//        A.add(new ArrayList<>(Arrays.asList(2,3)));

//        A.add(new ArrayList<>(Arrays.asList(8,9)));
//        A.add(new ArrayList<>(Arrays.asList(8,18)));

        A.add(new ArrayList<>(Arrays.asList(90, 198)));
  A.add(new ArrayList<>(Arrays.asList(775, 787)));
  A.add(new ArrayList<>(Arrays.asList(813, 546)));
  A.add(new ArrayList<>(Arrays.asList(563, 685)));
  A.add(new ArrayList<>(Arrays.asList(960, 620)));
  A.add(new ArrayList<>(Arrays.asList(486, 371)));
  A.add(new ArrayList<>(Arrays.asList(607, 928)));
  A.add(new ArrayList<>(Arrays.asList(564, 333)));
  A.add(new ArrayList<>(Arrays.asList(735, 536)));
  A.add(new ArrayList<>(Arrays.asList(204, 640)));
  A.add(new ArrayList<>(Arrays.asList(953, 339)));
  A.add(new ArrayList<>(Arrays.asList(28, 149)));
  A.add(new ArrayList<>(Arrays.asList(586, 503)));
  A.add(new ArrayList<>(Arrays.asList(965, 438)));
  A.add(new ArrayList<>(Arrays.asList(822, 154)));
  A.add(new ArrayList<>(Arrays.asList(199, 46)));
  A.add(new ArrayList<>(Arrays.asList(235, 567)));
  A.add(new ArrayList<>(Arrays.asList(653, 609)));
  A.add(new ArrayList<>(Arrays.asList(650, 1)));
  A.add(new ArrayList<>(Arrays.asList(244, 16)));
  A.add(new ArrayList<>(Arrays.asList(10, 934)));
  A.add(new ArrayList<>(Arrays.asList(532, 812)));
  A.add(new ArrayList<>(Arrays.asList(198, 693)));
  A.add(new ArrayList<>(Arrays.asList(118, 929)));
  A.add(new ArrayList<>(Arrays.asList(787, 642)));
  A.add(new ArrayList<>(Arrays.asList(439, 375)));
  A.add(new ArrayList<>(Arrays.asList(180, 204)));
  A.add(new ArrayList<>(Arrays.asList(308, 712)));
  A.add(new ArrayList<>(Arrays.asList(400, 323)));
  A.add(new ArrayList<>(Arrays.asList(972, 834)));
  A.add(new ArrayList<>(Arrays.asList(747, 331)));
  A.add(new ArrayList<>(Arrays.asList(42, 867)));
  A.add(new ArrayList<>(Arrays.asList(190, 332)));
  A.add(new ArrayList<>(Arrays.asList(108, 894)));
  A.add(new ArrayList<>(Arrays.asList(400, 271)));
  A.add(new ArrayList<>(Arrays.asList(645, 606)));
  A.add(new ArrayList<>(Arrays.asList(187, 286)));
  A.add(new ArrayList<>(Arrays.asList(200, 532)));
  A.add(new ArrayList<>(Arrays.asList(928, 318)));
  A.add(new ArrayList<>(Arrays.asList(60, 121)));
  A.add(new ArrayList<>(Arrays.asList(113, 501)));
  A.add(new ArrayList<>(Arrays.asList(513, 404)));
  A.add(new ArrayList<>(Arrays.asList(669, 132)));
  A.add(new ArrayList<>(Arrays.asList(671, 613)));
  A.add(new ArrayList<>(Arrays.asList(219, 603)));
  A.add(new ArrayList<>(Arrays.asList(970, 995)));
  A.add(new ArrayList<>(Arrays.asList(623, 416)));
  A.add(new ArrayList<>(Arrays.asList(634, 889)));
  A.add(new ArrayList<>(Arrays.asList(852, 603)));
  A.add(new ArrayList<>(Arrays.asList(404, 469)));
  A.add(new ArrayList<>(Arrays.asList(939, 43)));
  A.add(new ArrayList<>(Arrays.asList(235, 991)));
  A.add(new ArrayList<>(Arrays.asList(194, 257)));
  A.add(new ArrayList<>(Arrays.asList(705, 161)));
  A.add(new ArrayList<>(Arrays.asList(810, 472)));
  A.add(new ArrayList<>(Arrays.asList(917, 687)));
        System.out.println(s.solve(A));
    }
    public int solve(ArrayList<ArrayList<Integer>> A) {
        Collections.sort(A, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if(o1.get(0) == o2.get(0)){
                    if(o1.get(1) > o2.get(1)){
                        return -1;
                    }else{
                        return 1;
                    }
                }else if(o1.get(0) > o2.get(0)){
                    return 1;
                }else {
                    return -1;
                }
            }
        });

        System.out.println(A);

        //now apply Longest increasing subsequesnce on width
        int N = A.size();
        int ans = Integer.MIN_VALUE;
        Integer[] dp = new Integer[N];
        Arrays.fill(dp, 1);
        for(int i=1; i<N; i++){
            for(int j=i-1; j>=0; j--){
                if(A.get(i).get(1) > A.get(j).get(1) && !Objects.equals(A.get(i).get(0), A.get(j).get(0))){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                    ans = Math.max(dp[i], ans);
                }
            }
        }
        System.out.println("dp:"+Arrays.toString(dp));
        return ans;
    }


}


