
public class ReverseBits {
    public long reverse1(long a) {

        System.out.println(Long.toBinaryString(a));
        long[] binaryNum = new long[32];
        int i = 0;
        while(a > 0){
            binaryNum[i] = a%2;
            a = a/2;
            i++;
        }
        Long reversebit = Long.valueOf(0);
        int power = 0;
        for(int j=binaryNum.length-1 ;j>=0; j--){
            reversebit = reversebit + (long)Math.pow(2, power)*binaryNum[j];
            power++;
        }
        System.out.println(Long.toBinaryString(reversebit));
        return reversebit;
    }
    public long reverse2(long a) {
        System.out.println(Long.toBinaryString(a));
        for(int i=0; i<15; i++){
            //swap ith and (31-i)th bit.
            //swap only if ith and (31-i)th bit are different
            //1. for this check if ith bit is 0 or 1
            if((a&(1<<i)) != 0){
                //means ith bit is 1
                //swap only if 31-ith bit is 0
                if((a&(1<<31-i)) == 0){
                    //now set the 31-ith bit is set, and unset ith bit
                    a = (a|1<<(31-i));
                    a = (a&~(1<<i));
                }
            }else{
                //means ith bit is 0
                //swap only if 31-ith bit is 1
                if((a&(1<<31-i)) != 0){
                    //now set the 31-ith bit is unset, and set ith bit
                    a = (a|1<<(i));
                    a = (a&~(1<<(31-i)));
                }
            }
        }
        System.out.println(Long.toBinaryString(a));
        return a;
    }


    public long reverse3(long a) {
        //String s = Long.toBinaryString(a);
        int ans = 0;
        for(int i=0; i<32; i++){
            if((a&(1<<i)) != 0){
                int k = 31-i;
                ans = ans|(1<<(k));
            }
        }
        System.out.println(Long.toBinaryString(ans));
        return ans;
    }

    public static void main(String[] args) {
        ReverseBits r = new ReverseBits();
        //429496729
        //4294967296
        System.out.println(r.reverse1(Long.valueOf(5)));
        //System.out.println(r.reverse2((long)5));
        System.out.println(r.reverse3((long)5));
    }
}
