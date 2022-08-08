public class abc {
    public int kthMex(int n, int k, int arr[]) {
        int m = 0;
         int value=0;
         boolean isPresent = false;
         while(m<k){
             isPresent = false;
//             System.out.println("m"+m);
//             System.out.println("value:"+value);
             for(int i=0; i<n; i++){
                // System.out.println("arr:"+arr[i]+", value+"+value);

                 if(arr[i] == value){
                     isPresent = true;
                     break;
                 }
             }
            // System.out.println(isPresent);

             if(isPresent == false){
                 //System.out.println("valye:"+value);
                 m++;
             }
             value++;


//             if(value>100){
//                 System.exit(1);
//             }
         }
         return value-1;
    }

    public static void main(String[] args) {
        abc n = new abc();
        int[] a = new int[10];
        a[0] = 2;
//        a[1] = 13;
//        a[2] = 1;
//        a[3] = 19;
//        a[4] = 5;
//        a[5] = 0;
//        a[6] = 3;
//        a[7] = 12;
//        a[8] = 17;
//        a[9] = 9;
        System.out.println(n.kthMex(1,1, a));
    }
}
