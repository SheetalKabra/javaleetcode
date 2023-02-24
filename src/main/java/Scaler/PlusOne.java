package Scaler;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne p = new PlusOne();
//        int[] arr = p.plusOne(new int[]{4,3,2,2});
//        for(int i=0;i<arr.length; i++){
//            System.out.print(arr[i]+", ");
//        }
//        System.out.println("");
//        int[] arr1 = p.plusOne(new int[]{9});
//        for(int i=0;i<arr1.length; i++){
//            System.out.print(arr1[i]+", ");
//        }
        System.out.println("");
        int[] arr2 = p.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        for(int i=0;i<arr2.length; i++){
            System.out.print(arr2[i]+", ");
        }
//        System.out.println("=======");
//        int[] arr111 = p.plusOne1(new int[]{4,3,2,2});
//        for(int i=0;i<arr111.length; i++){
//            System.out.print(arr111[i]+", ");
//        }
//        System.out.println("");
//        int[] arr11 = p.plusOne1(new int[]{9});
//        for(int i=0;i<arr11.length; i++){
//            System.out.print(arr11[i]+", ");
//        }
//        System.out.println("");
//        int[] arr12 = p.plusOne1(new int[]{9,8,7,6,5,4,3,2,1,0});
//        for(int i=0;i<arr12.length; i++){
//            System.out.print(arr12[i]+", ");
//        }
    }

    public int[] plusOne1(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] returnArray = new int[digits.length+1];
        returnArray[0] = 1;
        return returnArray;
    }

    public int[] plusOne(int[] digits) {
        long sum = 0;
        for(int i=0; i< digits.length; i++){
            sum = sum*10 + digits[i];

        }
        sum = sum + 1;
        int count = 0;
        long number = sum;
        while(number != 0){
            number = number/10;
            count++;
        }
        int[] plusOneArray = new int[count];
        int rem;
        int i =count-1;
        while(sum != 0){
            rem = (int)(sum%10);
            sum = sum/10;
            plusOneArray[i] = rem;
            i--;
        }
        return plusOneArray;
    }
}
