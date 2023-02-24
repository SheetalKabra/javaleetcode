package Scaler;

import java.util.ArrayList;

public class Scaler_BitManIIClass_CountSetBits {
    public static void main(String[] args) {
        System.out.println("12:"+cntBits(12));
        System.out.println("16:"+cntBits(16));
        System.out.println("1:"+cntBits(1));
        System.out.println("11:"+cntBits(11));
        System.out.println("32:"+cntBits(32));
        System.out.println("40:"+cntBits(40));
        System.out.println("7:"+cntBits(7));
    }
    public static int cntBits(int N) {
        int count = 0;
        while(N!=0){
            N = N&(N-1);
            count++;
        }
        return count;
    }
}
