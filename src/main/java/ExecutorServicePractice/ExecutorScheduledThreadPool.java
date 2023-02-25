package ExecutorServicePractice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//it uses delay queue
//Schedule the tasks to run based on time delay (and retrigger for fixed rate/ fixed delay)
public class ExecutorScheduledThreadPool {
    public static void main(String[] args) {
        //for scheduling of tasks
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        //tasks to run after 10 sec delay
        service.schedule(new TaskScheduledThreadPool(), 10, TimeUnit.SECONDS);
        //tasks to run repeatedly every 10 sec
        service.scheduleAtFixedRate(new TaskScheduledThreadPool(), 15, 10, TimeUnit.SECONDS);
        //tasks to run repeatedly 10 sec after previous tasks complete
        service.scheduleWithFixedDelay(new TaskScheduledThreadPool(), 15,10, TimeUnit.SECONDS);
    }
}

class TaskScheduledThreadPool implements Runnable{

    @Override
    public void run() {

    }
}
