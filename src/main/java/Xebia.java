import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Xebia {

    public static void main(String[] args) {
        String[] arr= {"banglore","pune","banglore"};
        System.out.println(String.valueOf(Arrays.stream(arr).collect(Collectors.groupingBy(
                Function.identity(),
                Akhil::new,
                Collectors.counting()
        ))));
        Arrays.stream(arr).collect(Collectors.groupingBy(
                Function.identity(),
                HashMap::new,
                Collectors.counting()
        ));
        //check duplicate elements are there or not
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,1,1,2,90,12,12,31));
        Set<Integer> set = list.stream().filter(e-> Collections.frequency(list, e) >1).collect(Collectors.toSet());
        System.out.println(set);

        //get the max from list using comparator:
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,1,1,2,90,12,12,31));
        int max = list1.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        //get the min from list using comparator:
        int min = list1.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min:"+min);

        //sort the array using stream
        List<Integer> sorted = list1.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted:"+sorted);



//        String test = "test";
//        test.substring()


        Xebia x = new Xebia();
        x.permutations("ABC");

    }

    private void permutations(String s){
        //ABC :
        //ABC, ACB, BCA, BAC, CAB, CBA
        char[] ch = new char[s.length()];

        for(int i=0; i< s.length(); i++){
            ch[i] = s.charAt(i);

        }
        int i=0;
        while(i<s.length()){
            StringBuilder sb = new StringBuilder();
            sb.append(ch);
            System.out.println(ch[0]+(sb.substring(1)));
            StringBuilder sb1 = new StringBuilder();
            sb1.append(ch[0]);
            sb1.append(reverse(sb.substring(1)));
            System.out.println(sb1);
            i++;
            if(i<s.length()){
                char temp = ch[0];
                ch[0] = ch[i];
                ch[i] = temp;
            }
        }

    }

    private char[] reverse(String str){
        int s = 0;
        int end = str.length()-1;
        char[] ch = new char[str.length()];

        for(int i=0; i< str.length(); i++){
            ch[i] = str.charAt(i);
        }
        while(s<end){
            char temp = ch[s];
            ch[s] = ch[end];
            ch[end] = temp;
            s++;
            end--;
        }
        return ch;
    }
}
