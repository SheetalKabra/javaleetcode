package Scaler;

import java.util.Scanner;

public class AreaOfCircle {
    public int solve(int A){

        return (int)Math.ceil(Math.PI*A*A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<= N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
                if(j<i){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        AreaOfCircle aoc = new AreaOfCircle();
        aoc.solve(2);
    }
}
