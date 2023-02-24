package Scaler;

public class isVowel {
    public static int isvowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(isvowel('A'));
        System.out.println(isvowel('B'));
        System.out.println(isvowel('C'));
        System.out.println(isvowel('D'));
        System.out.println(isvowel('E'));
        System.out.println(isvowel('U'));
        System.out.println(isvowel('F'));
        System.out.println(isvowel('O'));
        System.out.println(isvowel('G'));
        System.out.println(isvowel('I'));
        System.out.println();
        System.out.println(isvowel('a'));
        System.out.println(isvowel('b'));
        System.out.println(isvowel('c'));
        System.out.println(isvowel('d'));
        System.out.println(isvowel('e'));
        System.out.println(isvowel('f'));
        System.out.println(isvowel('g'));
        System.out.println(isvowel('i'));
        System.out.println(isvowel('o'));
        System.out.println(isvowel('u'));
    }
}
