public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        Rectangle r1 = new child1();
        r1.draw();
        child1 c1 = new child1();
        c1.draw();
    }
}


class Rectangle{
    public void draw(){
        System.out.println("parent class");
    }
}
class child1 extends Rectangle {
    public void draw() {
        System.out.println("child class");
    }
}


