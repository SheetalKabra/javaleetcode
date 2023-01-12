import java.util.HashMap;

public class ScalerAd_DP1_WaysToDecode {
    public static void main(String[] args) {
//        char ch1 = '2';
//        char ch2 = '3';
//        int number = (ch1 - '0')*10 + (ch2- '0');
//        System.out.println(number);
//
//        //substring
//        String s = "1234";
//        System.out.println(s.substring(0, 1));
        ScalerAd_DP1_WaysToDecode s = new ScalerAd_DP1_WaysToDecode();
        System.out.println(s.numDecodings("102021"));
    }
    HashMap<String, Integer> dp = new HashMap<>();
    public int numDecodings(String A) {
        //if all the numbers are present in string from 1 to 9, then:
            //1. suppose we have 1234 -> combination(123) + (combination(12) if 34 <= 26)
            //lets take 123421 -> combination(12342) + combination(1234)
        //now what if we have 0's in the string:
            //1. if 0 is at 0th position, simply return 0;
            //2. if 0 is at ith position, and at (i-1)th position has either 1 or 2, then its a valid string else simply return 0
            //3. if you get 0, first of all you have to have to check the (i-1)th position
        if(A.charAt(0) == '0'){
            return 0;
        }
        return combination(A.length()-1, A);
    }

    public int combination(int i, String A){
        if (i == 0) {
            return 1;
        } else {
            if(dp.containsKey(A.substring(0, i+1))){
                return dp.get(A.substring(0, i+1));
            }
            if(A.charAt(i) == '0'){
                if(A.charAt(i-1) != '1' && A.charAt(i-1) != '2'){
                    dp.put(A.substring(0, i+1), 0);
                    return 0;
                }
            }
            int ans = 0;
            if(A.charAt(i)  != '0'){
                ans += combination(i-1, A);
            }

            int number = (A.charAt(i-1) - '0')*10 + (A.charAt(i) - '0');
            if(number <= 26 && A.charAt(i-1) != '0'){
                if(i>1){
                    ans += combination(i-2, A);
                }else{
                    ans += 1;
                }
            }
            dp.put(A.substring(0, i+1), ans);
            //System.out.println("dp:"+dp);
            return ans;
        }

    }


}
