public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int sum = 0;
        int count = 1;
        for(int i=A.length()-1; i>=0; i--){
            sum = sum + count*(A.charAt(i) - 'A' + 1);
            count = count*26;
        }
        return sum;
    }

    public static void main(String[] args) {
        ExcelColumnNumber e = new ExcelColumnNumber();
        System.out.println(e.titleToNumber("AB"));
        System.out.println(e.titleToNumber("ABCD"));
        System.out.println(e.titleToNumber("ZZZZZ"));
    }
}
