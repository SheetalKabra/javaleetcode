package Scaler;

import java.util.Stack;

public class ScalerAd_Stack1_BalancedParanthesis {
    public static void main(String[] args) {
        System.out.println(solve("()[]{}"));
        System.out.println(solve("()[]}"));
        System.out.println(solve("()[]{"));
        System.out.println(solve("()["));
        System.out.println(solve(")()["));
    }
    public static int solve(String A) {
        int N = A.length();
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<N; i++){
            if(A.charAt(i) == '(' || A.charAt(i) == '{' || A.charAt(i) == '['){
                st.push(A.charAt(i));
            }else{
                if(st.isEmpty()){
                    return 0;
                }else{
                    if(A.charAt(i) == ')'){
                        if(st.peek() == '('){
                            st.pop();
                        }else{
                            return 0;
                        }
                    }else if(A.charAt(i) == '}'){
                        if(st.peek() == '{'){
                            st.pop();
                        }else{
                            return 0;
                        }
                    }else if(A.charAt(i) == ']'){
                        if(st.peek() == '['){
                            st.pop();
                        }else{
                            return 0;
                        }
                    }
                }
            }
        }
        if(st.isEmpty()){
            return 1;
        }
        return 0;
    }
}
