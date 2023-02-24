package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}

public class Scaler_MergeInterval {
    public static void main(String[] args) {
        Interval newInterval = new Interval(2,5);
        ArrayList<Interval> B = insert(new ArrayList<>(Arrays.asList(new Interval(1,3), new Interval(6,9))), newInterval);

//        Scaler.Interval newInterval = new Scaler.Interval(2,6);
//        ArrayList<Scaler.Interval> B = insert(new ArrayList<>(Arrays.asList(new Scaler.Interval(1,3), new Scaler.Interval(6,9))), newInterval);


//
//        Scaler.Interval newInterval = new Scaler.Interval(8,10);
//        ArrayList<Scaler.Interval> B = insert(new ArrayList<>(Arrays.asList(new Scaler.Interval(1,2), new Scaler.Interval(3,6))), newInterval);


        for(int i= 0;i <B.size(); i++){
            System.out.println("["+B.get(i).start+", "+B.get(i).end+"]");
        }
    }
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
//        System.out.println(intervals.get(0).start);
//        System.out.println(newInterval.start);
        //1. current event ended before new event started
        //2. current event started after new event ended
        //3. above 2 conditions are not satisfied, that means overlapping case
        ArrayList<Interval> result = new ArrayList<>();
        boolean isIntervalAdded = false;
        for(int i=0; i<intervals.size(); i++){
            //System.out.println("i="+i+", ["+newInterval.start+", "+newInterval.end+"]");
            //current event ended before new event started
            if(intervals.get(i).end <= newInterval.start){
                //System.out.println("if1");
                result.add(intervals.get(i));
            }else if(intervals.get(i).start > newInterval.end){
                //current event started after new event ended
                isIntervalAdded = true;
                result.add(newInterval);
                while(i<intervals.size()){
                    result.add(intervals.get(i));
                    i++;
                }
                return result;
            }else{
                newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
                newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            }
        }
        if(isIntervalAdded == false){
            result.add(newInterval);
        }
        //System.out.println("["+newInterval.start+", "+newInterval.end+"]");
        return  result;
    }
}
