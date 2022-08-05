public class AmazingSubArrays {

    public static void main(String[] args) {
        AmazingSubArrays as = new AmazingSubArrays();
        int count = as.solve("ABEC");
        System.out.println(count);
    }

    public int solve(String A) {
        /**
         We know that total subarrays starting from index i = (n-i)
         So simply check if A.charAt[i] == any vowels, then do sum = sum + (n-i);
         */
        int N = A.length();
        long M = 10003;
        long count = Long.valueOf(0);
        for(int i=0; i<N; i++){
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u' ||
                    A.charAt(i) == 'A' || A.charAt(i) == 'E' || A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U'){
                count = count + (N-i);
            }
        }
        return (int)(count%10003);
    }

    public int solve1(String A) {
        int N = A.length();
        long substringCount = Long.valueOf(N);
        long M = 10003;
        long count = Long.valueOf(0);
        for(int i=0; i<N; i++){
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' ||
                    A.charAt(i) == 'o' || A.charAt(i) == 'u' || A.charAt(i) == 'A' || A.charAt(i) == 'E' ||
                    A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U'){
                count = count+substringCount;
            }
            substringCount --;
        }
        return (int)(count%10003);
    }

//    public int solve(String A) {
//        int N = A.length();
//        long substringCount = Long.valueOf(N);
//        long M = 10003;
//        long count = Long.valueOf(0);
//        for(int i=0; i<N; i++){
//            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' ||
//                    A.charAt(i) == 'o' || A.charAt(i) == 'u' || A.charAt(i) == 'A' || A.charAt(i) == 'E' ||
//                    A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U'){
//                count = count+substringCount;
//            }
//            substringCount --;
//        }
//        return (int)(count%10003);
//    }

//    public int solve(String A) {
//        int N = A.length();
//        long substringCount = Long.valueOf(N);
//        long M = 10003;
//        long count = Long.valueOf(0);
//        for(int i=0; i<N; i++){
//            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' ||
//                    A.charAt(i) == 'o' || A.charAt(i) == 'u' || A.charAt(i) == 'A' || A.charAt(i) == 'E' ||
//                    A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U'){
//                count = count+substringCount;
//            }
//            substringCount --;
//        }
//        return (int)(count%10003);
//    }
}
