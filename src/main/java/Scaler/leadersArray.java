package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class leadersArray {
    public static void main(String[] args) {
        leadersArray la = new leadersArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,5,3,4,11,10,2,1));
        ArrayList<Integer> output = la.solve(input);
        for(int i=0;i<output.size();i++){
            System.out.print(output.get(i)+" ");
        }
    }

    public ArrayList<Integer> solve(ArrayList<Integer> list) {

        ArrayList<Integer> listR=new ArrayList<Integer>();
        for(int i=0;i<list.size();i++)
        {
            boolean check=true;
            //System.out.println("i loop:"+list.get(i));
            for(int j=i+1;j<list.size();j++)
            {
                //System.out.println("j loop:"+list.get(j));
                if(list.get(i) <= list.get(j)) {
                    System.out.println("iff");
                    check = false;
                }
                if(check == false){
                    break;
                }
            }
            if(check==true)
            {
                //System.out.println("check true:"+list.get(i));
                listR.add(list.get(i));
            }

        }
        return listR;

    }
    public ArrayList<Integer> solve1(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> leadersArray = new ArrayList<Integer>(N);
        if(N ==1 ){
            return A;
        }else{
            int max = A.get(N-1);
            leadersArray.add(max);
            for(int i=N-2; i>=0; i--){
                if(A.get(i) > max){
                    max = A.get(i);
                    leadersArray.add(max);
                }
            }
        }
        return leadersArray;
    }
}
