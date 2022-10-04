import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_Recursion2_findGrayCode {
    public static void main(String[] args) {
        System.out.println(grayCode(1));
    }

    public static ArrayList<Integer> grayCode(int a) {
        ArrayList<String> gc = findGreyCode(a);
        System.out.println("final gc:"+gc);
        ArrayList<Integer> op = new ArrayList<>();
        for(int i=0; i<gc.size(); i++){
            op.add(i, Integer.parseInt(gc.get(i), 2));
        }
        return op;
    }

    public static ArrayList<String> findGreyCode(int a){
        if(a == 1){
            return new ArrayList<>(Arrays.asList("0", "1"));
        }
        ArrayList<String> prevGreyCode = findGreyCode(a-1);
        ArrayList<String> gc = new ArrayList<>();
        for(int i=0; i<prevGreyCode.size(); i++){
            gc.add(i, "0"+prevGreyCode.get(i));
        }
        for(int i=prevGreyCode.size()-1; i>=0; i--){
            gc.add( "1"+prevGreyCode.get(i));
        }
        return gc;
    }
}
