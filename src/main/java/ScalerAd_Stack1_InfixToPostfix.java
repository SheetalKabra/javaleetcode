import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ScalerAd_Stack1_InfixToPostfix {
    static Map<Character,Integer> precedenceMap = new HashMap<>();
    public static String solve(String A) {
        setPrecedence();
        int N = A.length();
        Stack<Character> st = new Stack<>();
        ArrayList<Character> ans = new ArrayList<>();
        //char[] ans = new char[N];
        for(int i=0; i<N; i++){
            if((int)A.charAt(i) >= 97 && (int)A.charAt(i)<= 122){
                ans.add(A.charAt(i));
            }else{
                if (precedenceMap.containsKey(A.charAt(i)) && A.charAt(i) != '(' && A.charAt(i) != ')') {
                    while(!st.empty() && precedence(st.peek()) >= precedence(A.charAt(i))){
                        ans.add(st.peek());
                        st.pop();
                    }
                    st.push(A.charAt(i));
                }else if(A.charAt(i) == '('){
                    st.push(A.charAt(i));
                }else if(A.charAt(i) == ')'){
                    //pop till we get opening bracket
                    while(st.peek() != '('){
                        ans.add(st.peek());
                        //ans[i] = st.peek();
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        while(!st.empty()){
            ans.add(st.peek());
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : ans) {
            sb.append(ch);
        }
        String string = sb.toString();
        return  string;
    }

    public static int precedence(char operator){
        return precedenceMap.get(operator);
    }

    public static void setPrecedence(){
        //char[] operator = new char[]{"(", "-", "+", "*", "/", "^"};
        precedenceMap.put('(', 0);
        precedenceMap.put('-', 1);
        precedenceMap.put('+', 1);
        precedenceMap.put('*', 2);
        precedenceMap.put('/', 2);
        precedenceMap.put('^', 3);
    }

    public static void main(String[] args) {
        System.out.println(solve("x^y/(a*z)+b"));
    }
}
