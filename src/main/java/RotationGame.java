import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int temp;
        int s;
        int e;
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        B = B % N;
        if(B > 0){
            //1. reverse the whole array
            s = 0;
            e = N-1;
            while(s<e) {
                temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            //2. now reverse the array till 0 to B-1
            s = 0;
            e = B-1;
            while(s<e) {
                temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }


            //3. reverse the remaining B to N-1
            s = B;
            e = N-1;
            while(s < e){
                temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

        }

        //4. Print final array
        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }
    }


//    public static void main(String[] args) {
//        // YOUR CODE GOES HERE
//        // Please take input and print output to standard input/output (stdin/stdout)
//        // DO NOT USE ARGUMENTS FOR INPUTS
//        // E.g. 'Scanner' for input & 'System.out' for output
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        int temp;
//        int s;
//        int e;
//        for(int i=0; i<N; i++){
//            arr[i] = sc.nextInt();
//        }
//        int B = sc.nextInt();
//        B = B % N;
//        if(B > 0){
//            //1. reverse the whole array
//            s = 0;
//            e = N -1;
//            while(s < e) {
//                temp = arr[s];
//                arr[s] = arr[e];
//                arr[e] = temp;
//                s++;
//                e--;
//            }
//
//
//            //2. now reverse the array till 0 to B
//            int rev1Length = B;
//            s = 0;
//            e = rev1Length -1;
//            //System.out.println("1. rev1: s="+s+", e="+e);
//            while(s < e) {
//                temp = arr[s];
//                arr[s] = arr[e];
//                arr[e] = temp;
//                s++;
//                e--;
//            }
//
//            //3. reverse the remaining B+1 to N-1
//            int rev2Length = N - rev1Length;
//            s = B;
//            e = N - 1;
//            //System.out.println("1. rev2: s="+s+", e="+e);
//            //System.out.println("if");
//            while (s < e) {
//                temp = arr[s];
//                arr[s] = arr[e];
//                arr[e] = temp;
//                s++;
//                e--;
//            }
//        }
//
//        //4. Print final array
//        for(int i=0; i<N; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
}
