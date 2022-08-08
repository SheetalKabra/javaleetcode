import java.util.*;

public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        int M = B.size();
        Map<Integer, Integer> freqOfAElements = new HashMap<>();
        Map<Integer, Integer> freqOfBElements = new HashMap<>();
        for(int i=0; i<N; i++){
            if(freqOfAElements.containsKey(A.get(i))){
                freqOfAElements.put(A.get(i), freqOfAElements.get(A.get(i))+1 );
            }else{
                freqOfAElements.put(A.get(i), 1);
            }
        }

        for(int i=0; i<M; i++){
            if(freqOfBElements.containsKey(B.get(i))){
                freqOfBElements.put(B.get(i), freqOfBElements.get(B.get(i))+1 );
            }else{
                freqOfBElements.put(B.get(i), 1);
            }
        }
        System.out.println(freqOfAElements);
        System.out.println(freqOfBElements);
        ArrayList<Integer> commonElements = new ArrayList<>();
        int key;
        int freq = 0;
        if(N>M){
            //traverse into freqOfAElements
            //Now goto every key of freqOfAElements
            for(Map.Entry<Integer, Integer> Aelements: freqOfAElements.entrySet()){
                key = Aelements.getKey();
                System.out.println(key);
                if(freqOfAElements.containsKey(key) && freqOfBElements.containsKey(key)){
                    freq = freqOfAElements.get(key) > freqOfBElements.get(key) ? freqOfBElements.get(key) : freqOfAElements.get(key);
                    for(int j=0; j<freq; j++){
                        commonElements.add(key);
                    }
                }

            }
        }else{
            //traverse into freqOfBElements
            //Now goto every key of freqOfBElements
            for(Map.Entry<Integer, Integer> Belements: freqOfBElements.entrySet()){
                key = Belements.getKey();
                System.out.println(key);
                if(freqOfAElements.containsKey(key) && freqOfBElements.containsKey(key)){
                    freq = freqOfAElements.get(key) > freqOfBElements.get(key) ? freqOfBElements.get(key) : freqOfAElements.get(key);
                    for(int j=0; j<freq; j++){
                        commonElements.add(key);
                    }
                    System.out.println(commonElements);
                }

            }
        }
        return commonElements;
    }

    public static void main(String[] args) {
        CommonElements c = new CommonElements();
//        System.out.println( c.solve(new ArrayList<>(Arrays.asList(1,2,2,1)), new ArrayList<>(Arrays.asList(2,3,1,2))) );
//        System.out.println( c.solve(new ArrayList<>(Arrays.asList(2,1,4,10)), new ArrayList<>(Arrays.asList(2,3,1,2))) );
        //System.out.println( c.solve(new ArrayList<>(Arrays.asList(8,15)), new ArrayList<>(Arrays.asList(10))) );
        System.out.println( c.solve(new ArrayList<>(Arrays.asList( 19, 19, 3, 5, 6)), new ArrayList<>(Arrays.asList(2, 8, 2, 12, 16, 3))) );
    }
}
