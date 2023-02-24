package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class GrayCode {
    public ArrayList<String> grayCode(int a) {
        /*
            append 0 to the each value of array, and append 1 to the each value of array from reverse
            for 1 => 0, 1
            for 2 =>    1. append 0 to each value of array => 00, 01
                        2. append 1 to each value of array from reverse => 11, 10
                  => final array => [00,01,11,10]
            for 3 =>    1. append 0 to each value of array => 000, 001, 011, 010
                        2. append 1 to each value of array from reverse => 100, 101, 111, 110
                  => final array => [000, 001, 011, 010, 100, 101, 111, 110]
        */

        //so find the a-1 array values

        if(a == 1){
            return new ArrayList<String>(Arrays.asList("0","1"));
        }
        ArrayList<String> list = grayCode(a-1);
        int N = list.size();
        for(int i=0; i<N; i++){
            list.add("1"+list.get(N-i-1));
            list.set(N-i-1, "0"+list.get(N-i-1));
        }
        return list;
    }

    public static void main(String[] args) {
        GrayCode g = new GrayCode();
        ArrayList<String> s = g.grayCode(16);
        System.out.println(s);
        ArrayList<Integer> grayCodeList = new ArrayList<>();
        for(int i=0; i<s.size(); i++){
            grayCodeList.add(Integer.parseInt(s.get(i), 2));
        }
        System.out.println(grayCodeList);
    }
}
