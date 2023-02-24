package Scaler;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayWithGivenSum12 {

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(A.get(0),0);
        for(int i=1; i<A.size(); i++)
        {
            hm.put(A.get(i-1)+A.get(i), i);
        }
        int sum = 0;
        int start = -1;
        int end = -1;
        int ps = 0;
        for(int i=0; i<A.size(); i++)
        {
            ps += A.get(i);
            if(hm.get(ps) == B)
            {
                start = 0;
                end = i;
                break;
            }
            sum = hm.get(ps)+B;
            if(hm.containsKey(sum))
            {
                start = hm.get(ps)+1;
                end = hm.get(sum);
                break;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(start>=0 && end>=0)
        {
            for(int j=start; j<=end; j++)
                ans.add(A.get(j));
        }
        else
        {
            ans.add(-1);
        }
        return ans;
    }


}
