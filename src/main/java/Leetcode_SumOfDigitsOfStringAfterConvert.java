public class Leetcode_SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        //System.out.println(getLucky("iiii", 1));
        //System.out.println(getLucky("zbax", 2));
        System.out.println(getLucky("leetcode", 2));
    }

    public static int getLucky(String s, int k) {
        int sum = 0;
        int ascii = 0;
        int rem = 0;
        for(int i=0; i<s.length(); i++){
            ascii = s.charAt(i) - 96;
            System.out.println("ascii="+ascii);
            while(ascii > 0){
                rem = ascii%10;
                ascii = ascii/10;
                sum = sum + rem;
            }
        }
        System.out.println(sum);
        int no = sum;

        //this for loop is for the transforms
        for(int i=2; i<=k; i++){
            sum = 0;
            while(no > 0){
                rem = no%10;
                no = no/10;
                sum = sum + rem;
            }
            no = sum;
        }
        return no;
    }
}
