package Scaler;

import java.util.Stack;

public class ScalerAd_Stack1_DoubleCharTrouble {
    public static void main(String[] args) {
        ScalerAd_Stack1_DoubleCharTrouble s = new ScalerAd_Stack1_DoubleCharTrouble();
        System.out.println(s.solve("abccbc"));
//        System.out.println(solve("abccb"));
//        System.out.println(solve("abcb"));
//        System.out.println(solve("ab"));
//        System.out.println(solve("abba"));
    }

    public String solve(String A) {
        int N = A.length();
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<N; i++){
            if(st.isEmpty()){
                st.push(A.charAt(i));
            }else if(A.charAt(i) == st.peek()){
                st.pop();
            }else{
                st.push(A.charAt(i));
            }
        }
        if(st.isEmpty()){
            return "";
        }
        char[] ch = new char[st.size()];
        int i = 0;
        while(st.size() > 0){
            ch[i] = st.peek();
            i++;
            st.pop();
        }
        String string = new String(ch);
        StringBuilder input1 = new StringBuilder();
        input1.append(string);
        input1.reverse();
        return input1.toString();
    }
}
