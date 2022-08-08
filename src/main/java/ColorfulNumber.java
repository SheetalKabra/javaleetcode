import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ColorfulNumber {
    public int colorful(int A) {
        ArrayList<Integer> splitNumber = new ArrayList<>();
        int rem = 0;
        while(A > 0){
            rem = A%10;
            A = A/10;
            splitNumber.add(rem);
        }
        Set<Integer> freq = new HashSet<>();
        for(int s=0; s<splitNumber.size(); s++){
            int product = 1;
            for(int e=s; e<splitNumber.size(); e++){
                //int dist = e-s+1;
                //if(dist < splitNumber.size()) {
                    product = product * splitNumber.get(e);
                    if (freq.contains(product)) {
                        System.out.println("===0===");
                        System.out.println(freq);
                        return 0;
                    } else {
                        freq.add(product);
                        System.out.println(freq);
                    }
                //}
            }
        }
        System.out.println(freq);
        return 1;
    }

    public static void main(String[] args) {
        ColorfulNumber c = new ColorfulNumber();
//        System.out.println(c.colorful(2342));
//        System.out.println(c.colorful(23));
//        System.out.println(c.colorful(236));
        System.out.println(c.colorful(12));
    }
}
