package Scaler;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ReverseTheString {
    public String solve(String A) {
        /**
         Firstly convert the string into char array
         and then Reverse the whole char array
         */
        int N = A.length();
        char temp;
        //convert String A into char array
        ArrayList<Character> Aarr = new ArrayList<>();
        for(int i=0; i<N; i++){
            if((i == 0 && A.charAt(i) == ' ') || (i == N-1 && A.charAt(i) == ' ') || (A.charAt(i) == ' ' &&  A.charAt(i-1) == ' ')){
                continue;
            }
            Aarr.add(A.charAt(i));
        }
        //System.out.println(Aarr);

        //reverse the whole char array Aarr
        int s = 0;
        int e = Aarr.size()-1;
        while(s<e){

            temp = Aarr.get(s);
            Aarr.set(s, Aarr.get(e));
            Aarr.set(e, temp);
            s++;
            e--;
        }
        //System.out.println(Aarr);
        //Now reverse the string until you get space.
        s=0;
        e=0;
        while(e<Aarr.size()){
            //System.out.println("inside");
            if(Aarr.get(e) == ' '){
                //System.out.println("s:"+s+", e:"+e);
                //System.out.println(e);
                reverse(Aarr, s, e-1);
                //System.out.println(Aarr);
                s = e+1;
                e = e+1;
            }else{
                e++;
            }
        }
        //System.out.println("outer loop s:"+s+", e:"+e);
        //to reverse the last part of char Aarr
        reverse(Aarr, s, e-1);
        //System.out.println(Aarr);
        return Aarr.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public void reverse(ArrayList<Character> partOfAarr, int s, int e){
        //System.out.println("reverse, s:"+s+", e:"+e);
        char temp;
        while(s<e){
            temp = partOfAarr.get(s);
            partOfAarr.set(s, partOfAarr.get(e));
            partOfAarr.set(e, temp);
            s++;
            e--;
        }
        //System.out.println("revese:"+partOfAarr);
    }

    public static void main(String[] args) {
        ReverseTheString r = new ReverseTheString();
        System.out.println(r.solve("crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv "));
    }
}
