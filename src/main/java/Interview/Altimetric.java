package Interview;

import java.util.*;

interface A{
    int x = 100;
}
public class Altimetric {
    public static void main(String[] args) {

//        Map<String, Long> noOfMaleAndFemaleEmployees=
//                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//
//        System.out.println(noOfMaleAndFemaleEmployees);
        double pickle = 2;
        int jar = (int) pickle;
        //String
//        A.x = 20;
//        System.out.println(A.x);
        //what are the predefined functional interfaces defined in java
        //what all are the immutable classes we have
        //Stream
        //Employee class - Name, Salary
        //5 objects, given name and salary to all
        //add all into arraylist
        //salary > 10000
//        List<Employee> emp = new ArrayList<>();
//        List emp = new ArrayList<>();
//
//
//
//        //<T> predicate -> Boolean test()
//        emp.stream.filter((emp) -> (emp.getSalary() > 10000)).collect(Collectors.toList());
//        //apply
//        emp.stream.map((emp) -> (emp.getName().toUpperCase()).collect(Collectors.toList());

        //HashSet
        //LinkedHashSet
        //TreeSet
        //2
        //1
        //3

        //ioc
        //@Autowired
        //


        //Exception class
        //steps of deployment:
        //
        int[] arr = {1, 2, 3, 1, 2, 3, 4, 5};
        //hashmap
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i], freq.get(arr[i])+1);
            }else{
                freq.put(arr[i], 1);
            }
        }
        System.out.println(freq);

        String s = "My name is Sheetal";
        char[] ch = s.toCharArray();
        int N = ch.length;
        System.out.println("ch:" + Arrays.toString(ch));
        int start = 0;
        int end = N-1;
        //char[] chrev = new char[ch.length];
        while(start <= end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        start = 0;
        for(int i=0; i<N; i++){

            if(ch[i] == ' '){
                //then I need to reve again
                end = i-1;
                while(start <= end){
                    char temp = ch[start];
                    ch[start] = ch[end];
                    ch[end] = temp;
                    start++;
                    end--;
                }
                start = i+1;
            }
        }
        end = N-1;
        while(start <= end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        System.out.println("ch rev:" + Arrays.toString(ch));







    }



    public void singlyLL(){

    }


}

class node123{
    int val;
    node123 next;

    public node123(int val){
        this.val = val;
        next = null;
    }
}


//interface A{
//    default void msg(){
//        //HI
//    }
//}
//
//interface B{
//    default void msg(){
//        //Hello
//    }
//}
//
//class Sample implements A,B{
//    psvmsa(){
//        new Sample().msg();
//    }
//}
//
//class Parent{
//    public void m1()throws AIOE{
//        //hi
//    }
//}
//
//class Child extends Parent{
//    @Override
//    public void m1() throws NPE {
//        //ok
//    }
//}

//classNotFound , NoSuchAClasDef
//serialize -> 1.8
//deserialize -> 1.5




