package Interview;

public class MorningStar {

    public static void main(String[] args) {
        //Given an array of integers, every element appears twice except for Scaler.one.
        // Find that Scaler.one. 2,3,7,2,5,3,5
        //xor^0 = xor
        //2^2 = 0
        MorningStar m = new MorningStar();
        int[] arr = {2,3,7,2,5,3,5,7,6};
        System.out.println(m.findUniqueNumber(arr));
    }

    public int findUniqueNumber(int[] arr){
        int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor ^= arr[i];
        }
        return xor;
    }
}
