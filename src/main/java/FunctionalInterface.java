interface demo{
    void abc();
    default void show(){
        System.out.println("Show method of default, from interface");
    }

    static void def(){
        System.out.println("def method of static, from interface");
    }
}

public class FunctionalInterface implements demo {

    public void abc(){
        System.out.println("abc method of class, whose declaration is given in interface");
    }

    public void show(){
        System.out.println("Show method of default, from class");
    }

    public void def(){
        System.out.println("def method of static, from class");
    }

    public static void main(String[] args) {
        demo f = new FunctionalInterface();
        f.abc();
        f.show();
        demo.def();



    }

}
