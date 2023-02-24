package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ScalerAd_Stack1_EvaluateExpression {
    public static void main(String[] args) {
//        System.out.println(evalRPN(new ArrayList<>(Arrays.asList("2", "1", "+", "3", "*"))));
//        System.out.println(evalRPN(new ArrayList<>(Arrays.asList("4", "13", "5", "/", "+"))));
        System.out.println(evalRPN(new ArrayList<>(Arrays.asList("2", "2", "/"))));
    }
    public static int evalRPN(ArrayList<String> A) {
        int N = A.size();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<N; i++){
            if(A.get(i).equals("-") || A.get(i).equals("+") || A.get(i).equals("*") || A.get(i).equals("/") ){
                int num2 = st.peek();
                st.pop();
                int num1 = st.peek();
                st.pop();
                String op = A.get(i);
                int exp = 0;
                switch(op){
                    case "-":
                        exp = num1 - num2;
                        st.push(exp);
                        break;
                    case "+":
                        exp = num1 + num2;
                        st.push(exp);
                        break;
                    case "*":
                        exp = num1 * num2;
                        st.push(exp);
                        break;
                    case "/":
                        exp = num1 / num2;
                        st.push(exp);
                        break;
                }
            }else{
                st.push(Integer.parseInt(A.get(i)));
            }
        }
        return st.peek();
    }
}
