package ExecutorServicePractice;

//CachedThreadPool:
//This time we don't have fixed size of thread pool.
//Also, we have synchronous queue rather than the blocking queue, because it holds only 1 tasks at a time.
//So, what synchronous queue will do: it will check into the thread pool,
            //if all threads are busy, then create a new thread for the tasks and place it in the pool
            //Also, Life Cycle: if thread is idle for 60 seconds (no task to execute) then kill the thread

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorCachedThreadPool {
    public static void main(String[] args) {
        //here we will not pass any number in newCachedThreadPool, as we are not sure about the numbers
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i=0; i<100; i++){
            service.execute(new TaskCachedThread());
        }
    }
}

class TaskCachedThread implements Runnable{
    @Override
    public void run() {

    }
}
