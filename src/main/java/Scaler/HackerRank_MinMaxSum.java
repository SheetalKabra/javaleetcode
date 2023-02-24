package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank_MinMaxSum {
    public static void main(String[] args) {

        //miniMaxSum(new ArrayList<>(Arrays.asList(769082435, 210437958, 673982045, 375809214, 380564127)));
        //miniMaxSum(new ArrayList<>(Arrays.asList(1,3,5,7,9)));
        System.out.println(timeConversion("12:00:00AM"));
        System.out.println(timeConversion("01:32:12AM"));
        System.out.println(timeConversion("02:21:12AM"));
        System.out.println(timeConversion("03:34:12AM"));
        System.out.println(timeConversion("04:53:12AM"));
        System.out.println(timeConversion("05:22:22AM"));
        System.out.println(timeConversion("06:23:12AM"));
        System.out.println(timeConversion("07:00:12AM"));
        System.out.println(timeConversion("08:32:12AM"));
        System.out.println(timeConversion("09:00:12AM"));
        System.out.println(timeConversion("10:21:12AM"));
        System.out.println(timeConversion("11:32:12AM"));
        System.out.println(timeConversion("12:32:12PM"));
        System.out.println(timeConversion("01:32:12PM"));
        System.out.println(timeConversion("02:21:12PM"));
        System.out.println(timeConversion("03:34:12PM"));
        System.out.println(timeConversion("04:53:12PM"));
        System.out.println(timeConversion("05:22:22PM"));
        System.out.println(timeConversion("06:23:12PM"));
        System.out.println(timeConversion("07:00:12PM"));
        System.out.println(timeConversion("08:32:12PM"));
        System.out.println(timeConversion("09:00:12PM"));
        System.out.println(timeConversion("10:21:12PM"));
        System.out.println(timeConversion("11:32:12PM"));

    }

    public static String timeConversion(String s) {
        // Write your code here
        //split the string from AM and PM
        String[] splits = s.contains("AM") ? s.split("AM") : s.split("PM");
        if(s.contains("PM")){
            String[] time = splits[0].split(":");
            if(time[0].equals("12")){
                return time[0]+":"+time[1]+":"+time[2];
            }else{
                int hour = Integer.parseInt(time[0])+12;
                return String.valueOf(hour)+":"+time[1]+":"+time[2];
            }
        }else{
            String[] time = splits[0].split(":");
            if(time[0].equals("12")){
                return "00"+":"+time[1]+":"+time[2];
            }else{
                return time[0]+":"+time[1]+":"+time[2];
            }
        }

    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        //find total sum first
        long totalSum = 0;
        for(int i=0; i<arr.size(); i++){
            totalSum = totalSum + arr.get(i);
        }
        System.out.println(totalSum);
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i=0; i<arr.size(); i++){
            long sum = totalSum - arr.get(i);
            if(sum > max){
                max = sum;
            }
            if(sum < min){
                min = sum;
            }
        }
        System.out.print(min + " " + max);

    }
}
