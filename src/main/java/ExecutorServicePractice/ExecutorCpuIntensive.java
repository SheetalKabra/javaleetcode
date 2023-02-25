package ExecutorServicePractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorCpuIntensive {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);
        //submit the tasks for execution
        for (int k = 0; k < 100; k++) {
            service.execute(new CpuIntensive());
        }
    }
}

class CpuIntensive implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread method:"+Thread.currentThread().getName());
    }
}
