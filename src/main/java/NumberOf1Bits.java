public class NumberOf1Bits {
    public static void main(String[] args) {
        NumberOf1Bits n = new NumberOf1Bits();
        System.out.println(n.numSetBits(81));
    }
    public int numSetBits(int A) {
        String binaryA = Integer.toBinaryString(A);
        int count =0;
        for(int i=0; i< binaryA.length(); i++){
            if(binaryA.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
