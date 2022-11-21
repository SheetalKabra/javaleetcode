import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ScalerAd_Stacks2_MaxMIN {
    public static int solve(ArrayList<Integer> A) {
        int N = A.size();
        int m = 1000000007;
        ArrayList<Integer> lmax = getlMax(A);
        ArrayList<Integer> rmax = getrMax(A);
        ArrayList<Integer> lmin = getlMin(A);
        ArrayList<Integer> rmin = getrMin(A);
        long summax = 0;
        for(int i=0; i<N; i++){
            long count = (long)(i-lmax.get(i)) * (rmax.get(i)-i);
            long contribution = (A.get(i)%m * count%m)%m;
            summax = ( summax%m + contribution%m )%m;
        }
        long summin = 0;
        for(int i=0; i<N; i++){
            long count = (long)(i-lmin.get(i)) * (rmin.get(i)-i);
            long contribution = (A.get(i)%m * count%m)%m;
            summin = (summin%m + contribution%m )%m;
        }
        int op = (int)(summax - summin);
        if((summax - summin) < 0){
            op = (int)((summax - summin) + m);
        }
        return op;
    }

    public static ArrayList<Integer> getlMax(ArrayList<Integer> A){
        ArrayList<Integer> lmax = new ArrayList<>();
        Stack<Integer> stl = new Stack<>();
        for(int i=0; i<A.size(); i++){
            while(!stl.empty() && A.get(stl.peek()) <= A.get(i)){
                stl.pop();
            }
            if(stl.isEmpty()){
                lmax.add(i, -1);
            }else{
                lmax.add(i, stl.peek());
            }
            stl.push(i);
        }
        return lmax;
    }

    public static ArrayList<Integer> getrMax(ArrayList<Integer> A){
        ArrayList<Integer> rmax = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            rmax.add(i, 0);
        }
        Stack<Integer> str = new Stack<>();
        for(int i=A.size()-1; i>=0; i--){
            while(!str.empty() && A.get(str.peek()) <= A.get(i)){
                str.pop();
            }
            if(str.empty()){
                rmax.set(i, A.size());
            }else{
                rmax.set(i, str.peek());
            }
            str.push(i);
        }
        return rmax;
    }

    public static ArrayList<Integer> getlMin(ArrayList<Integer> A){
        ArrayList<Integer> lmax = new ArrayList<>();
        Stack<Integer> stl = new Stack<>();
        for(int i=0; i<A.size(); i++){
            while(!stl.empty() && A.get(stl.peek()) >= A.get(i)){
                stl.pop();
            }
            if(stl.isEmpty()){
                lmax.add(i, -1);
            }else{
                lmax.add(i, stl.peek());
            }
            stl.push(i);
        }
        return lmax;
    }

    public static ArrayList<Integer> getrMin(ArrayList<Integer> A){
        ArrayList<Integer> rmax = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            rmax.add(i, 0);
        }
        Stack<Integer> str = new Stack<>();
        for(int i=A.size()-1; i>=0; i--){
            while(!str.empty() && A.get(str.peek()) >= A.get(i)){
                str.pop();
            }
            if(str.empty()){
                rmax.set(i, A.size());
            }else{
                rmax.set(i, str.peek());
            }
            str.push(i);
        }
        return rmax;
    }

    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,2,7,3,6,5,4,1,8))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(4, 7, 3, 8))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(994390, 986616, 976849, 979707, 950477, 968402, 992171, 937674, 933065, 960863, 980981, 937319, 951236, 959547, 991052, 991799, 992213, 941294, 978103, 997198, 960759, 988476, 963517, 980366, 921767, 979757, 977912, 983761, 981869, 947454, 930202, 999086, 973538, 999798, 996446, 944001, 974217, 951595, 942688, 975075, 970973, 970130, 897109, 927660, 862233, 997130, 986068, 954098, 978175, 889682, 988973, 996036, 969675, 985751, 977724, 881538, 988613, 924230, 906475, 915565, 986952, 975702, 994316, 964011, 986848, 983699, 949076, 989673, 981788, 929094, 988310, 926471, 994763, 999736, 980762, 973560, 996622, 934475, 998365, 966255, 998697, 998700, 911868, 983245, 996382, 996992, 953142, 994104, 987303, 853837, 960626, 904203, 998063, 977596, 977868, 996012, 946345, 949255, 988138, 996298, 954933, 965036, 886976, 998628, 990878, 953725, 916744, 985233, 919661, 970903, 986066))));
    }
}
