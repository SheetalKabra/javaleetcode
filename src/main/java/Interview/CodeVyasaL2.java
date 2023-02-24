package Interview;

class Parent {
    public void test() throws ArithmeticException{
        System.out.println("parent");
    }
}

class child extends Parent{
    public void test(){
        System.out.println("child");
    }
}

public class CodeVyasaL2 {
    public static void main(String[] args) {
        Parent p = new child();
        p.test();
    }
}





