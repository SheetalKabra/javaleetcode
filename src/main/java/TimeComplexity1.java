public class TimeComplexity1 {
    public static void main(String[] args) {
        int N = 10;
        for(int i=0; i<N; i++){
            System.out.println("first inner i: "+i);
            for(int j=i; j<N; j++){
                System.out.println("sec inner j: "+j);
                break;
            }
        }
    }
}
