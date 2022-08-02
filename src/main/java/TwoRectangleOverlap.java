public class TwoRectangleOverlap {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(E >= C || A >= G || F >= D || B >= H){
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        TwoRectangleOverlap r = new TwoRectangleOverlap();
        System.out.println(r.solve(1,1,1,1,1,1,1,1));
        System.out.println(r.solve(0,0,4,4,2,2,6,6));
        System.out.println(r.solve(0,0,4,4,2,2,3,3));
    }
}
