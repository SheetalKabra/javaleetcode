import java.util.*;



public class LargestNumber {

    public String largestNumber(final List<Integer> A) {
        int N = A.size();
        ArrayList<String> strArray = new ArrayList<>();
        for(int i=0; i<N; i++){
            strArray.add(Integer.toString(A.get(i)));
        }
        Collections.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                return s2.compareTo(s1);
            }
        });
        StringBuffer s = new StringBuffer();
        int count = 0;
        for(int i=0;i<N;i++){
            s.append(strArray.get(i));
            if(Integer.parseInt(strArray.get(i)) == 0){
                count++;
            }
        }
        if(count == strArray.size()){
            return "0";
        }
        return s.toString();
    }

    public static void main(String[] args) {
        LargestNumber l = new LargestNumber();
//        System.out.println(l.largestNumber(new ArrayList<>(Arrays.asList(3,30,34,5,9))));
//        System.out.println(l.largestNumber(new ArrayList<>(Arrays.asList(2,3,9,0))));
        System.out.println(l.largestNumber(new ArrayList<>(Arrays.asList(0,0,0,0))));
    }
}
