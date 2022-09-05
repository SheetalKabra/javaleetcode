public class ImplementPowerFunction {
    public int pow(int A, int B, int C) {
        //3. Terminal condition
        if(A == 0 ){
            return 0;
        }
        if(B == 0){
            return 1;
        }
        //2. Main logic
        long half = pow(A, B/2, C);
        int halfmodC = (int)((half*half)%C);

        if(B%2 == 0){
            return halfmodC <0 ? halfmodC + C : halfmodC;
        }else{
            return (halfmodC*(A%C))%C <0 ? (halfmodC*(A%C))%C + C : (halfmodC*(A%C))%C;
        }
    }

    public static void main(String[] args) {
        ImplementPowerFunction i = new ImplementPowerFunction();
        System.out.println(i.pow(71045970, 41535484, 64735492));
    }
}
