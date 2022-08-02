import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int rows = A*2-1;
        for(int i=1; i<=rows; i++){
            if(i <= A){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }else{
                for(int j=i; j<=rows; j++){
                    System.out.print("*");
                }
                if(i!=rows){
                    System.out.println("");
                }

            }
        }
//        int A = 10;
//        int rows = A*2-1;
//        for(int i=1; i<=rows; i++){
//            if(i<=A){
//                for(int j=1; j<=i; j++){
//                    System.out.print("*");
//                }
//                System.out.println(" ");
//            }else{
//                for (int j=i; j<=rows; j++){
//                    System.out.print("*");
//                }
//                System.out.println(" ");
//            }
//        }
    }
}
