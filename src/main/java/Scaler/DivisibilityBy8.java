package Scaler;

public class DivisibilityBy8 {
    public int solve(String A) {
        int N = A.length();
        System.out.println("length:"+N);
        System.out.println(A);
        if(N > 3){
            int i = N-1;
            int count = 0;
            String last3Digit = "";
            while(count < 3){
                last3Digit = A.charAt(i) + last3Digit;
                count++;
                i--;
            }
            if(Integer.parseInt(last3Digit) %8 == 0){
                return 1;
            }else{
                return 0;
            }
        }else{
            if(Integer.parseInt(A)%8 == 0){
                return 1;
            }else{
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        DivisibilityBy8 d = new DivisibilityBy8();
//        System.out.println(d.solve("123456"));
//        System.out.println(d.solve("2121212160"));
//        System.out.println(d.solve("2121212169"));
//        System.out.println(d.solve("16"));
        System.out.println(d.solve("40897237111816995922805307737859413552091006514927603847883130124746756767426237849396480087733429432861339411285568084588535007444731"));
    }
}
