package Scaler;

public class PowerFunction {
    public int pow(int A, int B, int C) {
        //3. Terminal condition
        if(A == 0 ){
            return 0;
        }
        if(B == 0){
            return 1;
        }
        //2. Main logic
        long half = pow(A, B/2, C)%C;
        System.out.println(half);

        if(B%2 == 0){
            return (int)((half*half)%C) <0 ? (int)((half*half)%C) + C : (int)((half*half)%C);
        }else{
            return (int)(((half*half)%C)*(A%C))%C <0 ? (int)(((half*half)%C)*(A%C))%C + C : (int)(((half*half)%C)*(A%C))%C;
        }
    }

    public static void main(String[] args) {
        PowerFunction p = new PowerFunction();
        System.out.println(p.pow(71045970, 41535484, 64735492));
    }
}
