package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@java.lang.FunctionalInterface
interface AfunctionaInterface{
    int add(int i, int j);
}

public class LambdaPractice {
    public static void main(String[] args) {
        AfunctionaInterface obj = Integer::sum;
        System.out.println(obj.add(5, 3));

        //method refrence
        List<String> list = new ArrayList<>(Arrays.asList("Manoj", "Shreya", "Priya", "Riya", "Nikhl"));
        Consumer<String> consumer = (s) ->  {System.out.println(s);};
        list.forEach((s) -> System.out.println(s));
    }




}
