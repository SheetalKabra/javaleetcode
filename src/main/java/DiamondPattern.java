import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int rows = A*2;
        for(int i=1; i<=rows; i++){
            if(i<=A){
                for(int j=1; j<=A-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++){
                    System.out.print("* ");
                }
                System.out.println("");
            }else{
                for(int j=A+1; j<i; j++){
                    System.out.print(" ");
                }
                for(int k=i; k<=rows; k++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }

//        int A = 5;
//        for(int i=1;i<=A*2;i++){
//            if(i<=A) {
//                for (int j = 1; j <= A - i; j++) {
//                    System.out.print(" ");
//                }
//                for (int k = 1; k <= i; k++) {
//                    System.out.print("* ");
//                }
//                System.out.println(" ");
//            }else{
//                for(int j=(A+1); j<i; j++){
//                    System.out.print(" ");
//                }
//                for(int k=i; k<=A*2; k++){
//                    System.out.print("* ");
//                }
//                System.out.println(" ");
//            }
//        }
    }
}
