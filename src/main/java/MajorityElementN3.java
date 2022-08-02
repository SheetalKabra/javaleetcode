import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementN3 {
    public int repeatedNumber(final List<Integer> a) {
        int N = a.size();
        int freq1 = 0;
        int freq2 = 0;
        int maj1 = Integer.MIN_VALUE;
        int maj2 = Integer.MIN_VALUE;
        for(int i=0 ;i<N; i++){
            if (maj1 == a.get(i)) {
                //if the majority1 element is already exists, then increment freq1 by 1
                freq1++;
            }else if(maj2 == a.get(i)){
                //if the majority2 element is already exists, then increment freq2 by 1
                freq2++;
            }else if (freq1 == 0) {
                //if no majority1 element exists, then assign into maj1 and increment freq1 by 1
                maj1 = a.get(i);
                freq1++;
            } else if(freq2 == 0) {
                //if no majority2 element exists, then assign into maj2 and increment freq1 by 1
                maj2 = a.get(i);
                freq2++;
            }else {
                //if none of them equals to majority element then decrement the frequencies by 1.
                freq1--;
                freq2--;
                if(freq1 == 0 ){
                    maj1 = Integer.MIN_VALUE;
                }
                if(freq2 == 0){
                    maj2 = Integer.MIN_VALUE;
                }
            }
        }

        //if maj1 and maj2 is equals to Integer.MIN_VALUE, then return -1
        if(maj1 == Integer.MIN_VALUE && maj2 == Integer.MIN_VALUE){
            return -1;
        }
        freq1 = 0;
        freq2 = 0;
        //now recheck it again whether we found majority elements are correct or not
        for(int i=0; i<N; i++ ){
            if(a.get(i) == maj1){
                freq1++;
            }else if(a.get(i) == maj2){
                freq2++;
            }
        }
        if(freq1 > N/3 ){
            return maj1;
        }else  if(freq2 > N/3 ){
            return maj2;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        MajorityElementN3 m = new MajorityElementN3();
        System.out.println(m.repeatedNumber(new ArrayList<>(Arrays.asList(1000441, 1000441, 1000994))));
        //System.out.println(m.repeatedNumber(new ArrayList<>(Arrays.asList(1,2))));

    }
}
