import java.util.ArrayList;
import java.util.Arrays;

public  class AddOneToTheNumber {

    public static void main(String[] args) {
        System.out.println(plusOne(new ArrayList<>(Arrays.asList(0))));
        System.out.println(plusOne(new ArrayList<>(Arrays.asList(1,2,3))));
        System.out.println(plusOne(new ArrayList<>(Arrays.asList(9,9,9))));
        System.out.println(plusOne(new ArrayList<>(Arrays.asList(1,2,9))));
        System.out.println(plusOne(new ArrayList<>(Arrays.asList(9))));
        System.out.println(plusOne(new ArrayList<>(Arrays.asList(0, 3, 7, 6, 4, 0, 5, 5, 5))));
        System.out.println(plusOne(new ArrayList<>(Arrays.asList(0, 6, 0, 6, 4, 8, 8, 1))));

//        AddOneToTheNumber a = new AddOneToTheNumber();
//        //int[] op = a.plusOne(new int[]{1,2,3});
//        //int[] op = a.plusOne(new int[]{9,9,9});
//        //int[] op = a.plusOne(new int[]{1,2,9});
//        int[] op = a.plusOne(new int[]{9});
//        for(int i=0;i<op.length;i++){
//            System.out.print(op[i]+", ");
//        }
    }
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int N = A.size();
        boolean addOne = true;
        int index = 0;
        while(A.get(index) == 0 ){
            A.remove(index);
            if(A.size() == 0){
                break;
            }
        }
       N = A.size();
        //System.out.println("N:"+N);
        for(int i=N-1; i>=0; i--){
            if(A.get(i) == 9){
                A.set(i, 0);
                addOne = true;
            }else{
                A.set(i, A.get(i)+1);
                addOne = false;
                break;
            }
        }
        if(addOne == true){
            A.add(0,1);
        }
        return A;
    }

    public  int[] plusOne(int[] A) {
        int N = A.length;
        boolean addOne = true;
        int index = 0;

        for(int i=N-1; i>=0; i--){
            if(A[i] == 9){
                A[i] = 0;
                addOne = true;
            }else{
                A[i] = A[i]+1;
                addOne = false;
                break;
            }
        }
        if(addOne == true){
            int[] B = new int[N+1];
            B[0] = 1;
            for(int i=1;i<=N;i++){
                B[i]=0;
            }
            return B;
        }
        return A;
    }



}
