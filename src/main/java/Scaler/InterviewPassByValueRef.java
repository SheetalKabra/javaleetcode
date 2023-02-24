package Scaler;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.*;
import java.util.stream.Stream;


public class InterviewPassByValueRef {
    public static void main(String[] args) {

        List<Object> a1 = new ArrayList<>();
        a1.add("22");
        a1.add("23");
        List<Object> a2 = a1;
        b(a2);
        System.out.println(a1.size());
        System.out.println(a2.size());
        System.out.println("a1:"+a1);
        System.out.println("a2:"+a2);

    }

    public static void b(List<Object> a1){
        a1.add("12");
        a1.add("21");
        a1.add("121");
    }

}
