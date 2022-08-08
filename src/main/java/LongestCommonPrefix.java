import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LongestCommonPrefix {

    public String longestCommonPrefix1(ArrayList<String> A) {
        int N = A.size();
        if(N>1){
            //Now firstly take longest common prefix in b/w first two strings
            int k=0;
            ArrayList<Character> longestCommonPrefixArr = new ArrayList<>();
            int minLengthString = 0;
            if(A.get(0).length() > A.get(1).length()){
                minLengthString = A.get(1).length();
            }else{
                minLengthString = A.get(0).length();
            }
            //System.out.println(minLengthString);

            while(k<minLengthString && A.get(0).charAt(k) == A.get(1).charAt(k) ){
                longestCommonPrefixArr.add(A.get(0).charAt(k));
                k++;
            }
            //System.out.println(longestCommonPrefixArr);
            minLengthString = longestCommonPrefixArr.size();
            //now we have longest common prefix of first 2 strings
            //now apply for loop from 2 to N
            for(int i=2; i<N; i++){
                //System.out.println(A.get(i).length());
                if(A.get(i).length() < minLengthString){
                    minLengthString = A.get(i).length();
                    longestCommonPrefixArr.subList(minLengthString, longestCommonPrefixArr.size()).clear();
                }
                //System.out.println("==");
                //System.out.println(minLengthString);
                for(int j=0; j<minLengthString; j++){
//                    System.out.println(longestCommonPrefixArr.get(j) );
//                    System.out.println(A.get(i).charAt(j));
                    if(longestCommonPrefixArr.get(j) != A.get(i).charAt(j)){
                        longestCommonPrefixArr.subList(j, longestCommonPrefixArr.size()).clear();
                        if(longestCommonPrefixArr.size() == 0){
                            return "";
                        }
                    }
                }
            }
            //System.out.println("===");
            //System.out.println(longestCommonPrefixArr);
            return longestCommonPrefixArr.stream()              // Stream<Character>
                    .map(String::valueOf)   // Stream<String>
                    .collect(Collectors.joining());
        }else{
            return A.get(0);
        }
    }


    public String longestCommonPrefix(ArrayList<String> A) {
        int N = A.size();
        if(N == 0){
            return "";
        }
        int maxl = 0;
        int maxr = A.get(0).length()-1;
        for(int i=1; i<N; i++){
            if(A.get(i).length() < (maxr-maxl+1)){
                maxr = A.get(i).length()-1;
            }
            for(int j=maxl; j<maxr; j++){
                if(A.get(i).charAt(j) != A.get(i-1).charAt(j)){
                    maxr = j-1;
                    break;
                }
            }
        }
        //System.out.println("maxl:"+maxl+", maxr:"+maxr);
        return A.get(0).substring(maxl, maxr+1);
    }
    public static void main(String[] args) {
        LongestCommonPrefix l = new LongestCommonPrefix();
        System.out.println(l.longestCommonPrefix(new ArrayList<>(Arrays.asList("ABCD"))));
        System.out.println(l.longestCommonPrefix(new ArrayList<>(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaxxxaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" ))));
        System.out.println(l.longestCommonPrefix(new ArrayList<>(Arrays.asList("abcd", "abde", "abcf"))));
        System.out.println(l.longestCommonPrefix(new ArrayList<>(Arrays.asList("abcd", "bde", "abcf"))));
        System.out.println(l.longestCommonPrefix(new ArrayList<>(Arrays.asList("abcdefgh", "aefghijk", "abcefgh"))));
        System.out.println(l.longestCommonPrefix(new ArrayList<>(Arrays.asList("abcdefgh", "aefghijk", "wabcefgh"))));
        System.out.println(l.longestCommonPrefix(new ArrayList<>(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" ))));
    }
}
