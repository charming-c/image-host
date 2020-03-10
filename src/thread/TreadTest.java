package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TreadTest {
    public static void main(String [] args){
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            executorService.execute(new MyRunnable());
        }
//        shutdown()方法用于结束线程池中的全部线程
        executorService.shutdown();
    }
}
