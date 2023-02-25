package ExecutorServicePractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//What should be the ideal Thread pool size:
//Thread pool uses the blocking queue because its a thread safe and concurrent
//it depends on the tasks we are going to perform:
//1. if its cpu intensive : int that case the work of thread is (fetch new tasks from queue and execute it) -> repeat this
//2. if its IO tasks : in that case you can have size of thread pool should be as large
//Types of Pools:
    //1. FixedThreadPool
    //1. CachedThreadPool
    //1. ScheduledThreadPool
    //1. SingleThreadedExecutor

public class ExecutorFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i=0; i<1000; i++){
            service.execute(new ExecutorTasks());
        }
        System.out.println("Thread name:"+Thread.currentThread().getName());
    }
}

class ExecutorTasks implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread name:"+Thread.currentThread().getName());
    }
}
