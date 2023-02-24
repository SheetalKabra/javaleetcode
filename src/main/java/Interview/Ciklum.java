package Interview;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ciklum {
    private static final List<List<String>> task = List.of(
            List.of("1", "3", "99", "2", "14", "2"),
            List.of("111", "7", "199", "92", "14", "20"),
            List.of("10", "31", "9", "21", "243", "432"),
            List.of("31", "13", "999", "5", "41", "222"),
            List.of("10", "31", "401", "42", "11", "77")
    );

    public static Integer findMax(List<List<String>> list) {
        //need to check optional for flatmap
        int max = Integer.MIN_VALUE;
        System.out.println(list.stream().flatMap(Collection::stream).map(Integer::parseInt).max(Comparator.comparingInt(Integer::valueOf)).get());

        for(int i=0; i<task.size(); i++){
            //Optional<Integer> maxval = task.get(i).stream().map(Integer::parseInt).max(Comparator.comparingInt(Integer::valueOf));
            max = Math.max(max, task.get(i).stream().map(Integer::parseInt).max(Comparator.comparingInt(Integer::valueOf)).get());
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("max for task: " + findMax(task));
    }
}
