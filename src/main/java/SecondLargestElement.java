public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,0,1,8,8};
        int max = arr[0];
        int secmax = arr[1];

        if(arr[1] > arr[0]){
            max = arr[1];
            secmax = arr[0];
        }
        for(int i=2; i<arr.length; i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }
        }
        System.out.println(secmax);
    }
}
