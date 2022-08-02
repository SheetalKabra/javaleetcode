import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rem = 0, div = 0, sum = 0;

        for(int i=1; i<= N; i++){
            rem = 0;
            div = i;
            sum = 0;
            while(div > 0){
                rem = div % 10;
                div = div / 10;
                sum = sum + (rem*rem*rem);
            }
            if(sum == i){
                System.out.println(i);
            }
        }
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for(int i=1; i<=N; i++){
//            int rem = 0;
//            int div = i;
//            int sum = 0;
//            while(div > 0){
//                rem = div % 10;
//                div = div / 10;
//                sum = sum + rem*rem*rem;
//            }
//            if(sum == i){
//                System.out.println(i);
//            }
//        }
    }
}
