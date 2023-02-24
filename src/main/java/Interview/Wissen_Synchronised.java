package Interview;

public class Wissen_Synchronised {
    public static void main(String[] args) {
        Wissen_Synchronised o1 = new Wissen_Synchronised();
        Wissen_Synchronised o2 = new Wissen_Synchronised();
//        o1.m1();
//        o2.m1();
        new Thread() {
            @Override
            public void run() {
                o1.m1();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                o2.m1();
            }
        }.start();
    }

    public synchronized void m1(){

        try{
            for(int i=0; i<10; i++){
                System.out.println("before thread"+this.hashCode());
            }
            //System.out.println("hiii in m1 before thread sleep"+this.hashCode());
            Thread.sleep(1000);
            for(int i=0; i<10; i++){
                System.out.println("after thread"+this.hashCode());
            }
            //System.out.println("hiii in m1 before after sleep"+this.hashCode());
        }catch (Exception e){
            System.out.println(e);
        }

    }
}


class Employee {
    String name;
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
           return  ((Employee) obj).name.equals(name);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}