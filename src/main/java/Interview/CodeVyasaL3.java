package Interview;

import java.util.*;

public class CodeVyasaL3 {
    //static block
    //unsupported exception: UnsupportedOperationException
    public static void main(String[] args) {
//        CodeVyasaL3 codeVyasaL3 = new CodeVyasaL3();
//        System.out.println(codeVyasaL3.isPalindrome("madam"));
       // isPalindrome("madam");
        //abcdef
        //fedcba
        //anagram -> hello -> olelh
        //h -> 1
        //e -> 1
        //l -> 2
        //o -> 1
        //System.out.println(isAnagram("hello", "olehh"));

        //List of words:
//        ["eat","tea","tan","ate","nat","bat"]
//        tae


        //["eat","tea","tan","ate","nat","bat"]
        //["aet","aet","ant","aet","ant","abt"]
        //aet->3
        //ant->2
        //abt->1


        //[["bat"],["nat","tan"],["ate","eat","tea"]]
        //TC: N*LengthOfString
        //SC: N*LengthOfString
        List<String> liststr = new ArrayList<>(Arrays.asList("eat","tea","tan","ate","nat","bat"));
        System.out.println(listOfAnagram(liststr));


    }

    private static boolean isPalindrome(String str){
        //madam
        int start = 0;
        int end = str.length() - 1;
        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static List<List<String>> listOfAnagram(List<String> listStr){
//        ["eat","tea","tan","ate","nat","bat"]
        List<List<String>> finalresult = new ArrayList<>();
        int len = listStr.size();
        for(int i=0; i<len; i++){
            if(!Objects.equals(listStr.get(i), "-1")){
                List<String> result = new ArrayList<>(Collections.singletonList(listStr.get(i)));
                //result.add(listStr.get(i));
                for(int j=i+1; j<len; j++){
                    if(!listStr.get(j).equals("-1") && isAnagram(listStr.get(i), listStr.get(j))){
                        result.add(listStr.get(j));
                        listStr.set(j, "-1");
                    }
                }
                finalresult.add(result);
            }

        }
        return finalresult;
    }

    private static boolean isAnagram(String str1, String str2){
        //hello
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 != len2){
            return false;
        }
        Map<Character, Integer> map1 = createMap(str1);
        Map<Character, Integer> map2 = createMap(str2);

        for(Map.Entry<Character, Integer> map : map1.entrySet()){
            Character key = map.getKey();
            Integer value = map.getValue();
            if(!(map2.containsKey(key) && Objects.equals(map2.get(key), value))){
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> createMap(String str){
        int len1 = str.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<len1; i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        return map;
    }
}
