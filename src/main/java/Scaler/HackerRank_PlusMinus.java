package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank_PlusMinus {
    public static void main(String[] args) {
        plusMinus(new ArrayList<>(Arrays.asList(1,2,3,-2,1)));

    }

    public static void plusMinus(List<Integer> arr) {
        System.out.println(arr);
        // Write your code here
        int positiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == 0){
                zerosCount++;
            }else if(arr.get(i) > 0){
                positiveCount++;
            }else if(arr.get(i) < 0){
                negativeCount++;
            }
        }

        System.out.println(String.format("%.6f",(double)positiveCount/arr.size()));
        System.out.println(String.format("%.6f",(double)negativeCount/arr.size()));
        System.out.println(String.format("%.6f",(double)zerosCount/arr.size()));

    }

}
