import java.util.Stack;

public class ScalerAd_Queue2_MinStack {

    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> st1 = new Stack<>();
    public void push(int x) {
        st.push(x);
        if(st1.isEmpty()){
            st1.push(x);
        }else if(x < st1.peek()){
            st1.push(x);
        }else{
            st1.push(st1.peek());
        }
    }

    public void pop() {
        st.pop();
        st1.pop();
    }

    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }

    public int getMin() {
        return st1.peek();
    }

    public static void main(String[] args) {

        ScalerAd_Queue2_MinStack s = new ScalerAd_Queue2_MinStack();
        s.push(1);
        s.push(2);
        s.push(-2);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        System.out.println(s.top());
    }
}
