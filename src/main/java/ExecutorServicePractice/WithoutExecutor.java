package ExecutorServicePractice;

public class WithoutExecutor {

    public static void main(String[] args) {
//    this example is of single thread
//        Thread thread1 = new Thread(new Tasks());
//        thread1.start();
//        System.out.println("Thread name:"+Thread.currentThread().getName());


        //this example is of multiple thread
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new Tasks());
            thread.start();
        }
        System.out.println("Thread name:" + Thread.currentThread().getName());

    }
}

class Tasks implements Runnable{
    public void run(){
        System.out.println("Thread name:"+Thread.currentThread().getName());
    }
}
