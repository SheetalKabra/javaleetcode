package ExecutorServicePractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsIOIntensiveOperations {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(50);
        for(int i=0; i<100; i++){
            service.execute(new IOIntensive());
        }
        System.out.println("Thread name:"+Thread.currentThread().getName());
    }
}

class IOIntensive implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread name:"+Thread.currentThread().getName());
    }
}
