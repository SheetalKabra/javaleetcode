import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScalerContest_KnightProblem {
    public static void main(String[] args) {
        ScalerContest_KnightProblem s = new ScalerContest_KnightProblem();

//        System.out.println(s.solve(new ArrayList<>(Arrays.asList("...", "...", ".QR"))));
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList("Q...", "....", ".R..","...."))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList("......", ".R....", "......","......", "......", "...Q.."))));
    }
    public int solve(final List<String> A) {
        int N = A.size();
        int[][] arr = new int[N][N];
        int qx = 0;
        int qy = 0;
        int rx = 0;
        int ry = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(A.get(i).charAt(j) == 'Q'){
                    qx = i;
                    qy = j;
                }
                if(A.get(i).charAt(j) == 'R'){
                    rx = i;
                    ry = j;
                }
            }

        }

        System.out.println("qx:"+qx+", qy:"+qy+", rx:"+rx+", ry:"+ry);

        int tempqx = qx;
        while(tempqx >= 0){
            arr[tempqx][qy] = 1;
            tempqx--;
        }
        int tempqy = qy;
        while(tempqy >= 0){
            arr[qx][tempqy] = 1;
            tempqy--;
        }

        tempqx = qx;
        System.out.println("tempqx"+tempqx);
        while(tempqx < N){
            arr[tempqx][qy] = 1;
            tempqx++;
            System.out.println("tempqx::"+tempqx);
        }
        tempqy = qy;
        while(tempqy < N){
            arr[qx][tempqy] = 1;
            tempqy++;
        }


        tempqx = qx;
        tempqy = qy;
        while(tempqx >= 0 && tempqy >= 0){
            arr[tempqx][tempqy] = 1;
            tempqx--;
            tempqy--;
        }
        tempqx = qx;
        tempqy = qy;
        while(tempqx < N && tempqy < N){
            arr[tempqx][tempqy] = 1;
            tempqx++;
            tempqy++;
        }

        tempqx = qx;
        tempqy = qy;
        while(tempqx >= 0 && tempqy < N){
            arr[tempqx][tempqy] = 1;
            tempqx--;
            tempqy++;
        }


        tempqx = qx;
        tempqy = qy;
        while(tempqx < N && tempqy >= 0){
            arr[tempqx][tempqy] = 1;
            tempqx++;
            tempqy--;
        }

        int temprx = rx;
        while(temprx >= 0){
            arr[temprx][ry] = 1;
            temprx--;
        }
        int tempry = ry;
        while(tempry >= 0){
            arr[rx][tempry] = 1;
            tempry--;
        }

        temprx = rx;
        while(temprx < N){
            arr[temprx][ry] = 1;
            temprx++;
        }
        tempry = ry;
        while(tempry < N){
            arr[rx][tempry] = 1;
            tempry++;
        }
        for(int i=0;i<N;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        int count = 0;
        for(int l=0; l<N; l++){
            for(int m=0; m<N; m++){
                if(arr[l][m] == 0){
                    count++;
                }
            }
        }
        return count;

    }
}
