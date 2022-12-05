import java.util.ArrayList;
import java.util.Stack;

public class ScalerAd_Stack_CheckTwoBracketExpression {
    public static void main(String[] args) {
        ScalerAd_Stack_CheckTwoBracketExpression s = new ScalerAd_Stack_CheckTwoBracketExpression();
//        System.out.println(s.solve("-(a+b+c)", "-a-b-c"));
//        System.out.println(s.solve("-(a-b-(c+d-(e-f)))", "-a+b+c+d-e+f"));
//        System.out.println(s.solve("a-b-(c-d)", "a-b-c-d"));
//        System.out.println(s.solve("(a+b-c-d+e-f+g+h+i)", "a+b-c-d+e-f+g+h+i"));
        System.out.println(s.solve("-(a+((b-c)-(d+e)))", "-(a+b-c-d-e)"));
    }

    public int solve(String A, String B) {
        ArrayList<Character> operandSign1 = getOperandSign(A, new ArrayList<Character>());
        ArrayList<Character> operandSign2 = getOperandSign(B, new ArrayList<Character>());
        if(operandSign1.equals(operandSign2)){
            return 1;
        }else{
            return 0;
        }
    }
    public ArrayList<Character> getOperandSign(String A, ArrayList<Character> operandSign) {
        for(int i=0; i<26; i++){
            operandSign.add(i,'+');
        }

        Stack<Character> st = new Stack<>();
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '('){
                if(i == 0){
                    st.push('+');
                }else{
                    //check at (i-1)th position and check peek of stack
                    //1. if stack in not empty
                    if(!st.isEmpty()){
                        if(A.charAt(i-1) != '-' && A.charAt(i-1) != '+'){
                            st.push(st.peek());
                        }else if(A.charAt(i-1) == '-' && st.peek() == '-'){
                            //1. (i-1)th = - and st.peek() = -, then push +
                            //System.out.println("here - -"+i);
                            st.push('+');
                        } else if(A.charAt(i-1) == '-' && st.peek() == '+'){
                            //2. (i-1)th = - and st.peek() = +, then push -
                            //System.out.println("here - +"+i);
                            st.push('-');
                        } else if(A.charAt(i-1) == '+' && st.peek() == '-'){
                            //3. (i-1)th = + and st.peek() = -, then push -
                            //System.out.println("here + -"+i);
                            st.push('-');
                        }else if(A.charAt(i-1) == '+' && st.peek() == '+'){
                            //4. (i-1)th = + and st.peek() = +, then push +
                            //System.out.println("here + +"+i);
                            st.push('+');
                        }
                    }else{
                        //push (i-1)th sign
                        st.push(A.charAt(i-1));
                    }
                }
            }else if(A.charAt(i) == ')'){
                st.pop();
            }else if(A.charAt(i) >= 'a' && A.charAt(i) <= 'z'){
                //if we get any operand, then check for their sign
                //if i == 0, then simply update + to the operandSign1 at (int)A.charAt(i) position
                if(i == 0){
                    int pos =  (int)A.charAt(i) - (int)'a';
                    operandSign.set(pos, '+');
                }else if(i != 0 && st.isEmpty()){
                    //else if i != 0, and if stack is empty, then simply update the (i-1)th sign at (int)A.charAt(i) position
                    int pos =  (int)A.charAt(i) - (int)'a';
                    operandSign.set(pos, A.charAt(i-1));
                }else if(!st.isEmpty()){
                    //if stack is not empty, then check below 4 conditions:
                    int pos =  (int)A.charAt(i) - (int)'a';
                    if(A.charAt(i-1) != '-' && A.charAt(i-1) != '+'){
//                        System.out.println("elem:"+A.charAt(i));
//                        System.out.println("st:"+st);
                        operandSign.set(pos, st.peek());
                    }else if(st.peek() == '-' && A.charAt(i-1) == '-'){
                        //1. st.peek() == '-' && at (i-1)th == '-', then udpate with +
                        operandSign.set(pos, '+');
                    }else if(st.peek() == '-' && A.charAt(i-1) == '+'){
                        //2. st.peek() == '-' && at (i-1)th == '+', then udpate with -
                        operandSign.set(pos, '-');
                    }else if(st.peek() == '+' && A.charAt(i-1) == '-'){
                        //3. st.peek() == '+' && at (i-1)th == '-', then udpate with -
                        operandSign.set(pos, '-');
                    }else if(st.peek() == '+' && A.charAt(i-1) == '+'){
                        //4. st.peek() == '+' && at (i-1)th == '+', then udpate with +
                        operandSign.set(pos, '+');
                    }
                }
            }
        }
        return operandSign;
    }
}
