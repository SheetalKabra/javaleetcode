public class UnsetxbitsfromRight {

    public Long solve(Long A, int B) {
        for(int i=0; i<B; i++){
            A = A&(~(1<<i));
        }
        return A;
    }

    public static void main(String[] args) {
        UnsetxbitsfromRight u = new UnsetxbitsfromRight();
        System.out.println(u.solve(Long.valueOf(93), 4));
        System.out.println(u.solve(Long.valueOf(25), 3));
        System.out.println(u.solve(Long.valueOf(37), 3));
    }
}
