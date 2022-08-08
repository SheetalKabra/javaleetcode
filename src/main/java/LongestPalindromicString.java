public class LongestPalindromicString {

    public String longestPalindrome(String A) {
        int N = A.length();
        int l, c, r;
        int max = 1;
        int sum = 0;
        int maxl = 0, maxr = 0;
        for(int i=0; i<N; i++){
            c = i;
            l = i-1;
            r = i+1;
            while((l >= 0 && r <= N-1) && (A.charAt(l) == A.charAt(r))){
                //System.out.println("c:"+c+", l:"+l+", r:"+r);
                sum = r-l+1;
                if(sum > max){
                    max = sum;
                    maxl = l;
                    maxr = r;
                    //System.out.println("max:"+max+", maxl:"+maxl+", maxr:"+maxr);
                }
                l--;
                r++;
            }
        }
        //System.out.println("after odd:"+A.substring(maxl, maxr+1));
        for(int i=0; i<N; i++){
            l = i;
            r = i+1;
            while((l >= 0 && r <= N-1) && (A.charAt(l) == A.charAt(r))){
                //System.out.println("c:"+c+", l:"+l+", r:"+r);
                sum = r-l+1;
                if(sum > max){
                    max = sum;
                    maxl = l;
                    maxr = r;
                    //System.out.println("max:"+max+", maxl:"+maxl+", maxr:"+maxr);
                }
                l--;
                r++;
            }
        }
        //System.out.println("after even:"+A.substring(maxl, maxr+1));
        //System.out.println("max:"+max+", maxl:"+maxl+", maxr:"+maxr);
        return A.substring(maxl, maxr+1);
    }

    public static void main(String[] args) {
        LongestPalindromicString l = new LongestPalindromicString();
        System.out.println(l.longestPalindrome("bnmmnhjhg"));
    }
}
