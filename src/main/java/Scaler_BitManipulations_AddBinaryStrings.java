public class Scaler_BitManipulations_AddBinaryStrings {
    public static void main(String[] args) {
        System.out.println(addBinary("1", "1"));
    }
    public static String addBinary(String A, String B) {
        int l1 = A.length();
        int l2 = B.length();
        System.out.println("l1:"+l1+", l2:"+l2);
        if(l1 != l2){
            if(l1 > l2){
                //add 0 at the starting of l2 to make both the strings equal
                int diff = l1-l2;
                while(diff!=0){
                    B = "0"+B;
                    diff--;
                }
            }else{
                //add 0 at the starting of l1 to make both the strings equal
                int diff = l2-l1;
                while(diff!=0) {
                    A = "0" + A;
                    diff--;
                }
            }
        }
        l1 = A.length();
        l2 = B.length();

        System.out.println("l1:"+l1+", l2:"+l2);
        System.out.println(A);
        System.out.println(B);
        int i=1;
        int carry = 0;
        String ans = "";
        while(l1-i >= 0){

            if(A.charAt(l1-i) == B.charAt(l2-i)){
                //System.out.println("equal:"+(l1-i)+", A:"+A.charAt(l1-i)+", B:"+B.charAt(l2-i)+", carry:"+carry);
                if(carry == 0){
                    ans = "0" + ans;
                }else{
                    ans = "1" + ans;
                }
                if(A.charAt(l1-i) == '1'){
                    carry = 1;
                }else{
                    carry = 0;
                }
            }else{
                //System.out.println("not equal:"+(l1-i)+", A:"+A.charAt(l1-i)+", B:"+B.charAt(l2-i)+", carry:"+carry);
                if(carry == 1) {
                    ans = "0" + ans;
                    carry = 1;
                }else{
                    ans = "1" + ans;
                    carry = 0;
                }
            }
            i++;
        }
        if(carry == 1){
            return "1" + ans;
        }else{
            return ans;
        }

    }
}
