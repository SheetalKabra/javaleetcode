package Scaler;

public class ValidParantheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
//        System.out.println(isValid("()"));
//        System.out.println(isValid("{}"));
//        System.out.println(isValid("[]"));
//        System.out.println(isValid("(){}"));
//        System.out.println(isValid("(){}[]"));
//        System.out.println(isValid("(["));
//        System.out.println(isValid("(]"));
//        System.out.println(isValid("("));
    }

    public static boolean isValid(String s) {
        if(s.length() % 2 == 0){
            for(int i=1; i<s.length(); i=i+2){
                if(s.charAt(i-1) == '(' && s.charAt(i) != ')'){
                    return false;
                }else if(s.charAt(i-1) == '{' && s.charAt(i) != '}'){
                    return false;
                }else if(s.charAt(i-1) == '[' && s.charAt(i) != ']'){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
