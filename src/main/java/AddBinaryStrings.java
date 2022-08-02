import java.util.ArrayList;

public class AddBinaryStrings {

    public String addBinary(String A, String B) {
        int lengthA = A.length();
        int lengthB = B.length();
        char zero = '0';
        if(lengthA != lengthB){
            if(lengthA > lengthB){
                // add 0 in the starting of string B to make both the string equal
                for(int i=0; i<lengthA-lengthB; i++){
                    B = zero + B;
                }
            }else{
                // add 0 in the starting of string A to make both the string equal
                for(int i=0; i<lengthB-lengthA; i++){
                    A = zero + A;
                }
            }
        }
        int carry = 0;
        int sum = 0;
        System.out.println(A);
        System.out.println(B);
        ArrayList<Integer> sumArray = new ArrayList<Integer>();
        for(int i=A.length()-1; i>=0; i--){
            //convert string to integer and then apply the operation to do the sum.
            //sum = A[i] + B[i] + carry
            sum =  (Integer.parseInt(String.valueOf(A.charAt(i))) +  Integer.parseInt(String.valueOf(B.charAt(i))) + carry ) % 2;
            carry = (Integer.parseInt(String.valueOf(A.charAt(i))) +  Integer.parseInt(String.valueOf(B.charAt(i))) + carry ) / 2;
            sumArray.add(sum);
        }
        if(carry != 0){
            sumArray.add(carry);
        }
        //now reverse the sum string
        String sumString = "";
        for(int i=sumArray.size()-1; i>=0 ;i--){
            sumString += String.valueOf(sumArray.get(i));
        }
        return sumString;
    }

    public static void main(String[] args) {
        AddBinaryStrings a  = new AddBinaryStrings();
        System.out.println(a.addBinary("100", "11"));
    }

}
