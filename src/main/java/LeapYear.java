public class LeapYear {
    public int solve(int A) {
        if (( A % 400 == 0) || ( A % 4 == 0 &&  A % 100 != 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        LeapYear l  = new LeapYear();
        System.out.println(l.solve(2000));
        System.out.println(l.solve(1999));
        System.out.println(l.solve(2024));
        System.out.println(l.solve(2021));
    }
}
