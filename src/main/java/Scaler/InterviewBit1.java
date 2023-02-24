package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Modify given array by incrementing first occurrence of every element by K

Given an array arr[] consisting of N integers, read every element of the array Scaler.one by Scaler.one and perform the following operations:
    1. If the current element arr[i] had previously occurred in the array, increase its first occurrence by K.
    2. Otherwise, insert arr[i] into the sequence.

The task is to print the final sequence of integers obtained by performing the above operations*/
public class InterviewBit1 {
    public static void main(String[] args) throws InvalidInputException {
        InterviewBit1 ibit = new InterviewBit1();
        //List<Integer> result = ibit.print(Arrays.asList(1,1,2,3,2));
        List<Integer> result = ibit.print(Arrays.asList(1,4,1,1,4));
        for (int k=0;k<result.size();k++){
            System.out.print(result.get(k)+ ", ");
        }
    }

    public List<Integer> print(List<Integer> list) throws InvalidInputException{
        List<Integer> result = new ArrayList<>();
        boolean isExist = false;
        if(list == null || list.size() == 0){
            throw new InvalidInputException();
        }
        for(int i=0;i< list.size();i++){
            isExist = false;
            if(result != null){
                for (int j=0;j< result.size();j++){
                    if(list.get(i) == result.get(j)){
                        result.set(j, list.get(i)+1);
                        isExist = true;
                        break;
                    }
                }
                result.add(i, list.get(i));
            }else{
                result.add(i, list.get(i));
            }
        }
        return result;
    }
}
