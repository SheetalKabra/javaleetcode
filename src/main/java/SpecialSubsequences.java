public class SpecialSubsequences {
    public static void main(String[] args) {
        SpecialSubsequence ss = new SpecialSubsequence();
        System.out.println(ss.solve("AAAASSGGGGgDFSAAAASDSFDAAGGGGAAGAB"));
    }

    public int solve(String A) {
        int count = 0;
        int countOfG = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == 'G'){
                countOfG++;
            }
        }

        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == 'A'){
                count = count + countOfG;
            } else if(A.charAt(i) == 'G'){
                countOfG = countOfG - 1;
            }
        }
        return count%1000000007;
    }
}
