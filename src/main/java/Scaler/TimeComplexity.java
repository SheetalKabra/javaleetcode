package Scaler;

public class TimeComplexity {
    public static void main(String[] args) {
        int i=0;
        int N = 5;
        while(i*i <= N){
            for(int j=0; j<=N; j++){
                for(int k=0; k<=N; k++,i++){
                    System.out.println("in==="+i);
                }
                System.out.println("in outt====");
            }
            i++;
            System.out.println("out===="+i);
        }
    }
}
