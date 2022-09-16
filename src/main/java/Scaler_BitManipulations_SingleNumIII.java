import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scaler_BitManipulations_SingleNumIII {

    public static void main(String[] args) {
        System.out.println(singleNumber(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
    }

    public static int singleNumber(final List<Integer> A) {
        int count;
        int ans = 0;
        for(int k=0; k<32; k++){
            count = 0;
            for(int i=0;i<A.size(); i++){
                //System.out.println("i:"+i+", k:"+k+", "+((1<<k)&A.get(i)));
                if(((1<<k)&A.get(i)) != 0){
                    count++;
                }
            }
//            System.out.println("============");
//            System.out.println("count:"+count);
            if(count%3!=0){
                ans = (1<<k)|ans;
            }
        }
        return ans;
    }
}
