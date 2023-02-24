import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Scaler.abc", "def", "ghi", "jkl"));
        list.stream().filter((s) -> !s.equals("Scaler.abc")).forEach(System.out::println);

        List<Integer> data = new ArrayList<>(Arrays.asList(2,6,3,1,5));
//        data.stream().
//                filter((n) -> n%2 != 0).
//                sorted().
//                map((n) -> (n*2)).
//                forEach((n) -> System.out.println(n));

        System.out.println(data.stream().
                filter((n) -> n%2 != 0).
                sorted().
                map((n) -> (n*2)).
                reduce(0,(c,e)->c+e));

    }
}
