public class Interview_Accolite_Array {
    public static void main(String[] args) {
        int[] arr  = {5, 7, 8, 3, 2, 10, 4, 12};
        int k = 3;
        pairs(arr, k);
    }

    private static void pairs(int[] arr, int k){
        int N = arr.length;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(Math.abs(arr[i] - arr[j]) == k){
                    System.out.println(arr[i] +", "+ arr[j] );
                }
            }
        }
    }

//    private void m1(){
//        Set<Employee> set = new HashSet<>();
//        set.add(new Employee(1, "Sheetal"));
//        set.add(new Employee(1, "Sheetal"));
//        what will be the size it will print
//        System.out.println(set.size());
//    }

//    private void m2(){
//        List<Employee> list = new ArrayList<>();
//        list.add(new Employee(1, "John"));
//        list.add(new Employee(2, "Smith"));
//        list.add(new Employee(3, "Carl"));
//
//    }

}
