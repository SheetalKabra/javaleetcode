import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestContinousSeqZerosum {

    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        int N = A.size();
        Map<Integer, Integer> psmap = new HashMap<>();
        int pf = 0, smax = -1, emax = -1, max = Integer.MIN_VALUE, j, seq;
        psmap.put(0, -1);
        for(int i=0; i<N; i++){
            pf += A.get(i);
            if(psmap.containsKey(pf)){
                j = psmap.get(pf);
                seq = i - (j+1) - 1;
                if(seq > max){
                    max = seq;
                    smax = j+1;
                    emax = i;
                }
            }else{
                psmap.put(pf, i);
            }
        }
        System.out.println("smax:"+smax+", emax:"+emax);
        ArrayList<Integer> lszeroArray = new ArrayList<>();
        if(smax == -1 && emax == -1){
            return lszeroArray;
        }
        for(int i=smax; i<=emax; i++){
            lszeroArray.add(A.get(i));
        }
        return lszeroArray;
    }

    public static void main(String[] args) {
        LongestContinousSeqZerosum l = new LongestContinousSeqZerosum();
        System.out.println(l.lszero(new ArrayList<>(Arrays.asList(-19, 8, 2, -8, 0, 5, -2, -23))));
    }
}
