package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScalerAd_BinarySearch1_MedianOfArray {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new ArrayList<>(Arrays.asList(1,4,5)), new ArrayList<>(Arrays.asList(2,3))));
        System.out.println(findMedianSortedArrays(new ArrayList<>(Arrays.asList(1,2,3)), new ArrayList<>(Arrays.asList(4))));
        System.out.println(findMedianSortedArrays(new ArrayList<>(Arrays.asList(0,23)), new ArrayList<>(Arrays.asList())));
        System.out.println(findMedianSortedArrays(new ArrayList<>(Arrays.asList(-43, -25, -18, -15, -10, 9, 39, 40)), new ArrayList<>(Arrays.asList(-2))));
//        System.out.println(findMedianSortedArrays(new ArrayList<>(Arrays.asList(-50, -41, -40, -19, 5, 21, 28)), new ArrayList<>(Arrays.asList(-50, -21, -10))));
//        System.out.println(findMedianSortedArrays(new ArrayList<>(Arrays.asList(899800 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -5000 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4999 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4998 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4997 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4996 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4995 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4994 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4993 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4992 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4991 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4990 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4989 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4988 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4987 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4986 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4985 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4984 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4983 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982 -4982)), new ArrayList<>(Arrays.asList(-50, -21, -10))));
    }
    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        int n = a.size();
        int m = b.size();

        if(n > m)
            return findMedianSortedArrays(b, a);

        int low = 0, high = n;

        while(low <= high)
        {
            int cut1 = low + (high-low)/2;
            int cut2 = (n + m + 1)/2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : a.get(cut1-1);
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : b.get(cut2-1);

            int right1 = (cut1 == n) ? Integer.MAX_VALUE : a.get(cut1);
            int right2 = (cut2 == m) ? Integer.MAX_VALUE : b.get(cut2);

            if(left1 <= right2 && left2 <= right1)
            {
                if((n+m)%2 == 0)
                    return (Math.max(left1, left2) + Math.min(right1, right2)) /2.0 ;
                else
                    return (Math.max(left1, left2));
            }
            if(left1 > right2)
            {
                high = cut1 - 1;
            }
            if(left2 > right1)
            {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
}