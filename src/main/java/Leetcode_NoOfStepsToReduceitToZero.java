public class Leetcode_NoOfStepsToReduceitToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            //check num is even or odd
            if((num&1) == 1){
                //num is odd
                //means, subtract by 1, and xor helps us to -1 if number is odd, else if num is even it will do +1
                num = num^1;
            }else{
                //num is even
                //means, divide by 2, right shift by 1 helps in divide by 2
                num = num>>1;
            }
            count++;
        }
        return count;
    }
}
