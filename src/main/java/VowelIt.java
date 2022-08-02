public class VowelIt {

    public static void main(String[] args) {
        VowelIt v = new VowelIt();
        System.out.println(v.solve("interviewbit"));
    }

    public String solve(String A) {
        int N = A.length();
        String str = "";
        for(int i=0; i<N; i++){
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u'){
                str += A.charAt(i);
            }
        }
        return str;
    }
}
