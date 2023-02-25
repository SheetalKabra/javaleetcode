package ExecutorServicePractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//this is same as fixedthreadPool, it also uses the blocking queue
//diff is: it has only one tasks in the queue
//and if in any case if thread is killed, then it recreates the thread
public class ExecutorSingleThreadedPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for(int i=0; i<100; i++){
            service.execute(new TasksSingleThreadedPool());
        }
    }
}

class TasksSingleThreadedPool implements Runnable{

    @Override
    public void run() {

    }
}
