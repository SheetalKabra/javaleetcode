package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber3 {
    public int[] solve(int[] A) {
        int XOR_all = 0;
        for(int i=0; i<A.length; i++)
        {
            XOR_all^=A[i];
        }
        System.out.println(XOR_all);
        int temp = XOR_all;
        int bit = 0;
        while(temp!=0)
        {
            if((temp&(1<<bit))!=0)
                break;
            bit++;
            //temp >>= 1;
        }
        System.out.println(bit);
        int elem1 = 0;
        int elem2 = 0;
        for(int i=0; i<A.length; i++)
        {
            if((A[i]&(1<<bit))!=0)
                elem1 ^= A[i];
            else
                elem2 ^= A[i];
        }
        int ans[] = new int[2];
        ans[0]=elem2<elem1?elem2:elem1;
        ans[1]=elem1>elem2?elem1:elem2;
        return ans;
    }
    public ArrayList<Integer> solve1(ArrayList<Integer> A) {
        int N = A.size();
        //1. Find the xor of all elements first
        int xor_all=0;
        for(int i=0; i<N; i++){
            xor_all = xor_all^A.get(i);
        }
        System.out.println("");
        System.out.println(xor_all);
        //2. Now find out the set bit from the rightmost from the xor_all
        int temp = xor_all;
        int bit = 0;
        while((temp&(1<<bit)) ==0 ){
            bit++;
        }
        System.out.println(bit);
        //3. Now divide the array into 2 group, i.e,
        //3.1 first group will have all the bits having '1' at bit position
        //3.2 second group will have all the bits having '0' at bit position
        ArrayList<Integer> group1 = new ArrayList<>();
        ArrayList<Integer> group2 = new ArrayList<>();
        for(int i=0; i<N; i++){
            if((A.get(i)&(1<<bit)) != 0 ){
                group1.add(A.get(i));
            }else{
                group2.add(A.get(i));
            }
        }
        //4. Now do the xor of all group1 elements and xor of all group2 elements.
        //5. you will get the sinlge single element in both the group
        int group1_xor_all=0;
        for(int i=0; i<group1.size(); i++){
            group1_xor_all = group1_xor_all^group1.get(i);
        }
        int group2_xor_all=0;
        for(int i=0; i<group2.size(); i++){
            group2_xor_all = group2_xor_all^group2.get(i);
        }
        //now return group1_xor_all and group2_xor_all into new array list in ascending order
        if(group1_xor_all > group2_xor_all){
            return new ArrayList<>(Arrays.asList(group2_xor_all, group1_xor_all));
        }else{
            return new ArrayList<>(Arrays.asList(group1_xor_all, group2_xor_all));
        }

    }

    public static void main(String[] args) {
        SingleNumber3 s = new SingleNumber3();
        //System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,2,3,2,1,4))));
        //System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,2))));
        int[] A = s.solve(new int[]{1,2,2,1,4,4,3,5,152,5});
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+",");
        }
        //System.out.println(s.solve1(new ArrayList<>(Arrays.asList(1,2,2,1,4,4,3,12))));
    }
}
