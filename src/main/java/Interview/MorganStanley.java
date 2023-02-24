package Interview;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MorganStanley<T> {
//    public static int temp1 = 1;
//    public static int temp2 = 2;
//    public int temp3 = 3;
//    public int temp4 = 4;
//
//    public static class Inner{
//        public static int temp5 = 5;
//
//        public static int getSum(){
//            return (temp1+temp2+temp3+temp4+temp5);
//        }
//
//    }
//    public static void main(String[] args) {
//        MorganStanley.Inner obj = new MorganStanley.Inner();
//        System.out.println(obj.getSum());
//    }


//    public void process(){
//        System.out.println("A");
//    }

//    private T t;
//    public void set(T t){
//        this.t = t;
//    }
//    public T get(){
//        return t;
//    }
//    public void inspect(U u){
//        System.out.println("T:" + t.getClass().getName());
//        System.out.println("U:" + u.getClass().getName());
//    }
//
//    public static void main(String[] args) {
//        MorganStanley<Integer> m = new MorganStanley<>();
//        m.set(10);
//        m.inspect(2);
//    }

    public static void main(String[] args) {
//        List<String> list  = new ArrayList<>(Arrays.asList("1","1","2"));
//        list.stream().filter(() -> {return "Ram";});

        List<List<String>> s = new ArrayList<>();
        s.add(new ArrayList<>(Arrays.asList("1","2","98","21","11")));
        s.add(new ArrayList<>(Arrays.asList("10","2332","9338","2331","110")));
        s.add(new ArrayList<>(Arrays.asList("31","221","948","241","112")));
        s.add(new ArrayList<>(Arrays.asList("15","232","298","241","141")));


    }


}

//class B extends MorganStanley{
//    public void process() throws IOException {
//        super.process();
//        System.out.println("B");
//        throw new IOException();
//    }
//
//    public static void main(String[] args) {
//        try {new B().process();}
//        catch (IOException e){
//            System.out.println("Exception");
//        }
//    }
//}
