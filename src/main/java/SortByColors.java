import java.util.ArrayList;
import java.util.Arrays;

public class SortByColors {
    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int N = A.size();
        int count0=0, count1=0, count2=0;
        if(N == 1){
            return A;
        }
        for(int i=1; i<N; i+=2){
            if((A.get(i-1) ^ A.get(i)) == 1){
                count0++;
                count1++;
            }else if((A.get(i-1) ^ A.get(i)) == 2){
                count0++;
                count2++;
            }else if((A.get(i-1) ^ A.get(i)) == 3){
                count1++;
                count2++;
            }else {
                //that means either we have both 0 or both 1 or both 2
                if(A.get(i-1) == 0){
                    count0 +=2;
                } else if(A.get(i-1) == 1){
                    count1 +=2;
                } else if(A.get(i-1) == 2){
                    count2 +=2;
                }
            }
        }
        if(N%2 != 0){
            if(A.get(N-1) == 0){
                count0++;
            }else if(A.get(N-1) == 1){
                count1++;
            }else if(A.get(N-1) == 2){
                count2++;
            }
        }
        ArrayList<Integer> sortByColor = new ArrayList<>(N);
        for(int i=0; i<count0; i++){
            sortByColor.add(0);
        }
        for(int i=0; i<count1; i++){
            sortByColor.add(1);
        }
        for(int i=0; i<count2; i++){
            sortByColor.add(2);
        }
        return sortByColor;
    }

    public static void main(String[] args) {
        SortByColors s  = new SortByColors();
        System.out.println(s.sortColors(new ArrayList<>(Arrays.asList(2,1,2,2,2,2,1,1,0,0,1))));
    }
}
