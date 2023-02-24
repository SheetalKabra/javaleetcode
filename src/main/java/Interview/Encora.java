package Interview;

import java.util.*;

interface asbc{
    default void an(){
        System.out.println("sasad");
    }

    abstract void ana();
}

public class Encora {
    public static void main(String[] args) {
        String s="WelCome";

        //ascii - //65 to 90
        for(int i=0; i<s.length() ;i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                System.out.println(s.charAt(i));
            }
        }

        //100,14, 46, 100,89,47, 94, 94, 52, 86, 36, 94, 89
        int[] arr = {100,14, 46, 100,89,47, 94, 94, 52, 86, 36, 94, 89};
        int max = arr[0];
        int secmax = arr[1];
        if(arr[0] < arr[1]){
            max = arr[1];
            secmax = arr[0];
        }
        for(int i=2; i<arr.length; i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }else if(arr[i]>secmax && arr[i] != max){
                secmax = arr[i];
            }
        }
        System.out.println(secmax);


        Encora e = new Encora();

        e.solve();

    }

    private void solve(){
        String s="Bangalore";
        char[] ch = s.toCharArray();
        List<char[]> ch1 = Arrays.asList(ch);

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
//        for(Map.Entry<Character, Integer> entry : map.entrySet()){
//
//        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                System.out.println(s.charAt(i));
            }
        }

    }


}
