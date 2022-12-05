import java.util.Stack;

public class ScalerAd_Stack1_RedundantBraces {
    public static void main(String[] args) {
        ScalerAd_Stack1_RedundantBraces s = new ScalerAd_Stack1_RedundantBraces();
//        System.out.println(s.braces("((a+b))"));
//        System.out.println(s.braces("(a+(a+b))"));
//        System.out.println(s.braces("(a)"));
//        System.out.println(s.braces("(a+((b*c)+c))"));
        System.out.println(s.braces("(a+(a))"));
    }
    public int braces(String A) {
        Stack<Character> st = new Stack<>();
        int N = A.length();
        boolean isOpenRedundant = false;
        int countOpenBracket = 0;
        for(int i=0; i<N; i++){
            if(A.charAt(i) == '('){
                countOpenBracket++;
                if(A.charAt(i+2) == ')'){
                    return 1;
                }
                if(i!= 0 && A.charAt(i-1) == '('){
                    isOpenRedundant = true;
                }

            }else if(A.charAt(i) == ')'){
                if(A.charAt(i-1) == ')' || (i!=N-1 && A.charAt(i+1) == ')' )){
                    if(isOpenRedundant){
                        return 1;
                    }
                }else{
                    isOpenRedundant = false;
                }
            }
        }
        if(countOpenBracket == 1){
            return 1;
        }
        return 0;
    }
}
