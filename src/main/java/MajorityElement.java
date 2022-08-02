import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
    public int majorityElement(final List<Integer> A) {
        int N = A.size();
        int freq = 0;
        int majority = Integer.MIN_VALUE;
        /**
         1. loop till 0 to N
         2. Now remove distinct element
         */
        for(int i=0; i<N; i++){
            if (freq == 0) {
                majority = A.get(i);
                freq = 1;
            } else if(A.get(i) == majority) {
                //means freq != 0, so i check if element is equals to majority, so just increase the freq by 1
                freq++;
            } else if (A.get(i) != majority) {
                //means element is not equals to majority, so just decrease the freq by 1
                freq--;
                //if freq reaches till 0, then reassign the value of majority to Integer.MIN_VALUE
                if(freq == 0){
                    majority = Integer.MIN_VALUE;
                }
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        System.out.println(m.majorityElement(new ArrayList<>(Arrays.asList(2,2))));
        System.out.println(m.majorityElement(new ArrayList<>(Arrays.asList(1,2))));
        System.out.println(m.majorityElement(new ArrayList<>(Arrays.asList(2,1,2))));
    }
}
