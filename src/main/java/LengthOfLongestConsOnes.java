import java.util.ArrayList;

public class LengthOfLongestConsOnes {
    public int solve(String A) {
        int N = A.length();
        ArrayList<Integer> L =  new ArrayList<>(N);
        ArrayList<Integer> R =  new ArrayList<>(N);
        for(int i=0; i<N; i++){
            R.add(i, 0);
        }
        int count = 0;
        for(int i=0; i<N; i++){
            if(A.charAt(i) == '1'){
                count = count + 1;
            }else{
                count =0;
            }
            L.add(i, count);
        }
        count = 0;
        for(int i=N-1; i>=0; i--){
            if(A.charAt(i) == '1'){
                count = count + 1;
            }else{
                count =0;
            }
            R.set(i, count);
        }
        int sum = 0;
        int max = -1;
        int start = -1;
        int end = -1;
        for(int i=0; i<N; i++){
            if(A.charAt(i) == '0'){
                if(i == 0){
                    sum = R.get(i+1);
                }else if(i == N-1){
                    sum = L.get(i-1);
                }else{
                    sum = L.get(i-1) + R.get(i+1);
                }
                if(sum > max){
                    start = i == 0 ? i : i - L.get(i-1);
                    end = i == N-1 ? i : i + R.get(i+1);
                    max = sum;
                }
            }
        }
        if(max == -1){
            return N;
        }else{
            //now check if any 1 exists in [0, start)
            for(int i=0; i<start; i++){
                if(A.charAt(i) == '1'){
                    return max + 1;
                }
            }
            //if 1 does not exists in [0, start), then check in (end, N-1]
            for(int i=end+1; i<N; i++){
                if(A.charAt(i) == '1'){
                    return max + 1;
                }
            }
        }
        return  max;
    }

    public static void main(String[] args) {
        LengthOfLongestConsOnes l = new LengthOfLongestConsOnes();
        System.out.println(l.solve("1110111001"));

    }
}
